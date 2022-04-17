package actions.navigate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import actions.AbstractAction;
import webPath.Paths;



	public class LogoutAction extends AbstractAction {

		@Override
		public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
			HttpSession session = request.getSession();
			session.removeAttribute("loginUser");
			session.invalidate();
			session = request.getSession(false);
			return Paths.PAGE_LOGOUT;
		}

	}


