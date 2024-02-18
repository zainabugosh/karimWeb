package com.example.firstWebApp.repository;

import com.example.firstWebApp.entities.course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courseRepository extends JpaRepository<course,Long> {
}