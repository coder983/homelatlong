package com.awsonaws.homelatlong.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="coordinates")
@Component
@Getter
@Setter
public class Coordinates {

    @Id
    private Long coordinatesId;
    private Double latitude;
    private Double longitude;
}
