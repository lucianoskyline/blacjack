package com.blackjack.domain;

import lombok.Data;

import java.util.List;

@Data
public class Players {

    private Integer id;

    private String name;

    private List<Cards> cards;

    private Integer points;

}
