package actions;

import actions.navigate.HomeAction;
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
			
		default:
			break;
		}
		
		
		return action;
	}
}
