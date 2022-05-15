package actions.navigate;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import actions.AbstractAction;
import connection.MyEntityManagerFactory;
import model.Manufacturer;
import storage.ManufacturerStorage;
import webPath.Paths;

public class ManufacturerSaveAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		System.out.println("Maufacturer SAVE akcija");
		
		ManufacturerStorage ms = new ManufacturerStorage();
		
		String s = request.getParameter("pNumber");
		String a = request.getParameter("address");
		
		System.out.println("broj je " + s);
		System.out.println("adresa je " + a);
		
		ms.update(s, a);
		
		request.setAttribute("manufacturers", ms.getManufacturers());
		
		
		
		return Paths.PAGE_MANUFACTURERS_VIEW;
	}

}
