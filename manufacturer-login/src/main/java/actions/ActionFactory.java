package actions;



public class ActionFactory {
	public static AbstractAction createAction(String method, String path) {
		AbstractAction action = null;
		
		switch (path) {
		case "a": System.out.println("pozvana ActionFactory");
		default:
			break;
		}
		
		
		return action;
	}
}
