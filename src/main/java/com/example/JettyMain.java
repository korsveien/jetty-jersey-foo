package com.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class JettyMain {
    public static void main(String[] args) throws Exception {

        ResourceConfig resourceConfig = new ResourceConfig().packages("com.example");

        ServletHolder servletHolder = new ServletHolder(new ServletContainer(resourceConfig));

        Server server = new Server(3000);
        ServletContextHandler contextHandler = new ServletContextHandler(server, "/*");
        contextHandler.addServlet(servletHolder, "/*");

        server.start();
        server.join();
    }
}
