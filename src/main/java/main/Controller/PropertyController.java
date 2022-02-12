package main.Controller;

import main.DTO.PropertyDTO;
import main.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropertyController {

    @Autowired
    PropertyService propertyService;

    @GetMapping("/findAllProperties")
    public List<PropertyDTO> findAllProperties() {
        return propertyService.findAll();
    }
}
