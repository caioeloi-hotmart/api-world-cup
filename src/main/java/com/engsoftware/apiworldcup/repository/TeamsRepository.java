package com.engsoftware.apiworldcup.repository;

import com.engsoftware.apiworldcup.entity.Team;
import com.engsoftware.apiworldcup.utils.FileUtils;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class TeamsRepository {
    public String findAllTeams(){
        return FileUtils.readFromFile("todasAsSelecoes.json");
    }
}
