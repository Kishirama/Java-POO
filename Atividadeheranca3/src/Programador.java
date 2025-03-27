/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KISHIRAMA
 */
public class Programador extends Funcionario {
    private double valorPontoFuncao;

    public double getValorPontoFuncao() {
        return valorPontoFuncao;
    }

    public void setValorPontoFuncao(double valorPontoFuncao) {
        this.valorPontoFuncao = valorPontoFuncao;
    }
    public void calcularValorSoftware(int linhasCodigo){
        
        double valorSoftware = this.valorPontoFuncao * linhasCodigo;
        System.out.println("Valor do software a ser desenvolvido: R$" + valorSoftware);
    }
   
}