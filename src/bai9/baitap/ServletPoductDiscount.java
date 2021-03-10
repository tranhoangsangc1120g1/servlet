package bai9.baitap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPoductDiscount", urlPatterns = "/discount")
public class ServletPoductDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tensp = request.getParameter("tensp");
        float giasp = Float.parseFloat(request.getParameter("giasp"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        float price = giasp * discount * 0.01f;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Ten: " + tensp + "</h1>");
        writer.println("<h1>discount: " + discount + "</h1>");
        writer.println("<h1>GiaSauGiam: " + price + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("discount.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
