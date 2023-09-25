package com.blackjack.service;

import com.blackjack.domain.Cards;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckService {

    public List<Cards> create() {
        List<Cards> deck = new ArrayList<>();
        deck.add(insertCard("as", "Copas", 11));

        deck.add(insertCard("dois", "Copas", 2));

        deck.add(insertCard("tres", "Copas", 3));

        deck.add(insertCard("quatro", "Copas", 4));

        deck.add(insertCard("cinco", "Copas", 5));

        deck.add(insertCard("seis", "Copas", 6));

        deck.add(insertCard("sete", "Copas", 7));

        deck.add(insertCard("oito", "Copas", 8));

        deck.add(insertCard("nove", "Copas", 9));

        deck.add(insertCard("dez", "Copas", 10));

        deck.add(insertCard("valete", "Copas", 10));

        deck.add(insertCard("dama", "Copas", 10));

        deck.add(insertCard("rei", "Copas", 10));

        deck.add(insertCard("as", "Paus", 11));

        deck.add(insertCard("dois", "Paus", 2));

        deck.add(insertCard("tres", "Paus", 3));

        deck.add(insertCard("quatro", "Paus", 4));

        deck.add(insertCard("cinco", "Paus", 5));

        deck.add(insertCard("seis", "Paus", 6));

        deck.add(insertCard("sete", "Paus", 7));

        deck.add(insertCard("oito", "Paus", 8));

        deck.add(insertCard("nove", "Paus", 9));

        deck.add(insertCard("dez", "Paus", 10));

        deck.add(insertCard("valete", "Paus", 10));

        deck.add(insertCard("dama", "Paus", 10));

        deck.add(insertCard("rei", "Paus", 10));

        deck.add(insertCard("as", "Ouro", 11));

        deck.add(insertCard("dois", "Ouro", 2));

        deck.add(insertCard("tres", "Ouro", 3));

        deck.add(insertCard("quatro", "Ouro", 4));

        deck.add(insertCard("cinco", "Ouro", 5));

        deck.add(insertCard("seis", "Ouro", 6));

        deck.add(insertCard("sete", "Ouro", 7));

        deck.add(insertCard("oito", "Ouro", 8));

        deck.add(insertCard("nove", "Ouro", 9));

        deck.add(insertCard("dez", "Ouro", 10));

        deck.add(insertCard("valete", "Ouro", 10));

        deck.add(insertCard("dama", "Ouro", 10));

        deck.add(insertCard("rei", "Ouro", 10));

        deck.add(insertCard("as", "Espadas", 11));

        deck.add(insertCard("dois", "Espadas", 2));

        deck.add(insertCard("tres", "Espadas", 3));

        deck.add(insertCard("quatro", "Espadas", 4));

        deck.add(insertCard("cinco", "Espadas", 5));

        deck.add(insertCard("seis", "Espadas", 6));

        deck.add(insertCard("sete", "Espadas", 7));

        deck.add(insertCard("oito", "Espadas", 8));

        deck.add(insertCard("nove", "Espadas", 9));

        deck.add(insertCard("dez", "Espadas", 10));

        deck.add(insertCard("valete", "Espadas", 10));

        deck.add(insertCard("dama", "Espadas", 10));

        deck.add(insertCard("rei", "Espadas", 10));

        return deck;
    }

    private Cards insertCard(String naipe, String name, Integer value) {
        return new Cards(naipe, name, value);
    }

    public List<Cards> shuffle(List<Cards> deck) {
        Collections.shuffle(deck);
        return deck;
    }

}
