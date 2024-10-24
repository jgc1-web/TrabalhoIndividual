package main.objetos;


public class Reserva {


public Reserva(String nomeCliente, String dataCheckIn, String dataCheckOut, Quartos quarto) {
		super();
		this.nomeCliente = nomeCliente;
		this.dataCheckIn = dataCheckIn;
		this.dataCheckOut = dataCheckOut;
		this.quarto = quarto;
	}
private String nomeCliente;
private int quantQuartos;
private String dataCheckIn;
private String dataCheckOut;
private Quartos quarto;
public Quartos getQuarto() {
	return quarto;
}
public void setQuarto(Quartos quarto) {
	this.quarto = quarto;
}

public String getNomeCliente() {
	return nomeCliente;
}
public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}
public int getQuantQuartos() {
	return quantQuartos;
}
public void setQuantQuartos(int quantQuartos) {
	this.quantQuartos = quantQuartos;
}
public String getDataCheckIn() {
	return dataCheckIn;
}
public void setDataCheckIn(String dataCheckIn) {
	this.dataCheckIn = dataCheckIn;
}
public String getDataCheckOut() {
	return dataCheckOut;
}
public void setDataCheckOut(String dataCheckOut) {
	this.dataCheckOut = dataCheckOut;
}




}
