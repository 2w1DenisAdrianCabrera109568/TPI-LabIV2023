package ar.edu.utn.frc.tup.lciv.clients.orders;
import ar.edu.utn.frc.tup.lciv.models.dtos.OrderDTO;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PutOrderRestTest {
   @Mock
    private GetOrderRestClient getOrderRestClient;
   @InjectMocks
   private PutConfirmOrderRestClient putConfirmOrderRestClient;
   @Mock
    private RestTemplate restTemplate;

   @Test
    public void testUpdateOrderStatus(){
       OrderDTO order= new OrderDTO();
       order.setId(1);
       order.setStatus(1);

       when(getOrderRestClient.getOrder(order.getId())).thenReturn(ResponseEntity.ok(order));


       when(restTemplate.exchange(
               getOrderRestClient.baseResourceUrl + "/" + order.getId(),
               HttpMethod.PUT,
               new HttpEntity<>(order),
               Void.class)).thenReturn(ResponseEntity.ok().build());


       OrderDTO updatedOrder = putConfirmOrderRestClient.updateOrderStatus(order.getId(), 1);


       assertEquals(1, updatedOrder.getStatus());
   }

   }


