package ar.edu.utn.frc.tup.lciv.clients.pedidos;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PutConfirmOrderRestClient {
    RestTemplate restTemplate = new RestTemplate();
}
