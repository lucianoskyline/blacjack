package com.blackjack.service;

import com.blackjack.common.PlayersConstants;
import com.blackjack.domain.Players;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.when;

public class BlackjackServiceTest {

    @Mock
    public BlackjackService blackjackService=new BlackjackService();


    @Test
    public void createPlayer(){
        blackjackService.createPlayer(PlayersConstants.PLAYER_NAME);
        Assertions.assertThat(blackjackService.players).isNotEmpty();
    }

    @Test
    public void sendCardsByPlayer(){
        blackjackService.createPlayer(PlayersConstants.PLAYER_NAME);
        blackjackService.deck= blackjackService.deckService.create();
        blackjackService.sendCardsByPlayer();
        Assertions.assertThat(blackjackService.players.get(0).getCards()).isNotEmpty();
    }

    @Test
    public void pullCard(){
        blackjackService.createPlayer(PlayersConstants.PLAYER_NAME);
        Players player=blackjackService.players.get(0);
        blackjackService.deck= blackjackService.deckService.create();
        blackjackService.sendCardsByPlayer();
        blackjackService.pullCard(player);

        Assertions.assertThat(player.getCards()).isNotEmpty();
        Assertions.assertThat(player.getCards()).hasSize(2);
    }

}
