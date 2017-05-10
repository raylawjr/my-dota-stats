package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Created by melissa on 4/27/17.
 */
@Controller
public class ResultsController {

    public String index(Model model){

        return "index";
    }
}
//    Your Steam Web API Key
//        Key: D20066DD449AC4A8A4EA3110B5BA4EAE
//        Domain Name: my-dota-stats