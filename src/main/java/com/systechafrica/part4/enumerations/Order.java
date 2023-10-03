package com.systechafrica.part4.enumerations;

import java.time.Instant;

public class Order {
    private  String id;
    private Instant datePlaced;
    private Double amount;

    private String shipmentAddress;

    private  OrderStatus orderStatus;

    public Order() {
    }

    public Order(Instant datePlaced, Double amount, String shipmentAddress, OrderStatus orderStatus) {
        this.datePlaced = datePlaced;
        this.amount = amount;
        this.shipmentAddress = shipmentAddress;
        this.orderStatus = orderStatus;
    }

    public Order(String id, Instant datePlaced, Double amount, String shipmentAddress, OrderStatus orderStatus) {
        this.id = id;
        this.datePlaced = datePlaced;
        this.amount = amount;
        this.shipmentAddress = shipmentAddress;
        this.orderStatus = orderStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instant getDatePlaced() {
        return datePlaced;
    }

    public void setDatePlaced(Instant datePlaced) {
        this.datePlaced = datePlaced;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getShipmentAddress() {
        return shipmentAddress;
    }

    public void setShipmentAddress(String shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", datePlaced=" + datePlaced +
                ", amount=" + amount +
                ", shipmentAddress='" + shipmentAddress + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
