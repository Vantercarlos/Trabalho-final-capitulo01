package com.vantercarlos.Trabalho01.services;

import com.vantercarlos.Trabalho01.dto.ClientDTO;
import com.vantercarlos.Trabalho01.entities.Client;
import com.vantercarlos.Trabalho01.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClientRepository repository;

    public Page<ClientDTO> findAllPaged(PageRequest pageRequest){
        Page<Client> list = repository.findAll(pageRequest);
        return list.map(x -> new ClientDTO(x));
    }
}
