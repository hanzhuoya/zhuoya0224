package io.hzy.jcartadministrationback.dto.out;

public class OrderHistoryListOutDTO {
    private Long orderHistrtoryId;
    private Long timestamp;
    private Byte orderStatus;
    private String comment;
    private Boolean customerNotified;

    public Long getOrderHistrtoryId() {
        return orderHistrtoryId;
    }

    public void setOrderHistrtoryId(Long orderHistrtoryId) {
        this.orderHistrtoryId = orderHistrtoryId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getCustomerNotified() {
        return customerNotified;
    }

    public void setCustomerNotified(Boolean customerNotified) {
        this.customerNotified = customerNotified;
    }

    public void setOrderHistoryId(Long orderHistoryId) {
    }
}
