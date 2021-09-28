package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("skill-tracker")
    @ResponseBody
    public String skillTracker(){
        return "<html><body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> Here are some languages! </h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> Python </li>" +
                "<li> JavaScript </li>" +
                "</ol>" +
                "</body></html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillTrackerForm(){
        return "<html><body>" +
                "<label>Name:</label>" +
                "<br/>" +
                "<form action='form' method='post'>" +
                "<input type='text' name='name'>" +
                "<br/>" +
                "<label>My favorite language:</label>" +
                "<br/>" +
                "<select name='firstChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='JavaScript'>JavaScript</option></select>" +
                "<br/>" +
                "<label> My second favorite language: </label>" +
                "<br/>" +
                "<select name='secondChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='JavaScript'>JavaScript</option></select>" +
                "<br/>" +
                "<label> My third favorite language: </label>" +
                "<br/>" +
                "<select name='thirdChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='JavaScript'>JavaScript</option></select>" +
                "<br/>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body></html>";
    }

//    @PostMapping("form")
//    @ResponseBody
//    public String skillTrackerAdd(@RequestParam String submit){
//        return
//    }

}
