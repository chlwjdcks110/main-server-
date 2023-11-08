package com.example.Hann.repository;

import com.example.Hann.entity.Recode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecodeRepository extends JpaRepository<Recode, Long> {
}
