package com.engsoftware.apiworldcup.controller;

import com.engsoftware.apiworldcup.entity.Team;
import com.engsoftware.apiworldcup.service.TeamsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/teams")
public class TeamsController {
    private TeamsService teamsService;

    @GetMapping("/allTeams")
    @ResponseBody
    public List<Team> getAllTeams(){
        return teamsService.findAllTeams();
    }
}
