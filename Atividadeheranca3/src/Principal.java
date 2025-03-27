/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author KISHIRAMA
 */
public class Principal {
    public static void main(String[] args) {
      
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Michael Aljequicson");
        funcionario1.setSalario(3500.00);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Robson Aquino");
        funcionario2.setSalario(4000.00);

        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Lucas Silva");
        funcionario3.setSalario(5000.00);

        System.out.println("\n==== Funcionarios ====");
        funcionario1.calcularBonus("dezembro");
        funcionario2.calcularBonus("julho");
        funcionario3.calcularBonus("dezembro");

       
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Adriana Santos");
        gerente1.setSalario(7000.00);
        gerente1.setGratificacao(1000.00);

        Gerente gerente2 = new Gerente();
        gerente2.setNome("Neymar Junior");
        gerente2.setSalario(8000.00);
        gerente2.setGratificacao(1500.00);

        Gerente gerente3 = new Gerente();
        gerente3.setNome("Angelina Reis");
        gerente3.setSalario(9000.00);
        gerente3.setGratificacao(2000.00);

       
        System.out.println("\n==== Gerentes ====");
        gerente1.calcularBonus("dezembro");
        gerente2.calcularBonus("outubro");
        gerente3.calcularBonus("dezembro");

    
        Programador programador1 = new Programador();
        programador1.setNome("Roberto Lima");
        programador1.setSalario(6000.00);
        programador1.setValorPontoFuncao(80.00);

        Programador programador2 = new Programador();
        programador2.setNome("Fernanda Alves");
        programador2.setSalario(5500.00);
        programador2.setValorPontoFuncao(85.00);

        Programador programador3 = new Programador();
        programador3.setNome("Felipe Ferreira");
        programador3.setSalario(6500.00);
        programador3.setValorPontoFuncao(90.00);

        
        System.out.println("\n==== Programadores ====");
        programador1.calcularBonus("dezembro");
        programador1.calcularValorSoftware(200);
     
        programador2.calcularBonus("marco");
        programador1.calcularValorSoftware(300);
        
        programador3.calcularBonus("dezembro");
        programador1.calcularValorSoftware(150);
    }
}
