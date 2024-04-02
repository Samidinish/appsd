package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Product {
    private Long productId;
    private String name;
    private LocalDate dateSupplied;
    private Integer quantityInStock;
    private BigDecimal unitPrice;

    public Product(){

    }
   public Product(Long productId, String name, LocalDate dateSupplied, Integer quantityInStock, BigDecimal unitPrice){
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public Product(String name, LocalDate dateSupplied, Integer quantityInStock, BigDecimal unitPrice){
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }
    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return dateSupplied.format(formatter);
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    @Override
    public String toString() {
        return  "Product Id=" + productId +
                "Name='" + name + '\'' +
                "Date Supplied=" + dateSupplied +
                "Quantity In Stock=" + quantityInStock +
                "Unit Price=" + unitPrice +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
    // A method to print the product details In JSON format
    public void printJson(){
        System.out.printf("{\"productId\": %d, \"name\": \"%s\", \"dateSupplied\": " +
                "\"%s\", \"quantityInStock\": %d, \"unitPrice\": %s}\n",
                productId, name, dateSupplied, quantityInStock, unitPrice);
    }
    // A method to print the product details In XML format
    public void printSingleProduct(Product product) {
        System.out.println("<products>");
        System.out.printf("  <product productId=\"%d\" name=\"%s\" dateSupplied=\"%s\" quantityInStock=\"%d\" unitPrice=\"%.2f\" />\n",
                product.getProductId(), product.getName(), product.getDateSupplied(), product.getQuantityInStock(), product.getUnitPrice());
        System.out.println("</products>");
    }



    //A method to print the product details CSV format
    public void printCsv(){
        System.out.printf("%d,%s,%s,%d,%s\n", productId, name, dateSupplied, quantityInStock, unitPrice);
    }
}
