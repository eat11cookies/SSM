package com.hxq.pojo;

public class Cinema {
    private int id;
    private String name;
    private String address;
    private float price;

    public Cinema(int id, String name, String address, float price) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.price = price;
    }

    public Cinema() {
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
