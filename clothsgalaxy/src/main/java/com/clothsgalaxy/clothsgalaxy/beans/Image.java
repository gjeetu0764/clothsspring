package com.clothsgalaxy.clothsgalaxy.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Image {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String cost;
    private String url;

    public Image() {
    }

    public Image(int id, String name, String cost, String url) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {

        this.cost = cost;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        System.out.println("url" + url);
        String location = "/css/images/" + url;
        this.url = location;
    }
}
