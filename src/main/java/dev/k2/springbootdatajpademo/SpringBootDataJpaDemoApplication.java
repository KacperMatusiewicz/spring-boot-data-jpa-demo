package dev.k2.springbootdatajpademo;

import dev.k2.springbootdatajpademo.repository.custom.CustomRepositoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataJpaDemoApplication implements ApplicationRunner {

    @Autowired
    CustomRepositoryExample customRepositoryExample;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataJpaDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        customRepositoryExample.example();

    }
}
