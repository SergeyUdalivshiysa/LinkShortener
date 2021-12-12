package com.yourcodereview.sergey.task1.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class LinkInformationEntity {

    @Id
    String shortLink;

    String longLink;

    int count;

    public LinkInformationEntity(String shortLink, String longLink, int count) {
        this.shortLink = shortLink;
        this.longLink = longLink;
        this.count = count;
    }

    public LinkInformationEntity() {
    }
}
