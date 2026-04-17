package ovSysteem;

public class KaartLezer {
	private String locatie;
	KaartLezer(String locatie, boolean geldig){
		this.locatie = locatie;
		
	}
	
	
	
	public String locatieReturnKaartLezer() {
		return locatie;
	}
}
