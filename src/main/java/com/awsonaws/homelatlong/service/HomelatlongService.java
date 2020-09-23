package com.awsonaws.homelatlong.service;

import com.awsonaws.homelatlong.domain.Address;
import com.awsonaws.homelatlong.domain.Coordinates;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomelatlongService {


    public Coordinates findLatLong(Address homeaddress) {

        RestTemplate restTemplate = new RestTemplate();
        String mapUrl = "";
        ResponseEntity<String> response = restTemplate.getForEntity(mapUrl, String.class);

        return null;
    }
}
