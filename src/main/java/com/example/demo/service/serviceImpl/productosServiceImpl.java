package com.example.demo.service.serviceImpl;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.common.CommonServiceImpl;
import com.example.demo.models.productosModel;
import com.example.demo.repository.productosRepository;
import com.example.demo.service.productosService;



@Service
public class productosServiceImpl extends CommonServiceImpl<productosModel, productosRepository> implements productosService {

    @Override
    @Transactional
    public Iterable<productosModel> findAll() {
        return this.repository.findAll();
    }

    @Override
    @Transactional
    public Optional<productosModel> findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    @Transactional
    public productosModel save(productosModel entity) {
        return this.repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

    @Override
    @Transactional
    public Iterable<productosModel> saveAll(Iterable<productosModel> entities) {
        return this.repository.saveAll(entities);
    }
}

