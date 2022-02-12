package main.Controller;

import main.DTO.MatchDTO;
import main.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatchController {

    @Autowired
    MatchService matchService;

    @GetMapping("/findAllMatches")
    public List<MatchDTO> findAll() {
        return matchService.findAll();
    }
}
