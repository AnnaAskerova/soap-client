package com.example.service.client.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "items")
public class ItemModel {
    @Id
    private long id;
    private String name;

    public ItemModel(String name) {
        this.name = name;
    }

    public ItemModel(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ItemModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemModel itemModel = (ItemModel) o;
        return id == itemModel.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

