package ar.edu.utn.frc.tup.lciv.clients.orders;

import ar.edu.utn.frc.tup.lciv.models.dtos.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetOrderRestClient {
    @Autowired
    private RestTemplate restTemplate;


    String baseResourceUrl= "https://my-json-server.typicode.com/2w1DenisAdrianCabrera109568/TPI-LabIV2023/orders";

    public ResponseEntity<OrderDTO[]> getOrders(){return restTemplate.getForEntity(baseResourceUrl, OrderDTO[].class);}

    public ResponseEntity<OrderDTO> getOrder(long id){return restTemplate.getForEntity(baseResourceUrl + "/" + id, OrderDTO.class);}

}
