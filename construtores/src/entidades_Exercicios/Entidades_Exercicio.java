/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_Exercicios;
/**
 *
 * @author Henrique
 */
public class Entidades_Exercicio {
    
    private int numeroConta;
    private String nome;
    private double deposito;
    
    public Entidades_Exercicio(int numeroConta, String nome, double deposito) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.deposito = deposito;
    }
    
    public Entidades_Exercicio(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getDeposito() {
        return deposito;
    }
    
    public void AdicionarDeposito(double deposito) {
        this.deposito += deposito;
    }
    
    public void Saques(double deposito) {
        this.deposito -= (deposito + 5.00);
    }
    
    public String toString() {
        return ("Número da conta: ") + numeroConta
            +(", ") + ("Nome: ") + nome
            +(", ") + String.format("Deposito: $ %.2f ", deposito);
    }  
}

