package ovSysteem;

public class KaartLezer {
	private String locatie;
	private boolean alIngechecked;
	private int prijs;
	KaartLezer(String locatie, boolean geldig){
		this.locatie = locatie;
		
	}
	
	
	
	public String locatieReturnKaartLezer() {
		return locatie;
	}
}
