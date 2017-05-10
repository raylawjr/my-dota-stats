package org.launchcode.controllers;

import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by melissa on 4/27/17.
 */

@Controller
@RequestMapping("")
public class HomeController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("title", "Welcome to MyDotaStats");
        return "home/home";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String processSteamIdField(@RequestParam("steamid")String steamid) throws IOException {
        //if (errors.hasErrors()) {
        //    model.addAttribute("title", "Welcome to MyDotaStats");

  //          return "home/home";
//        }

      //  String SUrl = "https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/?key=D20066DD449AC4A8A4EA3110B5BA4EAE&matches_requested=10&account_id="+steamid;

        // Result result = getmatchhistory(steamid);
        // model.addAttribute("result". result);
        return "";
    }
}

//Your Steam Web API Key
//Key: D20066DD449AC4A8A4EA3110B5BA4EAE
//        Domain Name: my-dota-stats
// steamid 76561198047185950