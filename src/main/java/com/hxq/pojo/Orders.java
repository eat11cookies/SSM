package com.hxq.pojo;

public class Orders {
    private String moviename;
    private String name;
    private String phone;
    private String value;
    private String ticketSeat;

    public Orders() {
    }

    public Orders(String moviename, String name, String phone, String value, String ticketSeat) {
        this.moviename = moviename;
        this.name = name;
        this.phone = phone;
        this.value = value;
        this.ticketSeat = ticketSeat;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "moviename='" + moviename + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", value='" + value + '\'' +
                ", ticketSeat='" + ticketSeat + '\'' +
                '}';
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTicketSeat() {
        return ticketSeat;
    }

    public void setTicketSeat(String ticketSeat) {
        this.ticketSeat = ticketSeat;
    }
}
