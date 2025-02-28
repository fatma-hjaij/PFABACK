package com.example.demo.repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, Long> {
	Optional<ImageModel> findByName(String name);
}