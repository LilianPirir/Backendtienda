package com.example.demo.service;

import java.util.Optional;

import com.example.demo.common.commonSvc;
import com.example.demo.models.productosModel;

public interface productosService extends commonSvc<productosModel> {
    public Iterable<productosModel> findAll();
    public Optional<productosModel> findById(int id);
    public productosModel save(productosModel entity);
    public void deleteById(int id);
    Iterable<productosModel> saveAll(Iterable<productosModel> entities);
}
