package com.blackjack;

import com.blackjack.service.BlackjackService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlackjackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlackjackApplication.class, args);

        BlackjackService blackjackService = new BlackjackService();
        blackjackService.startGame();
    }

}
