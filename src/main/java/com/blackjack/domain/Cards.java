package com.blackjack.domain;

import lombok.Data;

@Data
public class Cards {

    private Integer id;

    private String naipe;

    private String name;

    private Integer value;

    public Cards(String naipe, String name, Integer value) {
        this.naipe = naipe;
        this.name = name;
        this.value = value;
    }

}
