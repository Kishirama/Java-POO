/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeheranca;

/**
 *
 * @author IFTM
 */
public class Principal {
    public static void main(String[] args) {
        
        System.out.println("==== Contas Bancarias ====");
        
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setTitular("Antonio Silva");
        conta1.setSaldo(2000.0);
        conta1.setRendaMensal(3000.0);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setTitular("");
        conta2.setSaldo(500.0);
        conta2.setRendaMensal(2000.0);

        ContaBancaria conta3 = new ContaBancaria();
        conta3.setTitular("Angela Santos");
        conta3.setSaldo(2000.0);
        conta3.setRendaMensal(2500.0);
        
        System.out.println("\nConta 1:");
        conta1.verificarSaldo();
        conta1.depositar(500.0);
        conta1.sacar(200.0);
        conta1.sacar(1000.0);

        System.out.println("\nConta 2 (nome vazio):");
        conta2.verificarSaldo();

        System.out.println("\nConta 3:");
        conta3.verificarSaldo();


        System.out.println("\n==== Contas Poupanca ====");
     
        ContaPoupanca poupanca1 = new ContaPoupanca();
        poupanca1.setTitular("Andre Mendes");
        poupanca1.setSaldo(1000.0);
        poupanca1.setRendaMensal(2000.0);
        poupanca1.setTaxaJuros(1.5);

        ContaPoupanca poupanca2 = new ContaPoupanca();
        poupanca2.setTitular("Aline Pereira");
        poupanca2.setSaldo(2000.0);
        poupanca2.setRendaMensal(8000.0);
        poupanca2.setTaxaJuros(2.0);

        ContaPoupanca poupanca3 = new ContaPoupanca();
        poupanca3.setTitular("Paula Firmino");
        poupanca3.setSaldo(6000.0);
        poupanca3.setRendaMensal(10000.0);
        poupanca3.setTaxaJuros(3.0);

        System.out.println("\nPoupanca 1:");
        poupanca1.verificarSaldo();
        poupanca1.aplicarJuros();

        System.out.println("\nPoupanca 2:");
        poupanca2.verificarSaldo();
        poupanca2.aplicarJuros();
                

        System.out.println("\nPoupanca 3 (taxa invalida, ajustada para 0.6%):");
        poupanca3.verificarSaldo();
        System.out.println("Taxa de juros: " + poupanca3.getTaxaJuros());
        poupanca3.aplicarJuros();


        System.out.println("\n==== Contas Correntes ====\n");
        
        ContaCorrente corrente1 = new ContaCorrente();
        corrente1.setTitular("Lucas Almeida");
        corrente1.setSaldo(1000.0);
        corrente1.setRendaMensal(4000.0);
        
        System.out.println("\nCorrente 1:");
        corrente1.verificarSaldo();
        corrente1.sacar(1200.0);  
        corrente1.setLimiteEspecial(2500.0);
        corrente1.verificarSaldo();
        
        ContaCorrente corrente2 = new ContaCorrente();
        corrente2.setTitular("Antonio Lopes");
        corrente2.setSaldo(1200.0);
        corrente2.setRendaMensal(6000.0);
        
        System.out.println("\nCorrente 2:");
        corrente2.verificarSaldo();
        corrente2.sacar(500.0);  
        corrente2.setLimiteEspecial(3500.0);
        corrente2.verificarSaldo();

        ContaCorrente corrente3 = new ContaCorrente();
        corrente3.setTitular("Valerie Antonieta");
        corrente3.setSaldo(10000.0);
        corrente3.setRendaMensal(5000.0);
        
        System.out.println("\nCorrente 3:");
        corrente3.verificarSaldo();
        corrente3.sacar(8000.0);  
        corrente3.setLimiteEspecial(500.0);
        corrente3.verificarSaldo();
    }
}
        
        
    

