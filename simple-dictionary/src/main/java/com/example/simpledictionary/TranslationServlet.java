package com.example.simpledictionary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet", value = "/translate")
public class TranslationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how","Thế nào");
        dictionary.put("book", "QUyển vở");
        dictionary.put("computer", "Máy tính");
        String search = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = dictionary.get(search.toLowerCase());
        if (result != null) {
            writer.println("<h3>Word: " + search + "</h3>");
            writer.println("<h3>Result: " + result + "</h3>");
        } else {
            writer.println("<h3>Not found </h3>");
        }
        writer.println("</html>");
    }
}
