package main.logica;


import java.util.ArrayList;
import java.util.Scanner;

import main.objetos.Quartos;

public class LogicaQuartos {
public static Scanner scan= new Scanner(System.in);
public static ArrayList<Quartos> lista = new ArrayList<Quartos>();
public static void cadastrar () {
	System.out.println("Digite o número do quarto ");
	Quartos quarto = new Quartos(null, null, null, null); 
	quarto.setNumQuarto(scan.nextInt());
	Boolean b= true;
	while (b==true ) {

		
	
	System.out.println("Digite 1 para cadastrar um quarto de solteiro 2-casal 3- suite ");
	int a=scan.nextInt();
	switch (a) {
	case 1: {
		
	quarto.setTipoQuarto("Solteiro");
	b=false;
	break;
	}
	case 2: {
		
		quarto.setTipoQuarto("Casal");
		b=false;break;

		}
	case 3: {
		
		quarto.setTipoQuarto("Suite");
		b=false;break;

		}
	default:
		System.out.println("erro no número digite novamente ");break;
}

	}
	System.out.println("Digite o preço do dia ");
	quarto.setPrecoDia(scan.nextDouble());
	quarto.setDisponibilidade(true);
	lista.add(quarto);
	
}
public static void removerQuarto() {
	System.out.println("digite o número do quarto (se houver dois com o msm número os dois seram removidos)");
	int num = scan.nextInt();
	int achou=0;
	for (int i = lista.size()-1; i >= 0; i--) {
	
		if (lista.get(i).getNumQuarto()==num) {
			System.out.println("quarto removido");
			lista.remove(i);
			achou=1;
		}
	}
	if (achou==0) {
		System.out.println("nenhum quarto com esse número ");
		
	}
	
}
public static void listarQuarto()
{
	for (Quartos quartos : lista) {
		System.out.println(quartos);
	}
}
public static void mainQuartos() {
	int a =21;
	while (a!=0){
	System.out.println("           ===Bem vindo===");
	System.out.println("===Para cadastrar um quarto digite 1===");
	System.out.println("===Para listar os quartos digite 2=====");
	System.out.println("===Para remover um quarto digite 3=====");
	System.out.println("       ===Para sair digite 0===");
	a=scan.nextInt();
	if (a==1) {
		cadastrar();
	}
	 if (a==2) {
		listarQuarto();
	}
	 if (a==3) {
		removerQuarto();
	}
	 if (a==0) {
		System.out.println("Saindo ...");
	}
	}
}

}
