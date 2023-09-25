package ar.edu.utn.frc.tup.lciv.clients.pedidos;
import lombok.Data;


import java.util.List;

@Data
public class PedidoDTO {


        private int id;
        private Detalle detalle;

        @Data
        public static class Detalle {

            private List<Producto> productos;
        }

        @Data
        public static class Producto {

            private int producto_id;
            private String nombre;
            private int cantidad;
            private long precioUnitario;
        }
}
