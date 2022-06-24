package patterns.chainOfResponsibility;

public class Client {

  public static void main(String[] args) {

    AuthenticationHandler handler = new BasicAuthenticationHandler(new ClientCertificateAuthenticationHandler(null));

    handler.handleRequest("client");

  }

}
