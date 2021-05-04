package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException{
		
		KPSPublicSoapProxy kpsPublic =new KPSPublicSoapProxy();
			boolean result =kpsPublic.TCKimlikNoDogrula(
					Long.parseLong("tc numarasý"),
					"AD(BÜYÜK)",
					"SOYAD(BÜYÜK)",
					1990 // Doðum Yýlý
					);
					System.out.println("doðrulama : " + (result ? "baþarýlý" : "baþarýsýz"));
		

	}

}
