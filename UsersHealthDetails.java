package CovidTrackerManagement;

public class UsersHealthDetails {

    private String[] symptoms;

    public UsersHealthDetails(String userId ,String[] symptoms, boolean travelHistory, boolean contactWithCovidPatients) {
        this.symptoms = symptoms;
        this.travelHistory = travelHistory;
        this.contactWithCovidPatients = contactWithCovidPatients;
    }

    public String[] getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String[] symptoms) {
        this.symptoms = symptoms;
    }

    public boolean isTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public boolean isContactWithCovidPatients() {
        return contactWithCovidPatients;
    }

    public void setContactWithCovidPatients(boolean contactWithCovidPatients) {
        this.contactWithCovidPatients = contactWithCovidPatients;
    }

    private boolean travelHistory;
    private boolean contactWithCovidPatients;


}
