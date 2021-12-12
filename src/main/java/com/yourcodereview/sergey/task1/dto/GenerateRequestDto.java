package com.yourcodereview.sergey.task1.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class GenerateRequestDto {
    @NotEmpty
    private String original;
}
