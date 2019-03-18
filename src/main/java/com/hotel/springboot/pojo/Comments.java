package com.hotel.springboot.pojo;


//评论表
public class Comments {
    private String Id;
    private String text;

    @Override
    public String toString() {
        return "Comments{" +
                "Id='" + Id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
