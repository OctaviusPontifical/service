import WebService.Hello;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:6060/hello", new Hello());
    }
}
