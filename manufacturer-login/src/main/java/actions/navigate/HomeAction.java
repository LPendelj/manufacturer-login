package actions.navigate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import actions.AbstractAction;
import model.users.User;
import storage.UserStorage;
import webPath.Paths;

public class HomeAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		
		
		System.out.println("pokrenut HomeAction");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		
		System.out.println(request.getParameter("username"));
		session.setAttribute("username", request.getParameter("username"));
		
		UserStorage us = new UserStorage();
		
		User u = new User(username, password, "", "");
		
		if(us.getByCred(username, password)!=null) {
			
			 session = request.getSession(true);
			
			//postojeci korisnik sistema ima password, napravi novog bez password-a
			User loginUser  = u.clone();
			//user.setPassword(null);
			session.setAttribute("loginUser", loginUser);
			
			return Paths.PAGE_LOGIN;
		}
		
		
		return "/index.jsp";
	}
	
	
	
}
