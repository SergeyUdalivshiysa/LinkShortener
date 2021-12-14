package com.yourcodereview.sergey.task1.controller;

import com.yourcodereview.sergey.task1.dto.GenerateRequestDto;
import com.yourcodereview.sergey.task1.dto.GenerateResponseDto;
import com.yourcodereview.sergey.task1.service.shortlinkgenerate.LinkShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ShortLinkGeneratorController {

    @Autowired
    private LinkShortenerService linkShortenerService;

    @PostMapping("/generate")
    @ResponseBody
    public GenerateResponseDto generateShortLink(@RequestBody @Valid GenerateRequestDto requestDto) {
        return linkShortenerService.handleGenerateShortLinkRequest(requestDto);
    }
}
