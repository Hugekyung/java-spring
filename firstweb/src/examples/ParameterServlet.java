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
		response.setContentType("text/html"); // �ش� �������� ��û�� ������
		PrintWriter out = response.getWriter(); // Ŭ���̾�Ʈ���� ���� ��θ� �����
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");

		String name = request.getParameter("name"); // �Ķ���� ���� �� name�� ���� �޾� name ��ü�� �ִ´�
		String age = request.getParameter("age"); // �Ķ���� ���� �� age�� ���� �޾� age ��ü�� �ִ´�
		
		out.println("name : " + name + "<br>");
		out.println("age : " + age + "<br>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
