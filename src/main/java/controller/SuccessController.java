/**
 * 
 */
package controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author pramod.simikeri
 *
 */
public class SuccessController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4665495281375835744L;

	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String kaptchaExpected = (String)request.getSession()
			    .getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
			String kaptchaReceived = request.getParameter("kaptcha");

			if (kaptchaReceived == null || !kaptchaReceived.equalsIgnoreCase(kaptchaExpected))
			{
			    System.out.println( "Kaptcha - Invalid validation code.");
			    response.sendRedirect("failure.jsp");
			}else{
				System.out.println( "Kaptcha - Valid validation code.");
				response.sendRedirect("success.jsp");
			}
	}
}
