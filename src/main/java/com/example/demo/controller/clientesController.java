package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.clientesModel;
import com.example.demo.service.clientesService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
//
@RequestMapping("/clientes")

public class clientesController {
    
    @Autowired
    private clientesService clientesService;

   
    @GetMapping("/listar")
    public Iterable<clientesModel> getClientes(){
        return this.clientesService.findAll();
    }
    
}
