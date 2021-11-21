package top.byteinfo.aeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AeurekaApplication.class, args);
    }

}
