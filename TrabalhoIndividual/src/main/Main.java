package main;



import java.util.Scanner;

import main.logica.Logica;


public class Main {
public static  Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		 
		        
		        int opcao;
		        
		        do {
		            System.out.println("=== Menu Principal ===");
		            System.out.println("1. sistema quarto");
		            System.out.println("2. sistema reserva");
		            System.out.println("3. Relatório de ocupação");
		            System.out.println("4. Histórico de reservas por hóspede");
		            System.out.println("0. Sair");
		            opcao = scan.nextInt();
		            
		            switch (opcao) {
		                case 1:
		                    Logica.mainQuartos();;
		                    break;
		                case 2:
		                    Logica.mainReserva();
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
		        } while (opcao != 0);
		        
		    
		    
	      
	    }
	}

