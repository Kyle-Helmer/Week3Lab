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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("result", "---");

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operation = request.getParameter("operation");

        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("result", "invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            
        } else {
            try {
                
                int firstNum = Integer.parseInt(first);
                int secondNum = Integer.parseInt(second);

                switch (operation) {
                    case "+":
                        request.setAttribute("result", firstNum + secondNum);
                        break;

                    case "-":
                        request.setAttribute("result", firstNum - secondNum);
                        break;

                    case "*":
                        request.setAttribute("result", firstNum * secondNum);
                        break;

                    case "%":
                        request.setAttribute("result", firstNum % secondNum);
                        break;
                }
                
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                
            } catch (NumberFormatException exception) {
                request.setAttribute("result", "invalid");
                 getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
            }

        }
    }

}
