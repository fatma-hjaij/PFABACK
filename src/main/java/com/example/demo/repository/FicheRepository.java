package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.fiche;
@Repository
public interface FicheRepository extends JpaRepository<fiche, Long>{

}
