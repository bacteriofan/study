package patterns.chainOfResponsibility;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  ClientCertificateAuthenticationHandler(AuthenticationHandler handler) {
    super(handler);
  }

  public void handleRequest(String requestType) {
    if (requestType.equals("client")) {
      System.out.println("Client");
    } else {
      super.handleRequest(requestType);
    }
  }

}
