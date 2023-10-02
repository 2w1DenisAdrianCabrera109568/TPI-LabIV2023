package ar.edu.utn.frc.tup.lciv.clients.pedidos;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PutConfirmOrderRestClient {
    RestTemplate restTemplate = new RestTemplate();
    String baseResourceUrl= "https://my-json-server.typicode.com/2w1DenisAdrianCabrera109568/TPI-LabIV2023/orders";

    HttpEntity<Order> requestUpdate = new HttpEntity<>(orderDetails);
    ResponseEntity<Order> response = restTemplate.exchange(baseResourceUrl + id, HttpMethod.PUT, requestUpdate, Order.class);
        return response.getBody();
}
