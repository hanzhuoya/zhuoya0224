package io.hzy.jcartadministrationback.dto.in;

public class ReturnHistoryCreateInDTO {
    private Integer returnId;
    private Byte returnStatus;
    private Boolean customerNotified;
    private String comment;

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Byte getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }

    public Boolean getCustomerNotified() {
        return customerNotified;
    }

    public void setCustomerNotified(Boolean customerNotified) {
        this.customerNotified = customerNotified;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
