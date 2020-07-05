package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.rendez_vous;

@Repository

public interface RendezVousRepository extends JpaRepository<rendez_vous,Long> {

}
