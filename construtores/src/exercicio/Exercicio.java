/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import entidades_Exercicios.Entidades_Exercicio;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double deposito;
        
        System.out.print("Entre com o número da conta: ");
        int numeroConta = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Entre com o nome do cliente: ");
        String nome = sc.nextLine();
        
        System.out.print("Deseja entrar com um valor inicial (s/n)? ");
        char resposta = sc.next().charAt(0);
        System.out.println();
        
        if (resposta == 's') {
            
            System.out.print("Quanto deseja incerir no deposito: ");
            deposito = sc.nextDouble();
            
            Entidades_Exercicio EE = new Entidades_Exercicio(numeroConta, nome, deposito);            
            
            System.out.println("Dados atualizado: " + EE.toString());
            
            System.out.println();
            System.out.print("Entre com um valor de deposito: ");
            deposito = sc.nextDouble();
            EE.AdicionarDeposito(deposito);            
            System.out.println("Dados atualizados: " + EE.toString());
            
            System.out.println();
            System.out.print("Entre com um valor de saque: ");
            deposito = sc.nextDouble();
            EE.Saques(deposito);
            System.out.println("Dados atualizados: " + EE.toString());        
        }
        
        else if (resposta == 'n') {
            
            Entidades_Exercicio ee = new Entidades_Exercicio(numeroConta, nome);
            
            System.out.println("Dados atualizados: " + ee.toString());
            
            System.out.print("Entre com um valor de deposito: ");
            deposito = sc.nextDouble();
            ee.AdicionarDeposito(deposito);            
            System.out.println("Dados atualizados: " + ee.toString());
            
            System.out.println();
            System.out.print("Entre com um valor de saque: ");
            deposito = sc.nextDouble();
            ee.Saques(deposito);
            System.out.println("Dados atualizados: " + ee.toString());           
        }
               
        sc.close();
    }
}
