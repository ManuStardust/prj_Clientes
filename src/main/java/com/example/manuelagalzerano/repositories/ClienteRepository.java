package com.example.manuelagalzerano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manuelagalzerano.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}
