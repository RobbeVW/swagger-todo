package be.robbevw.swaggertodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SwaggerTodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerTodoApplication.class, args);
    }

}
