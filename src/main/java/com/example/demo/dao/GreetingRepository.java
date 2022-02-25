package com.example.demo.dao;

import com.example.demo.model.entity.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingEntity, Long> {

    GreetingEntity findById(int id);
}
