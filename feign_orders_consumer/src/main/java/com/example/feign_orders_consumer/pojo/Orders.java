package com.example.feign_orders_consumer.pojo;

public class Orders {
    private Integer id;
    private String remark;
    private Integer total;

    public Orders() {
    }

    public Orders(Integer id, String remark, Integer total) {
        this.id = id;
        this.remark = remark;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
