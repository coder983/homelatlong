package com.awsonaws.homelatlong;

import com.awsonaws.homelatlong.domain.Address;
import com.awsonaws.homelatlong.domain.Coordinates;
import com.awsonaws.homelatlong.service.HomelatlongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomelatlongController {

    @Autowired
    HomelatlongService service;

    @GetMapping
    public String askPage(ModelMap model) {
        model.addAttribute("address", new Address());
        return "main";
    }

    @GetMapping("/latlong")
    public String getLatLong(@ModelAttribute Address homeaddress,  ModelMap model){

        Coordinates coordinates = service.findLatLong(homeaddress);
        return "main";
    }
}
