package io.hzy.jcartadministrationback.dto.in;

public class OrderHistoryCreateInDTO {
    private Long orderId;
    private Byte orderStatus;
    private String comments;
    private Boolean customerMotified;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getCustomerMotified() {
        return customerMotified;
    }

    public void setCustomerMotified(Boolean customerMotified) {
        this.customerMotified = customerMotified;
    }
}
