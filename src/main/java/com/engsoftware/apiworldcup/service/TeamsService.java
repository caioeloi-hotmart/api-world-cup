package com.engsoftware.apiworldcup.service;

import com.engsoftware.apiworldcup.entity.Team;
import com.engsoftware.apiworldcup.helper.TeamHelper;
import com.engsoftware.apiworldcup.repository.TeamsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamsService {

    private final TeamsRepository teamsRepository;
    private final TeamHelper teamHelper;

    public List<Team> findAllTeams(){
        String allTeams = teamsRepository.findAllTeams();
        return teamHelper.TeamsJsonToList(allTeams);
    }

}
