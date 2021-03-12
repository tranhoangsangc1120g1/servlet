package controllers;

import model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = {"","/student"})
public class StudentServlet extends HttpServlet {

    private static List<Student> studentList;

    @Override
    public void init() throws ServletException {
        studentList = new ArrayList<>();
        studentList.add(new Student(1,"Khoa",1, 90, ""));
        studentList.add(new Student(2,"Dong",1, 100, "avatar_1.jpg"));
        studentList.add(new Student(3,"Hong",0, 50, "avatar_2.png"));
        studentList.add(new Student(4,"Hue",2, 80, "avatar_3.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("studentList",studentList);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/student/list.jsp");
        requestDispatcher.forward(request, response);
    }
}
