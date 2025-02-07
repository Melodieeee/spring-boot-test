package com.example.platstyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class PlatstyleApplication {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello World!haha";
    }

    public static void main(String[] args) {
        SpringApplication.run(PlatstyleApplication.class, args);
    }

}
