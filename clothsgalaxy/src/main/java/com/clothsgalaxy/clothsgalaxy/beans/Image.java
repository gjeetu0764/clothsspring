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
    private Double cost;
    private String url;

    public Image() {
    }

    public Image(int id, String name, double cost, String url) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image [id=" + id + ", name=" + name + ", cost=" + cost + ", url=" + url + "]";
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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
