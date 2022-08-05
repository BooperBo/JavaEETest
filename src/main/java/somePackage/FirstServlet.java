package somePackage;

import logic.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();

            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart", cart);

        getServletContext().getRequestDispatcher("/ShowCart.jsp").forward(request, response);

//        Integer count = (Integer) session.getAttribute("cart");

            /*if (count == null) {
                session.setAttribute("count", 1);
                count = 0;
            } else {
                session.setAttribute("count", count + 1);
            }*/

//        String name = request.getParameter("name");
        //
        PrintWriter pw = response.getWriter();

        pw.println("<html>");

//        pw.println("<h1> Your count is: " + count + " </h1>");
        pw.println("</html>");

//        response.sendRedirect("/testJsp.jsp");
//        RequestDispatcher rd = request.getRequestDispatcher("/testJsp.jsp");
//        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
