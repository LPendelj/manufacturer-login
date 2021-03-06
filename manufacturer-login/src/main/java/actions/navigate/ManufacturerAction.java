package actions.navigate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import actions.AbstractAction;
import model.Manufacturer;
import storage.ManufacturerStorage;
import webPath.Paths;


public class ManufacturerAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		ManufacturerStorage ms = new ManufacturerStorage();		
		
		String s = request.getParameter("pNumber");
		
		System.out.println(s);
		
		System.out.println("Pokrenuta manufacturer Akcija");
		
		
		Manufacturer manufacturer = ms.get(s);
		
		System.out.println(manufacturer);
		
		if (manufacturer!=null) {
			request.setAttribute("manufacturer", manufacturer);
			return Paths.PAGE_MANUFACTURER;
		}
		else {
			request.setAttribute("manufacturers", ms.getManufacturers());
			return Paths.PAGE_MANUFACTURERS_VIEW;
		}
		
		
		
	}
	
	

}
