package com.example.warehouse;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;

@SpringBootApplication
@Configuration
@EnableScheduling
@SecurityScheme(name = "default", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
//@OpenAPIDefinition(info = @Info(title = "User API", version = "2.0", description = "User Details"))
public class WarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseApplication.class, args);
        System.out.println("\n Swagger = http://localhost:9000/swagger-ui/index.html\n");
        System.out.println("\n Hello WebSocket =http://localhost:9000 \n");
    }
//    private static void logApplicationStartup(Environment env) {
//        String protocol = "http";
//        if (env.getProperty("server.ssl.key-store") != null) {
//            protocol = "https";
//        }
//        String serverPort = env.getProperty("server.port");
//        String contextPath = env.getProperty("server.servlet.context-path");
//        if (StringUtils.isBlank(contextPath)) {
//            contextPath = "/";
//        }
//        String hostAddress = "localhost";
//        try {
//            hostAddress = InetAddress.getLocalHost().getHostAddress();
//        } catch (UnknownHostException e) {
//            System.out.println("The host name could not be determined, using `localhost` as fallback");
//        }
//        String.format("\n----------------------------------------------------------\n\t" +
//                        "Application '{}' is running! Access URLs:\n\t" +
//                        "Local: \t\t{}://localhost:{}{}\n\t" +
//                        "External: \t{}://{}:{}\n\t" +
//                        "context: \t--{}--\n\t" +
//                        "Profile(s): \t{}\n----------------------------------------------------------",
//                env.getProperty("spring.application.name"),
//                protocol,
//                serverPort,
//                contextPath,
//                protocol,
//                hostAddress,
//                serverPort,
//                contextPath,
//                env.getActiveProfiles());
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//    }
}
