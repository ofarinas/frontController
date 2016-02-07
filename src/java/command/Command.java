package command;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Command {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected ServletContext servletContext;

    public Command(HttpServletRequest request, HttpServletResponse response, ServletContext servletContext) {
        this.request = request;
        this.response = response;
        this.servletContext = servletContext;
    }

    public abstract void process();

    public void forward(String page) {
        try {
            final RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(page);
            requestDispatcher.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(Command.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Command.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
