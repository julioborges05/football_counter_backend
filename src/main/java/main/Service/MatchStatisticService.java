package main.Service;

import main.DTO.MatchStatisticDTO;
import main.Repository.MatchStatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchStatisticService {

    @Autowired
    MatchStatisticRepository matchStatisticRepository;

    public List<MatchStatisticDTO> findAll() {
        return matchStatisticRepository.findAll()
                .stream()
                .map(MatchStatisticDTO::convert)
                .collect(Collectors.toList());
    }
}
