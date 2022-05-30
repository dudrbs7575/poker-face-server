package com.fourtrashes.pokerface.core.game;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Player {

    private String sessionId;
    private int turn;
    private boolean isDead;
    private boolean isReady;
    private ArrayList<Card> cardList;

    public Player(String sessionId){
        this.sessionId = sessionId;
        this.turn = -1;
        this.isDead = false;
        this.isReady = false;
        this.cardList = new ArrayList<>();
    }

    public void putInCard(int card, boolean isOpen){
        cardList.add(new Card(card, isOpen));
    }

    public void openCard(int card){
        for(Card c : cardList){
            if(c.getCard() == card){
                c.setOpen(true);
                return;
            }
        }
    }

    public void dumpCard(int card){
        for(int i=0;i<cardList.size();i++){
            if(cardList.get(i).getCard() == card){
                cardList.remove(i);
                return;
            }
        }
    }
}
