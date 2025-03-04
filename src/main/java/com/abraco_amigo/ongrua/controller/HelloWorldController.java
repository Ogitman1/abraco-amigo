/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abraco_amigo.ongrua.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ADMIN
 */
//receber requisições e dar respostas HTTP. API RESTFUL
//Criação da API para o frontend conectar JSON ou XM (ENDPOINT)
//Junta @Controller e @Response body
//Pois ele não precisa retornar uma resposta direta JSON ou XML
//poderia ser também uma página
@RestController 
@RequestMapping("/hello-world")
public class HelloWorldController {
    //Qual método HTTP ele escuta?POST? GET? DELETE? PUT? PATCH? PATC? HEAD?
    //Método GET /hello-world
    //Pode por outro parâmetro para ser o novo path. 
    //EX: @GetMapping("get"). 
    //Output: "/hello-world/get"
    @GetMapping
    public String HelloWorld(){
        return "Página executada!";
    }
    //Precisa mapear ENDPOINT(Path)
}
