package ar.edu.utn.frc.tup.lciv.clients.pedidos;

import ar.edu.utn.frc.tup.lciv.models.dtos.OrderDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GetOrdersRestIntegrationTest {


    @SpyBean
    private GetOrderRestClient ordersRestClient;

    @Test
    void getOrdersIntegrationTest() {
        ResponseEntity<OrderDTO[]> result = ordersRestClient.getOrder();
        assertEquals(2, Objects.requireNonNull(result.getBody()).length);

    }


}