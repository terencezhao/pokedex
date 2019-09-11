package edu.uchicago.zhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The IndexController is a basic Spring REST controller that displays the home page of the application.
 * As you can see from the @RequestMapping, it can be accessed from the / endpoint
 * It returns a String "index" which correlates with the "index.html" resource available in the project resources.
 * Created by teren on 8/22/2016.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    String index() {
        return "index";
    }
}
