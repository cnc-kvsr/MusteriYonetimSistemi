package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException{
		
		KPSPublicSoapProxy kpsPublic =new KPSPublicSoapProxy();
			boolean result =kpsPublic.TCKimlikNoDogrula(
					Long.parseLong("tc numaras�"),
					"AD(B�Y�K)",
					"SOYAD(B�Y�K)",
					1990 // Do�um Y�l�
					);
					System.out.println("do�rulama : " + (result ? "ba�ar�l�" : "ba�ar�s�z"));
		

	}

}
