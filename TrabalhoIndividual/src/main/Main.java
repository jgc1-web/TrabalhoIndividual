package main;



import java.util.Scanner;

import main.logica.Logica;


public class Main {
public static  Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
        
        int opcao=233;
        
        while (opcao != 0); {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Sistema de quartos");
            System.out.println("2. sistema de reservas reserva");
            System.out.println("3. Relatório de ocupação");
            System.out.println("4. Histórico de reservas por hóspede");
            System.out.println("0. Sair");
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 1:
                    Logica.mainQuartos();
                    break;
                case 2:
                    Logica.listarReservas();
                    break;
                case 3:
                    Logica.relatorioOcupacao();
                    break;
                case 4:
                    Logica.historicoReservas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } 
        
      
    }
}
