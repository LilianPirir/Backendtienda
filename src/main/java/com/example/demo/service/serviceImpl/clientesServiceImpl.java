package com.example.demo.service.serviceImpl;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.common.CommonServiceImpl;
import com.example.demo.models.clientesModel;
import com.example.demo.repository.clienteRepository;
import com.example.demo.service.clientesService;

@Service
public class clientesServiceImpl extends CommonServiceImpl<clientesModel, clienteRepository> implements clientesService {

    @Override
    public void deleteById(int id) {
        if (id == 5) {
            throw  new RuntimeException("No se puede eliminar el cliente con id 5");
        }else{
            this.repository.deleteById(id);
        }
    }

    @Override
    public Iterable<clientesModel> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<clientesModel> findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    public clientesModel save(clientesModel entity) {
        return this.repository.save(entity);
    }

    @Override
    public Iterable<clientesModel> saveAll(Iterable<clientesModel> entities) {
        return this.repository.saveAll(entities);
    }

    @Override
    public clientesModel findByNombre(String nombre) {
        return this.repository.findByNombre(nombre);
    }

    @Override
    public clientesModel findByModel(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByModel'");
    }
}
