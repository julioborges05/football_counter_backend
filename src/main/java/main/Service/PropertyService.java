package main.Service;

import main.DTO.PropertyDTO;
import main.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PropertyService {

    @Autowired
    PropertyRepository propertyRepository;

    public List<PropertyDTO> findAll() {
        return propertyRepository.findAll().stream().map(PropertyDTO::convert).collect(Collectors.toList());
    }

}
