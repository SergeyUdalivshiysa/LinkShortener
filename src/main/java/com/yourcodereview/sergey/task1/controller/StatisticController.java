package com.yourcodereview.sergey.task1.controller;

import com.yourcodereview.sergey.task1.entity.LinkInformationEntity;
import com.yourcodereview.sergey.task1.service.statistics.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatisticController {

    @Autowired
    private StatisticService statisticService;

    @GetMapping("/stats")
    @ResponseBody
    public List<LinkInformationEntity> getAllStatistic() {
        return statisticService.getAllStatistics();
    }

    @GetMapping("/stat/{link}")
    @ResponseBody
    public LinkInformationEntity getByShortLink(@PathVariable String link) {
        return statisticService.getByShortLink("/l/" + link);
    }
}
