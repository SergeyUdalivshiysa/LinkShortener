package com.yourcodereview.sergey.task1.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@JsonSerialize
@Data
public class GenerateResponseDto {
    private String link;

    public GenerateResponseDto(String link) {
        this.link = link;
    }
}
