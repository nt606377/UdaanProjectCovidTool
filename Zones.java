package CovidTrackerManagement;

public enum Zones {

      GREEN,RED,DEFAULT,ORANGE;
      private String zone = null;


      public static String Zonal(String numbers)
      {
          String zoneResult = "";
          if(Integer.parseInt(numbers)>5)
          {
             zoneResult = RED.zone;
          }
          else if(Integer.parseInt(numbers)<5)
          {
            zoneResult = ORANGE.zone;
          }
          else
          {
              zoneResult = GREEN.zone;
          }
          return zoneResult;

    }
}
