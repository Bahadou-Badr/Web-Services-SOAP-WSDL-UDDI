import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServeurJawWS {
    public static void main(String[] args){
        String url = "http://0.0.0.0:8686/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service déploye sur " + url);
    }
}
