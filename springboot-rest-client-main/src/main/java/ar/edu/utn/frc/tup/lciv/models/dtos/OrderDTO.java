package ar.edu.utn.frc.tup.lciv.models.dtos;
import lombok.Data;


import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderDTO {


        public long id;
        public long status; //0= pendiente 1=confirmado 2=cancelado
        private List<Detail> detail;

        @Data
        public static class Detail {


            private long amount;
            private List<Product> products;
        }

        @Data
        public static class Product {

            private long product_id;
            private String name;
            private BigDecimal price;
        }
}
