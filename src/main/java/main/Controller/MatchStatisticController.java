package main.Controller;

import main.DTO.MatchStatisticDTO;
import main.Service.MatchStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatchStatisticController {

    @Autowired
    MatchStatisticService matchStatisticService;

    @GetMapping("/findAllMatchStatistics")
    public List<MatchStatisticDTO> findAll() {
        return matchStatisticService.findAll();
    }

}
