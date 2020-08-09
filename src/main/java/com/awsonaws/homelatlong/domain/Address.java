package com.awsonaws.homelatlong.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="address")
@Component
@Getter
@Setter
public class Address {

    @Id
    private Long addressId;
    private String street;
    private String city;
    private String state;
}
