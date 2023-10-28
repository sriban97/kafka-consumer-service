package com.green.kafkaconsumerservice.repository;

import com.green.kafkaconsumerservice.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
