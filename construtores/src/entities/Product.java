/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 * @author Henrique
 */
public class Product {
    
    private String name;
    private double price;
    private int quantity;
    
    //Metodo construtor: obriga que o usuário incira os valores
    public Product(String name, double price, int quantity) {    
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // construtor sobrecarregado,ou seja,o nome repetido, mas com parametros diferentes.
    public Product(String name, double price) {
        this.name = name;
        this.price = price;   
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    //A quantidade de produtos, só pode ser alterada pelos metodos addP e removeP
    public int getQuantity() {
        return quantity;
    }
    
    public double totalValueInStock() {
        return price * quantity;
    }
    
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    
    public String toString() {
        return name
             + ", $ "
             + String.format("%.2f", price)
             + ", "
             + quantity
             + " units, Total: $ "
             + String.format("%.2f", totalValueInStock());
    }
    
}
