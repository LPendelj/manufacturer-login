package actions;

import actions.navigate.HomeAction;
import webPath.Paths;

public class ActionFactory {
	
	
	public static AbstractAction createAction(String method, String path) {
		AbstractAction action = null;
		
		System.out.println("ActionFactory se pokrece");
		
//		switch (path) {
	//	case Paths.PATH_LOGIN:
		action = new HomeAction();
		//	break;
			//
		//default:
			//break;
		//}
		
		
		return action;
	}
}
