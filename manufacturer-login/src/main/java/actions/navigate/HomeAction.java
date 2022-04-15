package actions.navigate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import actions.AbstractAction;
import webPath.Paths;

public class HomeAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("pokrenut HomeAction");
		
		
		return "/WEB-INF/home.jsp";
	}
	
	
	
}
