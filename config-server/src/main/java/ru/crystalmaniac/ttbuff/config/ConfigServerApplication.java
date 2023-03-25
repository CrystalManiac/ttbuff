package ru.crystalmaniac.ttbuff.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ConfigServerApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
    }

}
