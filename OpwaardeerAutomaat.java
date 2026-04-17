package ovSysteem;

public class OpwaardeerAutomaat {
	private int saldo;
	private int bedrag;
	OpwaardeerAutomaat(int saldo){
		this.saldo = saldo;
	}
	public int overZetten() {
		return bedrag;
	}
	public void bedragNaarAutomaat(int bedrag) {
		this.bedrag = bedrag;
		saldo = saldo + bedrag;
	}
	public void bedragVanAutomaatAf() {
		saldo = saldo - bedrag;
	}
	
}
