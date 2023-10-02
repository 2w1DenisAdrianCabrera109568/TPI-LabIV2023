package ar.edu.utn.frc.tup.lciv.models.dtos;
import lombok.Data;


import java.util.List;

@Data
public class OrderDTO {


        private int id;
        private long status;
        private Detail detail;

        @Data
        public static class Detail {

            private List<Product> products;
        }

        @Data
        public static class Product {

            private int product_id;
            private String name;
            private int amount;
            private long price;
        }
}
