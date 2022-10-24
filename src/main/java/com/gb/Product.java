package com.gb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private int id;
    private String tittle;
    private float cost;

    public static List<Product> getTestProductList() {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            productList.add(new Product(i, "product"+i, 200+i*10));
        }
        return productList;
    }
}
