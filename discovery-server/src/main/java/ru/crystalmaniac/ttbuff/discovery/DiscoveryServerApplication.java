package ru.crystalmaniac.ttbuff.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DiscoveryServerApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
    }

}
