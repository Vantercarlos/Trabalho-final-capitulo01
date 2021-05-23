package com.vantercarlos.Trabalho01.repositories;

import com.vantercarlos.Trabalho01.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
