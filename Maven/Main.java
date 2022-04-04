public class Main {
    public static void main(String[] args) throws Exceptions{
        Frontend frontend = new Frontend();
        Server server = new Server(8080);
        ServletContextHandler context = ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(context);
        context.addServlet(new ServletHolder(frontend), '/authform');

        server.start();
        server.join();
    }
}
