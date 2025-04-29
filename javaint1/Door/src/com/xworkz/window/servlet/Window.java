package com.xworkz.window.servlet;

import com.sun.media.sound.InvalidDataException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/shut", loadOnStartup = 1)
public class Window extends GenericServlet {
    public Window(){
        System.out.println("Window servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, InvalidDataException
    {
        System.out.println("Running Html");
    }

}
