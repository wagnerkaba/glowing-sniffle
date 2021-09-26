package com.example.springbootProjetoTeste.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")

    public String helloMessage(){

        //Execute SpringbootProjetoTesteApplication
        //e digite o seguinte endereço no browser: http://localhost:8080/

        return "Hello world! Este é um teste do Springboot";
    }



}
