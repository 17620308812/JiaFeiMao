package jfm.common.user;

public class User {
    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户昵称
     */
    private String userNickName;
    /**
     * 用户头像
     */
    private String userHeaderImg;

    /**
     * 注册日期
     */
    private int userRegisterDate;
    /**
     * 注册时间
     */
    private int userRegisterTime;
    /**
     * 状态 状态 0正常 1冻结
     */
    private String status;
    /**
     * 手机号
     */
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserRegisterDate() {
        return userRegisterDate;
    }

    public void setUserRegisterDate(int userRegisterDate) {
        this.userRegisterDate = userRegisterDate;
    }

    public int getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(int userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserHeaderImg() {
        return userHeaderImg;
    }

    public void setUserHeaderImg(String userHeaderImg) {
        this.userHeaderImg = userHeaderImg;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }
}
