package com.Client.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class AppApplication{
public static void main(String[] args) {
SpringApplication.run(AppApplication.class, args);
}
}