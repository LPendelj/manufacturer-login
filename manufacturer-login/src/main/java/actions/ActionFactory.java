package actions;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import actions.navigate.HomeAction;
import actions.navigate.LogoutAction;
import actions.navigate.ManufacturerAction;
import actions.navigate.ManufacturerDeleteAction;
import actions.navigate.ManufacturerEditAction;
import actions.navigate.ManufacturerSaveAction;
import actions.navigate.ManufacturersViewAction;
import webPath.Paths;

public class ActionFactory {
	
	public static boolean checkSession(HttpServletRequest request, HttpServletResponse response) {
	
		HttpSession session = request.getSession(false);
	
		if(session.getAttribute("loginUser")==null) {
		
				return false;
		
			} else return true;
		}
	
	public static AbstractAction createAction(String method, String path, HttpServletRequest request, HttpServletResponse response) {
		AbstractAction action = null;
		
		System.out.println("ActionFactory se pokrece");
		
		if(path.equals(Paths.PATH_LOGIN)) {
			action = new HomeAction();
		} else if(!checkSession(request, response)) {
			action = new HomeAction();
		} else
			switch (path) {
			/*case Paths.PATH_LOGIN:
			action = new HomeAction();
				break;*/
			case Paths.PATH_MANUFACTURERS_VIEW:
			action = new ManufacturersViewAction();
			break;
			case Paths.PATH_MANUFACTURER:
			action =  new ManufacturerAction();
			break;
			case Paths.PATH_LOGOUT:
			action = new LogoutAction();
			break;
			case Paths.PATH_MANUFACTURER_DELETE:
			action = new ManufacturerDeleteAction();
			break;
			case Paths.PATH_MANUFACTURER_EDIT:
			action = new ManufacturerEditAction();
			break;
			case Paths.PATH_MANUFACTURER_SAVE:
			action = new ManufacturerSaveAction();
				
			default: 
				break;
			}
		
		/*        HttpSession session=request.getSession(false);  
        if(session!=null){  
        String name=(String)session.getAttribute("name");  
          
        out.print("Hello, "+name+" Welcome to Profile");  
        }  
        else{  
            out.print("Please login first");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
        out.close();  
    }*/
		
	
		
		
		return action;
	}
	
	
}
