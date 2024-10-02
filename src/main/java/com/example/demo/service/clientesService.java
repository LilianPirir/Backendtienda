package com.example.demo.service;


import java.util.Optional;

import com.example.demo.common.commonSvc;
import com.example.demo.models.clientesModel;

public interface clientesService extends commonSvc<clientesModel> {

   public Iterable<clientesModel> findAll(); 
    public Optional<clientesModel> findById(int id);

    public clientesModel findByNombre(String nombre);
    public clientesModel save(clientesModel entity);
    public void deleteById(int id);
    Iterable<clientesModel> saveAll(Iterable<clientesModel> entities);

    clientesModel findByModel(String nombre);
}


