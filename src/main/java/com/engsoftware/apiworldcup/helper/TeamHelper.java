package com.engsoftware.apiworldcup.helper;

import com.engsoftware.apiworldcup.entity.Team;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@RequiredArgsConstructor
public class TeamHelper {
    private final ObjectMapper mapper;

    public List<Team> TeamsJsonToList(String json){
        try {
            JsonNode jsonArray = mapper.readTree(json);
            List<Team> teamList = new ArrayList<>();
            for (JsonNode element : jsonArray) {
                Team person = mapper.treeToValue(element, Team.class);
                teamList.add(person);
            }
            return teamList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
