/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Osvaldo
 */
public class UserCommand extends Command{

    public UserCommand(HttpServletRequest request, HttpServletResponse response, ServletContext servletContext) {
        super(request, response, servletContext);
    }

    @Override
    public void process() {
        this.forward("user.html");
    }
    
    
}
