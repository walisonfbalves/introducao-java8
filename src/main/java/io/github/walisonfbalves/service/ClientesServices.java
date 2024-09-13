package io.github.walisonfbalves.service;

import io.github.walisonfbalves.repository.ClientesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientesServices {

    private ClientesRespository repository;

    @Autowired
    public ClientesServices (ClientesRespository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Object cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Object cliente) {
        //aplica validações
    }
}
