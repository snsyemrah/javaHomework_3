package javaCampDay4Homework3;

import java.rmi.RemoteException;

import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter extends GamerValidationManager{

	@Override
	
	public boolean gamerValidate(Gamer gamer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		boolean result = true;
		
		try {
			
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					
				gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
		
		} catch (RemoteException e) {
			e.printStackTrace();
			
		}
		
		return result;
		
	}

}
