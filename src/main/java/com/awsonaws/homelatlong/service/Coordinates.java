package com.awsonaws.homelatlong.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Coordinates {

    private double latitude;
    private double longitude;
}
