/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KISHIRAMA
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularBonus(String mesPagamento) {
        double salarioComBonus = this.salario;
        if (mesPagamento.equals("dezembro")) {
            salarioComBonus += salarioComBonus * 0.10;
        }
        System.out.println("Funcionario " + getNome() + ". Salario para o mes de " + mesPagamento +" : R$ " + salarioComBonus);
    }
}