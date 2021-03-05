package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParameterServlet
 */
@WebServlet("/param")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParameterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // 해당 형식으로 요청을 보낸다
		PrintWriter out = response.getWriter(); // 클라이언트와의 연결 통로를 만든다
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");

		String name = request.getParameter("name"); // 파라미터 정보 중 name의 값을 받아 name 객체에 넣는다
		String age = request.getParameter("age"); // 파라미터 정보 중 age의 값을 받아 age 객체에 넣는다
		
		out.println("name : " + name + "<br>");
		out.println("age : " + age + "<br>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
