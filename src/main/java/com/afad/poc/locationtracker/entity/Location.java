package com.afad.poc.locationtracker.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(hidden = true)
    private Long id;

    @Schema(description = "Latitude of the location", example = "44.9334")
    @Column(nullable = false)
    private Double latitude;

    @Schema(description = "Longitude of the location", example = "44.8597")
    @Column(nullable = false)
    private Double longitude;

    @Schema(description = "Timestamp of the location", example = "2024-11-08T07:50:28.208Z")

    @Column(nullable = false)
    private LocalDateTime timestamp = LocalDateTime.now();
}
