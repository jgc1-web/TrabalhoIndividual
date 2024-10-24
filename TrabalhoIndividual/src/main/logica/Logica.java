package main.logica;


import java.util.ArrayList;
import java.util.Scanner;

import main.objetos.Quartos;
import main.objetos.Reserva;

public class Logica {
public static Scanner scan= new Scanner(System.in);
public static ArrayList<Quartos> listaQuartos = new ArrayList<Quartos>();
private static ArrayList<Reserva> reservas = new ArrayList<>();
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
	listaQuartos.add(quarto);
	
}
public static void listarQuartosDisponiveis() {
    System.out.println("Quartos disponíveis:");
    for (Quartos quarto : listaQuartos) {
        if (quarto.getDisponibilidade()) {
            System.out.println(quarto);
        }
    }
}
public static void removerQuarto() {
	System.out.println("digite o número do quarto (se houver dois com o msm número os dois seram removidos)");
	int num = scan.nextInt();
	int achou=0;
	for (int i = listaQuartos.size()-1; i >= 0; i--) {
	
		if (listaQuartos.get(i).getNumQuarto()==num) {
			System.out.println("quarto removido");
			listaQuartos.remove(i);
			achou=1;
		}
	}
	if (achou==0) {
		System.out.println("nenhum quarto com esse número ");
		
	}
	
}
public static void listarQuarto()
{
	for (Quartos quartos : listaQuartos) {
		System.out.println(quartos);
	}
}
public static void relatorioOcupacao() {
    System.out.println("Relatório de ocupação:");
    for (Reserva reserva : reservas) {
        System.out.println(reserva);
    }
}
public static void historicoReservas() {
    System.out.println("Nome do hóspede: ");
    String nome = scan.next();
    System.out.println("Histórico de reservas:");
    for (Reserva reserva : reservas) {
        if (reserva.getNomeCliente().equalsIgnoreCase(nome)) {
            System.out.println(reserva);
        }
    }
}
public static void cadastrarReserva() {
    System.out.println("Nome do hóspede: ");
    String nome = scan.next();
    System.out.println("Data de check-in : ");
    String checkIn = scan.next();
    System.out.println("Data de check-out : ");
    String checkOut = scan.next();

    listarQuartosDisponiveis();
    System.out.println("Escolha o número do quarto: ");
    int numeroQuarto = scan.nextInt();
    Quartos quartoReservado = null;

    for (Quartos quarto : listaQuartos) {
        if (quarto.getNumQuarto() == numeroQuarto && quarto.getDisponibilidade().equals(true)) {
            quartoReservado = quarto;
            quarto.setDisponibilidade(false); 
            break;
        }
    }

    if (quartoReservado != null) {
        Reserva reserva = new Reserva(nome, checkIn, checkOut,quartoReservado);
        reservas.add(reserva);
        System.out.println("Reserva cadastrada com sucesso!");
    } else {
        System.out.println("Quarto indisponível ou inexistente.");
    }
}
public static void mainReserva() {
	int a =21;
	while (a!=0){
	System.out.println("           ===Bem vindo===");
	System.out.println("===Para cadastrar um reserva digite 1===");
	System.out.println("===Para listar as reservas digite 2=====");
	System.out.println("===Para remover uma Reserva digite 3=====");
	System.out.println("       ===Para sair digite 0===");
	a=scan.nextInt();
	if (a==1) {
		cadastrarReserva();
	}
	 if (a==2) {
		listarReservas();
	}
	 if (a==3) {
		removerReserva();
	}
	 if (a==0) {
		System.out.println("Saindo ...");
	}
	}
}

public static void removerReserva() {
	System.out.println("digite o nome do cliente");
	String num = scan.next();
	int achou=0;
	for (int i = reservas.size()-1; i >= 0; i--) {
	
		if (reservas.get(i).getNomeCliente()==num) {
			System.out.println("reserva removido");
			reservas.remove(i);
			achou=1;
		}
	}
	if (achou==0) {
		System.out.println("nenhum cliente com esse nome");
		
	}
	
}
public static void listarReservas()
{
	for (Reserva quartos : reservas) {
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
