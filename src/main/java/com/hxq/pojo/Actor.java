package com.hxq.pojo;

public class Actor {
    private String name;
    private int actorId;
    private String img;
    private String actorName;

    public Actor(String name, int actorId, String img, String actorName) {
        this.name = name;
        this.actorId = actorId;
        this.img = img;
        this.actorName = actorName;
    }

    public Actor() {
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", actorId=" + actorId +
                ", img='" + img + '\'' +
                ", actorName='" + actorName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
}
