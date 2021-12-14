package com.yourcodereview.sergey.task1.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class LinkInformationEntity {

    @Id
    private String shortLink;
    private String longLink;
    private int count;

    public LinkInformationEntity(String shortLink, String longLink, int count) {
        this.shortLink = shortLink;
        this.longLink = longLink;
        this.count = count;
    }

    public LinkInformationEntity() {
    }
}
