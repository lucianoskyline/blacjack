package com.blackjack.service;

import com.blackjack.domain.Cards;
import com.blackjack.domain.Players;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class PlayersService {

    public Players create(String name) {
        Players player = new Players();
        player.setId(new Random().nextInt());
        player.setName(name.toUpperCase());
        player.setPoints(0);
        player.setCards(new ArrayList<>());
        return player;
    }

    public Players pullCard(Players player, List<Cards> deck) {
        Cards topCard = deck.get(deck.size() - 1);
        player.getCards().add(topCard);
        player.setPoints(refreshPoints(player));
        deck.remove(topCard);
        return player;
    }

    public Integer refreshPoints(Players player) {
        AtomicInteger point = new AtomicInteger(0);
        player.getCards().forEach(c -> {
            point.addAndGet(c.getValue());
        });
        return point.get();
    }

}
