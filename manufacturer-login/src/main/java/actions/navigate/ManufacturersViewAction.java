package actions.navigate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import actions.AbstractAction;
import storage.ManufacturerStorage;
import webPath.Paths;

public class ManufacturersViewAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ManufacturerStorage ms = new ManufacturerStorage();
		
		request.setAttribute("manufacturers", ms.getManufacturers());

		
		
		return Paths.PAGE_MANUFACTURERS_VIEW;
	}

}
