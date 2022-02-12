package main.Service;

import main.DTO.MatchDTO;
import main.Repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

    public List<MatchDTO> findAll() {
        return matchRepository.findAll()
                .stream()
                .map(MatchDTO::convert)
                .collect(Collectors.toList());
    }
}
