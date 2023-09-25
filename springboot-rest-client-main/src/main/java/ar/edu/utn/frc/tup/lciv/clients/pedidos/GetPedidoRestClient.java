package ar.edu.utn.frc.tup.lciv.clients.pedidos;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetPedidoRestClient {
    RestTemplate restTemplate = new RestTemplate();

    String baseResourceUrl= "https://my-json-server.typicode.com/2w1DenisAdrianCabrera109568/TPI-LabIV2023/pedido";

    public ResponseEntity<PedidoDTO[]>getPedido(){return restTemplate.getForEntity(baseResourceUrl, PedidoDTO[].class);}
}
