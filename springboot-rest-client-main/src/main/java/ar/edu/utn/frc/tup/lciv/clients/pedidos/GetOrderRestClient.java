package ar.edu.utn.frc.tup.lciv.clients.pedidos;

import ar.edu.utn.frc.tup.lciv.models.dtos.OrderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetOrderRestClient {
    RestTemplate restTemplate = new RestTemplate();

    String baseResourceUrl= "https://my-json-server.typicode.com/2w1DenisAdrianCabrera109568/TPI-LabIV2023/orders";

    public ResponseEntity<OrderDTO[]>getOrder(){return restTemplate.getForEntity(baseResourceUrl, OrderDTO[].class);}
}
