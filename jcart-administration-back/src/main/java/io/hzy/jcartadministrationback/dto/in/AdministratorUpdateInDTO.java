package io.hzy.jcartadministrationback.dto.in;

public class AdministratorUpdateInDTO {
    private Integer administratorId;
    private String realName;
    private String password;
    private String email;

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getStstus() {
        return ststus;
    }

    public void setStstus(Byte ststus) {
        this.ststus = ststus;
    }

    private Byte ststus;



}
