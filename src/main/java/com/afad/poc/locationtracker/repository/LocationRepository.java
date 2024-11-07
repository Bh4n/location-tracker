package com.afad.poc.locationtracker.repository;

import com.afad.poc.locationtracker.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface LocationRepository extends JpaRepository<Location, Long> { }
