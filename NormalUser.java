package CovidTrackerManagement;

public class NormalUser extends Users {
    private String covidResult;


    public NormalUser(String name, String mobileNumber, String pinCode, String userId, String userType) {
        super(name, mobileNumber, pinCode, userId, userType);
    }


    public String getCovidResult() {
        return covidResult;
    }

    public void setCovidResult(String covidResult) {
        this.covidResult = covidResult;
    }

    public boolean isRecovered() {
        return recovered;
    }

    public void setRecovered(boolean recovered) {
        this.recovered = recovered;
    }

    private boolean recovered;


}
