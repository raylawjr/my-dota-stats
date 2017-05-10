package org.launchcode.models;

import javax.persistence.*;

/**
 * Created by melissa on 4/28/17.
 * account_id":4294967295,
 "player_slot":0,
 "hero_id":35
 */


public class Players {

    private int account_id;
    private int player_slot;
    private int hero_id;

    public Players() {
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getPlayer_slot() {
        return player_slot;
    }

    public void setPlayer_slot(int player_slot) {
        this.player_slot = player_slot;
    }

    public int getHero_id() {
        return hero_id;
    }

    public void setHero_id(int hero_id) {
        this.hero_id = hero_id;
    }
}
