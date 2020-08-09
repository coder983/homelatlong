package com.awsonaws.homelatlong;

import com.awsonaws.homelatlong.service.Coordinates;
import com.awsonaws.homelatlong.service.HomelatlongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomelatlongController {

    @Autowired
    HomelatlongService service;

    @GetMapping("/latlong")
    public String getLatLong(ModelMap model, String homeaddress){

        Coordinates coordinates = service.findLatLong(homeaddress);
        return null;
    }
}
