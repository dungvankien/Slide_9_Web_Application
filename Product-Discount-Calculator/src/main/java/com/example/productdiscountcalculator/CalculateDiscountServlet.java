package com.example.productdiscountcalculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", value = "/display-discount")
public class CalculateDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("myPrice"));
        float discount = Float.parseFloat(request.getParameter("myDiscount"));
        float discountAmount = (float) (price * discount * 0.01);
        float discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2> Product Description: </h2>");
        writer.println("<p>" + description +"</p>");
        writer.println("<h2> List Price: " + price + "</h2>");
        writer.println("<h2> Discount Percent: " + discount + " % </h2>");
        writer.println("<h1>Result:</h1>");
        writer.println("<h2> Discount Amount: " + discountAmount + "</h2>");
        writer.println("<h2> Discount Price: " + discountPrice + "</h2>");
        writer.println("</html>");
    }
}
