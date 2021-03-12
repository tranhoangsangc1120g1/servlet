package bai10.baitap.bai1.controllers;

import bai10.baitap.bai1.models.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customerServlet",urlPatterns = {"","/customer"})
public class customerServlet extends HttpServlet {
    private static List<Customer> customerList;

    @Override
    public void init() throws ServletException {
        customerList=new ArrayList<>();
        customerList.add(new Customer("Ngoc",21,"Dang nang", "assert/images/2757878.jpg"));
        customerList.add(new Customer("Thuan",20,"hue", "assert/images/Broken-Heart-Wounded-in-Red-Color-for-Valentines-21302.jpg"));
        customerList.add(new Customer("Quang",27,"Dang nang", "assert/images/c.jpg"));
        customerList.add(new Customer("Phuc",32,"quang ngai", "assert/images/chiu.jpg"));
        customerList.add(new Customer("Phuc",32,"quang ngai", "assert/images/co-nen-yeu-con-trai-it-tuoi-hon.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerlist",customerList);
        RequestDispatcher dispatcher= request.getRequestDispatcher("/customer/list.jsp");
        dispatcher.forward(request,response);
    }
}
