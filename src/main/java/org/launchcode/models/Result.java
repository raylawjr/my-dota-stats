package org.launchcode.models;

/**
 * Created by melissa on 4/29/17.
 * "status":1,
 "num_results":10,
 "total_results":500,
 "results_remaining":490,
 "matches":[
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    @Id
    @GeneratedValue
    private int id;

    private int status;
    private int num_results;
    private int total_results;
    private int results_remaining;
    private Matches[] matches;

    public Result() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }
    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }
    public int getResults_remaining() {
        return results_remaining;
    }

    public void setResults_remaining(int results_remaining) {
        this.results_remaining = results_remaining;
    }

    public Matches[] getMatches() {
        return matches;
    }

    public void setMatches(Matches[] matches) {
        this.matches = matches;
    }
}