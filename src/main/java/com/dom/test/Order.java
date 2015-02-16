package com.dom.test;

import java.util.Date;

public class Order implements java.io.Serializable{
 
private static final long serialVersionUID = 1L;
 
private int order_Id;
private String OrderType;
private String customerName;
private Date OrderDate;
 
public Order() {
}
 
public Order(int orderId, String OrderType, String customerName, Date OrderDate) {
    this.setOrder_Id(orderId);
    this.setOrderType(OrderType);
    this.setCustomerName(customerName);
    this.setOrderDate(OrderDate);
}
 
public int getOrder_Id() {
    return order_Id;
}
 
public void setOrder_Id(int orderId) {
this.order_Id = orderId;
}
 
public String getOrderType() {
    return OrderType;
}
 
public void setOrderType(String orderType) {
    OrderType = orderType;
}
 
public String getCustomerName() {
    return customerName;
}
 
public void setCustomerName(String customerName) {
    this.customerName = customerName;
}
 
public Date getOrderDate() {
    return OrderDate;
}
 
public void setOrderDate(Date orderDate) {
    OrderDate = orderDate;
}
 
}