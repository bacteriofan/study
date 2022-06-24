package patterns.chainOfResponsibility;

public class BasicAuthenticationHandler extends AuthenticationHandler {

  public BasicAuthenticationHandler(AuthenticationHandler handler) {
    super(handler);
  }

  public void handleRequest(String requestType) {
    if (requestType.equals("basic")) {
      System.out.println("Basic request");
    } else super.handleRequest(requestType);
  }

}
