/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com os dados do produto: ");
        
        System.out.print("Nome: ");
        String name = sc.nextLine();       
        System.out.print("Preço: ");
        double price = sc.nextDouble();                   
        Product product = new Product(name, price);
        
        //Alterando o nome com o metodo setName.Encapsulamento.
        //product.setName("Computador");
        //Acessando o valor alterado.Encapsulamento.
        //System.out.println("Nome atualizado: " + product.getName());
        //Alterando o preco.Encapsulamento.
        //product.setPrice(1200.00);
        //System.out.println("Preço atualizado: " + product.getPrice());
        
        System.out.println();
        
        System.out.println("dados do produto: " + product);
        System.out.println();
        
        System.out.print("entre com o numero de produtos para adicionar no estoque: ");
        int quantity = sc.nextInt();        
        product.addProducts(quantity);
        
        System.out.println();
        
        System.out.println("Dados atualizados: " + product);
        System.out.println();
        
        System.out.print("entre com o número para remover do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        
        System.out.println("Dados atualizados: " + product);
        
        sc.close();

    }
}
