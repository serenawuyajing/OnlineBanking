

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class depositServlet
 */
public class depositServlet extends HttpServlet {

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String amount = request.getParameter("amount");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		int amountUpdated = -1;
		try {
			amountUpdated = LoginUser.login(username, password) + Integer.parseInt(amount);
			
			UpdateUser.update(username, password, amountUpdated);
			out.println("deposit successfully!");
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			request.setAttribute("amount", amountUpdated);
			RequestDispatcher rd=request.getRequestDispatcher("balance.jsp");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.close();
	}

}
