package com.sprinter.demo.service;

import com.sprinter.demo.entity.Client;
import com.sprinter.demo.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends GenericService<Client> {

    public ClientService(GenericRepository<Client> repository) {
        super(repository);
    }
}