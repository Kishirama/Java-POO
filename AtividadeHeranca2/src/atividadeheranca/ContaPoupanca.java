/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeheranca;

/**
 *
 * @author IFTM
 */
public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;
    
    
    public ContaPoupanca() {
        super();
        this.taxaJuros = 0.6; 
    }
    
    public double getTaxaJuros() {
        return taxaJuros;
    }
    
    public void setTaxaJuros(double taxaJuros) {
        if (taxaJuros >= 0.6 && taxaJuros <= 2.8) {
            this.taxaJuros = taxaJuros;
        } else {
            this.taxaJuros = 0.6; 
        }
    }
    public void aplicarJuros() {
        double juros = getSaldo() * (taxaJuros / 100);
        setSaldo(getSaldo() + juros);
        verificarSaldo();
    }
}