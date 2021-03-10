package bai9.thuchanh;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleLogin" , urlPatterns = "/login")
public class SimpleLogin extends HttpServlet {
//    @Override
//    public void init() throws ServletException {
//        System.out.println("Khoi tao servlet Login");
//    }
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
//        System.out.println("Phuong thuc cua request là: " + req.getMethod());
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("Ket thuc vong doi Servlet Login");
//    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String userName =request.getParameter("userName");
//        String password =request.getParameter("password");
//        request.setAttribute("ten",userName);
//        request.setAttribute("matKhau",password);
//        RequestDispatcher dispatcher =request.getRequestDispatcher("/login.jsp");
//        dispatcher.forward(request,response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if("admin".equals(username) && "admin".equals(password)) {
            writer.println("<h1>Welcome "+ username +" to website</h1>");
        } else{
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
