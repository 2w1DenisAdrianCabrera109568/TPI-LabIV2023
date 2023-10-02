package ar.edu.utn.frc.tup.lciv.clients.pedidos;

import ar.edu.utn.frc.tup.lciv.models.dtos.OrderDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GetPedidosRestIntegrationTest {


    @SpyBean
    private GetPedidoRestClient pedidosRestClient;

    @Test
    void getPostsIntegrationTest() {
        ResponseEntity<OrderDTO[]> result = pedidosRestClient.getPedido();
        assertEquals(1, Objects.requireNonNull(result.getBody()).length);

    }


}