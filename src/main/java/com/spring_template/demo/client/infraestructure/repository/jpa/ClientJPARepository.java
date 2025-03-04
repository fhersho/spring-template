package com.spring_template.demo.client.infraestructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientJPARepository extends JpaRepository<ClientEntity, Integer> {
}
