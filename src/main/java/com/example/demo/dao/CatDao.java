package com.example.demo.dao;

import com.example.demo.model.Cat;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatDao extends JpaRepository<Cat, UUID> {
}
