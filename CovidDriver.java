package CovidTrackerManagement;

public class CovidDriver {

    public static void main(String[] args) {
        Users u1 = new NormalUser("rohit","9123456789","22901","ABC","Normal");
        Users u2 = new NormalUser("ravi","9123456709","2290001","XY12","Normal");
        Users u3 = new NormalUser("mohan","9123456989","2291001","YZ12","Normal");
        Users u4 = new NormalUser("sohan","9123456189","2290301","Ok12","Normal");

        CovidManager manager = new CovidManager();
        manager.registerUser(u1);
        UsersHealthDetails user1obj = new UsersHealthDetails("ABC", new String[]{"cold,cough,fever"},true,true);
        UsersHealthDetails user2obj = new UsersHealthDetails("XY12", new String[]{""},false,false);
        UsersHealthDetails user3obj = new UsersHealthDetails("YZ12", new String[]{"cold,cough"},false,true);
        manager.mapUserHealth(u1,user1obj);
        manager.mapUserHealth(u2,user2obj);
        manager.mapUserHealth(u3,user3obj);

        //double user1selfRisk = manager.selfAssesment(u1,user1obj);
       //double user2selfRisk = manager.selfAssesment(u2,user2obj);
        double user3selfRisk = manager.selfAssesment(u3,user3obj);
      // System.out.println("the risk assement of users are - user1 :"+user1selfRisk);
        //System.out.println("the risk assement of users are - user2 :"+user2selfRisk);
        System.out.println("the risk assement of users are - user3 :"+user3selfRisk);


     /*   Users Au1 = new AdminUsers("mahesh","912356789","2294001");
        Users Au2 = new AdminUsers("sonu","91456789","2295001");*/

    }
}
