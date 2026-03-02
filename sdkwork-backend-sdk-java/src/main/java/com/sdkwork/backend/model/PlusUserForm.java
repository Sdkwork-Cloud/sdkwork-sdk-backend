package com.sdkwork.backend.model;

public class PlusUserForm {
    private String username;
    private String password;
    private String salt;
    private String email;
    private String phone;
    private String status;
    private List<Integer> roleIds;

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

    public String getSalt() {
        return this.salt;
    }
    
    public void setSalt(String salt) {
        this.salt = salt;
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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public List<Integer> getRoleIds() {
        return this.roleIds;
    }
    
    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }
}
