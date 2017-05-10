package org.launchcode.services;

/**
 * Created by melissa on 5/9/17.
 */
public class SteamService {
    public static void getMatchHistory(String steamid){
        String MatchHistoryUrl = "https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/?key=D20066DD449AC4A8A4EA3110B5BA4EAE&matches_requested=10&account_id="+steamid;
    }
}
