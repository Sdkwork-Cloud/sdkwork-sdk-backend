package com.sdkwork.backend.model;

public class LoginForm {
    private String type;
    private String email;
    private String phone;
    private String username;
    private String password;
    private String owner;
    private String captcha;
    private String captchaId;
    private Boolean rememberMe;
    private String verificationCode;
    private String invitationCode;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCaptcha() {
        return this.captcha;
    }
    
    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptchaId() {
        return this.captchaId;
    }
    
    public void setCaptchaId(String captchaId) {
        this.captchaId = captchaId;
    }

    public Boolean getRememberMe() {
        return this.rememberMe;
    }
    
    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getVerificationCode() {
        return this.verificationCode;
    }
    
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getInvitationCode() {
        return this.invitationCode;
    }
    
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }
}
