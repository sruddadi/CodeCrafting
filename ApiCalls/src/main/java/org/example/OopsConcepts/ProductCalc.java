package org.example.OopsConcepts;

class Product {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity) {
        return price * quantity;
    }
}

public class ProductCalc {
    public static void main(String[] args) {
        Product product = new Product();
        product.setPrice(100);
        double price = product.getPrice();
        double priceQuant = product.getPrice(5);
        System.out.println("Price: "+price);
        System.out.println("Price with quantity: "+priceQuant);
    }
}