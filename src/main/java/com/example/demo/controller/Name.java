package com.example.demo.controller;
import org.springframework.stereotype.Controller; // import controller
import org.springframework.ui.Model; //import model
import org.springframework.web.bind.annotation.RequestMapping; //mapping
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping(value="")
public class Name {
    @RequestMapping(value = "")
    public String index(Model model, HttpServletRequest request) //HttpServletRequest is used to query params
    {
        String test="hi";
        String search=request.getParameter("q");
        System.out.println(search);
        if (search == null) {
            search = "Enter your name in the query params \"?q=[YOURNAME]\"";
        }

        else search="Hello "+search;
        model.addAttribute("search",search);

        return "index";
    }

}
