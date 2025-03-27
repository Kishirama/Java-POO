/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeheranca;

/**
 *
 * @author IFTM
 */
public class ContaBancaria {
    private String titular;
    private double saldo;
    private double rendaMensal;
    

    private static final double SALARIO_MINIMO = 1512.00;
    
    public ContaBancaria() {
        this.titular = "não identificado";
        this.saldo = 0.0;
        this.rendaMensal = 2 * SALARIO_MINIMO;
    }
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        if (titular != null && !titular.equals("")) {
            this.titular = titular;
        } else {
            this.titular = "nao identificado";
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getRendaMensal() {
        return rendaMensal;
    }
    
    public void setRendaMensal(double rendaMensal) {
        if (rendaMensal >= 2 * SALARIO_MINIMO) {
            this.rendaMensal = rendaMensal;
        } else {
            this.rendaMensal = 2 * SALARIO_MINIMO;
        }
    }
    
    public void depositar(double montante) {
        this.saldo += montante;
        verificarSaldo();
    }
    
    public void sacar(double montante) {
        if (this.saldo >= montante) {
            this.saldo -= montante;
            System.out.println("\nSaque efetuado com sucesso");
        } else {
            System.out.println("\nSaldo insuficiente");
        }
        verificarSaldo();
    }
    
    public void verificarSaldo() {
        System.out.println("O saldo na conta de " + this.titular + " e: R$" + this.saldo);
    }
}
