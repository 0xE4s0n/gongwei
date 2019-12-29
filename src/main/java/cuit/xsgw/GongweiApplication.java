package cuit.xsgw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cuit.xsgw.mapper")
@SpringBootApplication
public class GongweiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GongweiApplication.class, args);
    }

}
