package actions;

import actions.navigate.HomeAction;
import actions.navigate.LogoutAction;
import actions.navigate.ManufacturerAction;
import actions.navigate.ManufacturersViewAction;
import webPath.Paths;

public class ActionFactory {
	
	
	public static AbstractAction createAction(String method, String path) {
		AbstractAction action = null;
		
		System.out.println("ActionFactory se pokrece");
		
	switch (path) {
		case Paths.PATH_LOGIN:
		action = new HomeAction();
			break;
		case Paths.PATH_MANUFACTURERS_VIEW:
		action = new ManufacturersViewAction();
		break;
		case Paths.PATH_MANUFACTURER:
		action =  new ManufacturerAction();
		break;
		case Paths.PATH_LOGOUT:
		action = new LogoutAction();
		break;
			
		default:
			break;
		}
		
		
		return action;
	}
}
