package com.yourcodereview.sergey.task1.controller;

import com.yourcodereview.sergey.task1.service.redirect.RedirectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RedirectController {

    @Autowired
    private RedirectService redirectService;

    @GetMapping("/l/{shortLink}")
    public ModelAndView redirect(@PathVariable("shortLink") String shortLink) {
        return new ModelAndView("redirect:" + redirectService.getRedirectLink("/l/" + shortLink));
    }
}
