package actions.navigate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import actions.AbstractAction;
import model.Manufacturer;
import storage.ManufacturerStorage;
import webPath.Paths;

public class ManufacturerEditAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {

ManufacturerStorage ms = new ManufacturerStorage();		
		
		String s = request.getParameter("pNumber");
		
		System.out.println(s);
		
		System.out.println("Pokrenuta ManufacturerEditAction");
		
		Manufacturer manufacturer = ms.get(s);
		
		System.out.println(manufacturer);
		
		if (manufacturer!=null) {
			request.setAttribute("manufacturer", manufacturer);
			return Paths.PAGE_MANUFACTURER_EDIT;
		}
		else {
			request.setAttribute("manufacturers", ms.getManufacturers());
			return Paths.PAGE_MANUFACTURERS_VIEW;
		}
		
	}

	/*
	 * 
	 * ManufacturerStorage ms = new ManufacturerStorage();
	 * 
	 * String s = request.getParameter("pNumber");
	 * 
	 * System.out.println(s);
	 * 
	 * 
	 * 
	 * Manufacturer manufacturer = ms.get(s);
	 * 
	 * System.out.println(manufacturer);
	 * 
	 * if (manufacturer!=null) { request.setAttribute("manufacturer", manufacturer);
	 * return Paths.PAGE_MANUFACTURER_EDIT; } else {
	 * request.setAttribute("manufacturers", ms.getManufacturers()); return
	 * Paths.PAGE_MANUFACTURERS_VIEW; }
	 */
}
