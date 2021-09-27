package CovidTrackerManagement;

public abstract class Users {
    private String name;
    private String mobileNumber;
    private String pinCode;
    private String userId;
    private String userType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Users(String name, String mobileNumber, String pinCode, String userId, String userType) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.pinCode = pinCode;
        this.userId = userId;
        this.userType = userType;
    }




}
