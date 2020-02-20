package com.example.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootdemo.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
