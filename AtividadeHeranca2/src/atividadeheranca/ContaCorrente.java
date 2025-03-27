/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeheranca;

/**
 *
 * @author IFTM
 */
public class ContaCorrente extends ContaBancaria {
    private double limiteEspecial;

    public ContaCorrente() {
        super();
        this.limiteEspecial = calcularLimiteEspecial(getRendaMensal());
    }
    
    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        if (limiteEspecial <= calcularLimiteEspecial(getRendaMensal())) {
            this.limiteEspecial = limiteEspecial;
        } else {
            System.out.println("O limite especial excede 40% da renda mensal.");
        }
    }
    private double calcularLimiteEspecial(double rendaMensal) {
        return rendaMensal * 0.4;
    }
    public void sacar(double montante) {
        if (getSaldo() + limiteEspecial >= montante) {
            setSaldo(getSaldo() - montante);
            System.out.println("Saque efetuado com sucesso, usando o limite especial se necessario.");
        } else {
            System.out.println("Saldo insuficiente, mesmo com o limite especial.");
        }
        verificarSaldo();
    }
}

