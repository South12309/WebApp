package com.gb;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="Product", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Product> productList=Product.getTestProductList();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body><h1>Product List</h1>");
        for (Product product : productList) {
            out.println("<h1>" + product.getId() + " " + product.getTittle() + " " + product.getCost() + "</h1>");
        }
        out.println("</body></html>");
    }


}
