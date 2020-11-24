package alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ScProvider9002Application {
    public static void main(String[] args){
        SpringApplication.run(ScProvider9002Application.class,args);
    }
}
