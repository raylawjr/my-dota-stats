package org.launchcode.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import javax.persistence.*;

/**
 * Created by melissa on 4/28/17.
 * "match_id":3141638883,
 "match_seq_num":2743721355,
 "start_time":1493229486,
 "lobby_type":0,
 "radiant_team_id":0,
 "dire_team_id":0,
 "players"
 */


public class Matches {

    @Id
    @GeneratedValue
    private int id;

    private int match_id;
    private int match_seq_num;
    private int start_time;
    private int lobby_type;
    private int radiant_team_id;
    private int dire_team_id;
    private Players[] players;

    public Matches() {
    }

    public int getId() {
        return id;
    }

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public int getMatch_seq_num() {
        return match_seq_num;
    }

    public void setMatch_seq_num(int match_seq_num) {
        this.match_seq_num = match_seq_num;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getLobby_type() {
        return lobby_type;
    }

    public void setLobby_type(int lobby_type) {
        this.lobby_type = lobby_type;
    }

    public int getRadiant_team_id() {
        return radiant_team_id;
    }

    public void setRadiant_team_id(int radiant_team_id) {
        this.radiant_team_id = radiant_team_id;
    }

    public int getDire_team_id() {
        return dire_team_id;
    }

    public void setDire_team_id(int dire_team_id) {
        this.dire_team_id = dire_team_id;
    }

    public Players[] getPlayers() {
        return players;
    }

    public void setPlayers(Players[] players) {
        this.players = players;
    }
}
