package org.spring.cloud.config.server;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
//@RestController
@EnableConfigServer
@SpringBootApplication
/*
 * @EnableConfigServer关键注解,在resources文件下创建application.properties
 */
//@EnableConfigServer
//@Configuration
//@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(App.class).web(true).run(args);
    }
}
