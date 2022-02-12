package main.Service;

import main.DTO.TeamDTO;
import main.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public List<TeamDTO> findAll() {
        return teamRepository.findAll()
                .stream()
                .map(TeamDTO::convert)
                .collect(Collectors.toList());
    }
}
