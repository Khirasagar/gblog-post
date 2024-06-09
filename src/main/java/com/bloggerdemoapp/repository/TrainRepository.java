package com.bloggerdemoapp.repository;

import com.bloggerdemoapp.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Long> {
}