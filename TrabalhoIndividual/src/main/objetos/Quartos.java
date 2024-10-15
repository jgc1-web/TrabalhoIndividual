package main.objetos;

public class Quartos {
private Integer numQuarto;
private String tipoQuarto;
private Double precoDia;
private Boolean Disponibilidade ;
public Integer getNumQuarto() {
	return numQuarto;
}
public void setNumQuarto(Integer numQuarto) {
	this.numQuarto = numQuarto;
}
public String getTipoQuarto() {
	return tipoQuarto;
}
public void setTipoQuarto(String tipoQuarto) {
	this.tipoQuarto = tipoQuarto;
}
public Double getPrecoDia() {
	return precoDia;
}
public void setPrecoDia(Double precoDia) {
	this.precoDia = precoDia;
}
public Boolean getDisponibilidade() {
	return Disponibilidade;
}
public void setDisponibilidade(Boolean disponibilidade) {
	Disponibilidade = disponibilidade;
}
public Quartos(Integer numQuarto, String tipoQuarto, Double precoDia, Boolean disponibilidade) {
	super();
	this.numQuarto = numQuarto;
	this.tipoQuarto = tipoQuarto;
	this.precoDia = precoDia;
	Disponibilidade = disponibilidade;
}

public String toString() {
	if (this.Disponibilidade==true) {
		return "Quartos [numQuarto=" + numQuarto + ", tipoQuarto=" + tipoQuarto + ", precoDia=" + precoDia
				+ ", Disponibilidade=Disponível"+ "]";
	}
	else {
		return "Quartos [numQuarto=" + numQuarto + ", tipoQuarto=" + tipoQuarto + ", precoDia=" + precoDia
				+ ", Disponibilidade=indisponível"+ "]";
	}
}
}

