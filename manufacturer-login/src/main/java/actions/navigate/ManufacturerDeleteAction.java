package actions.navigate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import actions.AbstractAction;
import storage.ManufacturerStorage;
import webPath.Paths;

public class ManufacturerDeleteAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		
		ManufacturerStorage ms = new ManufacturerStorage();
		
		String s = request.getParameter("pNumber");
		
		ms.delete(s);
		
		request.setAttribute("manufacturers", ms.getManufacturers());
		
		
		
		return Paths.PAGE_MANUFACTURERS_VIEW;
	}

}
