package com.example.db_barang.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private String name;
    private String category;
    private int stock;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    
    public void setUserId(int userId){
        this.userId =userId;
    }
    public int getUserId(){
        return userId;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    public int getStock(){
        return stock;
    }
}
