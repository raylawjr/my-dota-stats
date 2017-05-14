package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by melissa on 4/27/17.
 */
@Controller
@RequestMapping(value = "results")
public class ResultsController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model){

        return "home/index";
    }
}
//    Your Steam Web API Key
//        Key: D20066DD449AC4A8A4EA3110B5BA4EAE
//        Domain Name: my-dota-stats