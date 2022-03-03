package com.revature.movie;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 *Created the server for the app.
 */

public class ServerMovie {
    public ServerMovie() {
        MovieFile MF = new MovieFile();
        Tomcat server = new Tomcat();
        server.setBaseDir("Java.io.tmpdir");
        server.setPort(8080);
        server.getConnector();
        server.addContext("", null);
        server.addServlet("", "MovieService()",new MovieService()).addMapping("/search");
        server.addServlet("", "Moviefile", MF).addMapping("/movie");
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }
}
