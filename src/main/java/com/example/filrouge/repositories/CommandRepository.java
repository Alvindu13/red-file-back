package com.example.filrouge.repositories;

import com.example.filrouge.entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommandRepository extends JpaRepository<Command, Long> {
}
