package com.spring.diary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy년 M월 d일 aa h시 m분 s초 z");
        Date now = new Date();
        String formattedDate = dateFormat.format(now);

        model.addAttribute("serverTime", formattedDate);

        return "index";
    }
}
