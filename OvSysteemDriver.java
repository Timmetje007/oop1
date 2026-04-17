package ovSysteem;
import java.util.Scanner;
public class OvSysteemDriver {

	public static void main(String[] args) {
		boolean OvSysteemAan = true;
		String locatieInchecken;
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
			}	else if(locatieInchecken.equals("nijmegenheyendaal") && mark.geldigReturnOvKaart() && !(mark.locatieReturnOvKaart() == "NijmegenHeyendaal") && !mark.ingecheckedReturnOvKaart()){ 
			mark.locatieOvKaart(NijmegenHeyendaal.locatieReturnKaartLezer());
			mark.ingecheckedOvKaart(true);
			}
		 	
		 	if(locatieInchecken.equals("nijmegencentraal") && mark.geldigReturnOvKaart() && !(mark.locatieReturnOvKaart() == "NijmegenCentraal") && mark.ingecheckedReturnOvKaart()){
			mark.locatieOvKaart("Uitgechecked");
			mark.ingecheckedOvKaart(true);
			}	else if(locatieInchecken.equals("nijmegenheyendaal") && mark.geldigReturnOvKaart() && !(mark.locatieReturnOvKaart() == "NijmegenHeyendaal") && mark.ingecheckedReturnOvKaart()){ 
			mark.locatieOvKaart("uitgechecked");
			mark.ingecheckedOvKaart(true);
			}
		
		System.out.println(mark.locatieReturnOvKaart());
		} 
	}

}
