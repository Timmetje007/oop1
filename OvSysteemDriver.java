package ovSysteem;
import java.util.Scanner;
public class OvSysteemDriver {

	public static void main(String[] args) {
		boolean OvSysteemAan = true;
		String locatieInchecken;
		boolean incheckTijdControlen = false;
		Scanner scan = new Scanner(System.in);
		OvKaart mark = new OvKaart("Mark", 10, true);
		KaartLezer NijmegenCentraal = new KaartLezer("NijmegenCentraal", true);
		KaartLezer NijmegenHeyendaal = new KaartLezer("NijmegenHeyendaal", true);
		while(OvSysteemAan) {
			locatieInchecken = scan.next();
			locatieInchecken = locatieInchecken.toLowerCase();
		 	if(locatieInchecken.equals("nijmegencentraal") && mark.geldigReturnOvKaart() && !(mark.locatieReturnOvKaart() == "NijmegenCentraal") && !mark.ingecheckedReturnOvKaart()){
			mark.locatieOvKaart(NijmegenCentraal.locatieReturnKaartLezer());
			mark.ingecheckedOvKaart(true);
			incheckTijdControlen = true;
			}	else if(locatieInchecken.equals("nijmegenheyendaal") && mark.geldigReturnOvKaart() && !(mark.locatieReturnOvKaart() == "NijmegenHeyendaal") && !mark.ingecheckedReturnOvKaart()){ 
			mark.locatieOvKaart(NijmegenHeyendaal.locatieReturnKaartLezer());
			mark.ingecheckedOvKaart(true);
			incheckTijdControlen = true;
			}
		 	System.out.println(incheckTijdControlen);
		 	// uitchecken zelfde paal
		 	if(locatieInchecken.equals("nijmegencentraal") && mark.geldigReturnOvKaart() && (mark.locatieReturnOvKaart() == "NijmegenCentraal") && mark.ingecheckedReturnOvKaart() && !incheckTijdControlen){
			mark.locatieOvKaart("Uitgechecked");
			mark.ingecheckedOvKaart(false);
			}	else if(locatieInchecken.equals("nijmegenheyendaal") && mark.geldigReturnOvKaart() && (mark.locatieReturnOvKaart() == "NijmegenHeyendaal") && mark.ingecheckedReturnOvKaart() && !incheckTijdControlen){ 
			mark.locatieOvKaart("uitgechecked");
			mark.ingecheckedOvKaart(false);
			}
		 	//uitchecken andere paal
		 	if(locatieInchecken.equals("nijmegenheyendaal") && mark.geldigReturnOvKaart() && (mark.locatieReturnOvKaart() == "NijmegenCentraal") && mark.ingecheckedReturnOvKaart() && !incheckTijdControlen){
			mark.locatieOvKaart("Uitgechecked");
			mark.ingecheckedOvKaart(false);
			mark.betalen(2);
			}	else if(locatieInchecken.equals("nijmegencentraal") && mark.geldigReturnOvKaart() && (mark.locatieReturnOvKaart() == "NijmegenHeyendaal") && mark.ingecheckedReturnOvKaart() && !incheckTijdControlen){ 
			mark.locatieOvKaart("uitgechecked");
			mark.ingecheckedOvKaart(false);
			mark.betalen(2);
			
			}
		 	
		 	incheckTijdControlen = false;
		 	System.out.println(incheckTijdControlen);
		System.out.println(mark.locatieReturnOvKaart());
		} 
	}

}
