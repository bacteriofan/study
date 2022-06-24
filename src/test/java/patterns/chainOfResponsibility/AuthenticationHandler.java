package patterns.chainOfResponsibility;

public abstract class AuthenticationHandler {

  AuthenticationHandler authenticationHandler;

  public AuthenticationHandler(AuthenticationHandler handler) {
    this.authenticationHandler = handler;
  }

  public void handleRequest(String requestType) {
    if (requestType != null) {
      authenticationHandler.handleRequest(requestType);
    } else {
      System.out.println("End of chain");
    }
  }
}
