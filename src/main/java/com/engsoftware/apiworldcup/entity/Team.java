package com.engsoftware.apiworldcup.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Team {
    int id;
    String name;
    Stadium stadium;
}
