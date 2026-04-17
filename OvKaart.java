package ovSysteem;

public class OvKaart {
private String naam;
private String locatie;
private int saldo;
private boolean ingechecked;
private boolean geldig;


	OvKaart(String naam, int saldo, boolean geldig){
		this.naam = naam;
		this.saldo = saldo;
		this.geldig = geldig;
	}
	public void ingecheckedOvKaart(boolean ingechecked) {
		this.ingechecked = ingechecked;
	}
	public boolean ingecheckedReturnOvKaart() {
		return ingechecked;
	}
	public void locatieOvKaart(String locatie) {
		this.locatie =locatie;
	}
	public String locatieReturnOvKaart() {
		return locatie;
	}
	public boolean geldigReturnOvKaart() {
		return geldig;
	}
	public void betalen(int prijs) {
		saldo = saldo - prijs;
		System.out.println(saldo);
	}

}
