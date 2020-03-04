package io.hzy.jcartadministrationback.dto.out;

public class AdministratorListOutDTO {
    private Integer administratorIs;
    private String username;
    private Byte status;
    private Long createTimestamp;

    public Integer getAdministratorIs() {
        return administratorIs;
    }

    public void setAdministratorIs(Integer administratorIs) {
        this.administratorIs = administratorIs;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public void setAdministratorId(Integer administratorId) {
    }

    public void setRealName(String realName) {
    }
}
