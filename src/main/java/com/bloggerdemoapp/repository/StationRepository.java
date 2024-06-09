package com.bloggerdemoapp.repository;

import com.bloggerdemoapp.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}