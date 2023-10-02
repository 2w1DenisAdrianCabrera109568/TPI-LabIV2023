package ar.edu.utn.frc.tup.lciv.clients.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.edu.utn.frc.tup.lciv.models.dtos.OrderDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;


@Service
public class PutConfirmOrderRestClient {
    //
    @Autowired
    private GetOrderRestClient getOrderRestClient;
@Autowired
    private RestTemplate restTemplate;
    String url= "https://my-json-server.typicode.com/2w1DenisAdrianCabrera109568/TPI-LabIV2023/orders";

 public OrderDTO updateOrderStatus(long id, long status){
     ResponseEntity<OrderDTO>response = getOrderRestClient.getOrder(id);

     OrderDTO order= response.getBody();
     if (order==null){
         return null;
     }
     order.setStatus(status);

     HttpEntity<OrderDTO>requestUpdate = new HttpEntity<>(order);

     restTemplate.exchange(url + "/" + id, HttpMethod.PUT, requestUpdate, Void.class);
     return order;
 }


}
