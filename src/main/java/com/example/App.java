package com.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.http.HttpStatus;
import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class App extends AbstractHandler {
    public static void main( String[] args ) throws Exception {
        Server server = new Server(8080);

        server.setHandler(new App());

        server.start();
        server.join();
    }

    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpStatus.OK_200);

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Welcome</h1>");
        response.getWriter().println("</body></html>");

        baseRequest.setHandled(true);
    }
}
