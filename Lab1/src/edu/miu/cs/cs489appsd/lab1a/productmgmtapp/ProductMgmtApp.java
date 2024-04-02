package edu.miu.cs.cs489appsd.lab1a.productmgmtapp;

import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class ProductMgmtApp {
    public static void main(String[] args) {
        var product1 = new Product(3128874119L, "Banana", LocalDate.of(2023, 01, 24), 124, new BigDecimal("0.55"));
        var product2 = new Product(2927458265L, "Apple", LocalDate.of(2022, 12, 9), 18, new BigDecimal("1.09"));
        var product3 = new Product(9189927460L, "Carrot", LocalDate.of(2023, 03, 31), 89, new BigDecimal("2.99"));
        Product[] products = {product1, product2, product3};
        Arrays.sort(products, Comparator.comparing(Product::getName));
        System.out.println("Printing JSON format");
        for (Product product : products) {
            product.printJson();
        }
        System.out.println();
        System.out.println("Printing XML format");
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        for (Product produc : products) {
            produc.printSingleProduct(produc);
        }
        System.out.println();
        System.out.println("Printing CSV format");
        for (Product produc : products) {
            produc.printCsv();

        }
    }
}
