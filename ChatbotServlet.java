import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChatbotServlet")
public class ChatbotServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userMessage = request.getParameter("userMessage");
        String botResponse = getAIResponse(userMessage); // Implement AI logic here

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(botResponse);
    }

    private String getAIResponse(String userMessage) {
        // Implement your AI logic here (e.g., using external AI services or logic)
        // For demonstration, let's echo back the user's message
        return "AI: You said: " + userMessage;
    }
}
