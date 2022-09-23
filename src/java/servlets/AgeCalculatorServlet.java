package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kyle Helmer
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userAge = request.getParameter("userAge");

        if (userAge == null || userAge.equals("")) {
            String message = "You must give your current age";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
        } else {
            try {
                int age = Integer.parseInt(userAge);
                int agePlus = age + 1;

                request.setAttribute("message", "Your age next year will be " + agePlus);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                        .forward(request, response);
                
            } catch (NumberFormatException exception) {
                
                request.setAttribute("message", "You must enter a number");
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
                
            }

        }

    }

}
