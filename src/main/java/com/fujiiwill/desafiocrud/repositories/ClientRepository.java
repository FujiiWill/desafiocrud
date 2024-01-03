package com.fujiiwill.desafiocrud.repositories;

import com.fujiiwill.desafiocrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
