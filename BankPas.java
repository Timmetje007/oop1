package ovSysteem;

public class BankPas {
	private String naam;
	private int saldo;

	BankPas(String naam, int saldo){
		this.naam = naam;
		this.saldo = saldo;

	}
	public int betalen(int prijs) {
		saldo = saldo - prijs;
		return prijs;
	}
	public int saldoRekening() {
		return saldo;
	}

}
