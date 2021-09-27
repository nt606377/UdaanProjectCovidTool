package CovidTrackerManagement;

import PracticeSplitWise.User;

import java.util.HashMap;
import java.util.List;

public class CovidManager {

      List<Users> users;

      HashMap<String,Users> userMap = new HashMap<>();
      HashMap<String,UsersHealthDetails> userHealthMap = new HashMap<>();


      public void registerUser(Users u1)
      {
         if(u1.getUserType()=="Normal")
         {
               userMap.put(u1.getUserId(),u1);
         }
      }

      public void mapUserHealth(Users u1,UsersHealthDetails usersHealthDetails)
      {
            userHealthMap.put(u1.getUserId(),usersHealthDetails);
      }



      public double selfAssesment(Users u ,UsersHealthDetails usersHealthDetails)
      {
            double result = 0.0;
           if(usersHealthDetails.isContactWithCovidPatients()==true && usersHealthDetails.isTravelHistory()==true && usersHealthDetails.getSymptoms()[0].length()>2)
           {
                 System.out.println("95% is the risk assesment");
                 result = 95.0;
           }
           else if(usersHealthDetails.isContactWithCovidPatients()==true && usersHealthDetails.isTravelHistory()==true &&usersHealthDetails.getSymptoms()[0].length()>2 )
           {
                 System.out.println("75% is the risk assesment");
                 result =  75.0;
           }
            else if(usersHealthDetails.isContactWithCovidPatients()==false || usersHealthDetails.isTravelHistory()==true &&usersHealthDetails.getSymptoms()[0].length()==2 )
            {
                  System.out.println("50% is the risk assesment");
                  result =  50.0;
            }
           else if(usersHealthDetails.isContactWithCovidPatients()==true || usersHealthDetails.isTravelHistory()==false &&usersHealthDetails.getSymptoms()[0].length()==2 )
           {
                 System.out.println("50% is the risk assesment");
                 result =  50.0;
           }
             else if(usersHealthDetails.isContactWithCovidPatients()==false && usersHealthDetails.isTravelHistory()==false&& usersHealthDetails.getSymptoms()[0].length()<2 )
            {
                  System.out.println("5% is the risk assesment");
                  result =  5.0;
            }
             return result;


      }

      /*public String getZoneInfo()
      {

      }*/


}
