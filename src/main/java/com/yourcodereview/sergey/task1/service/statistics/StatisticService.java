package com.yourcodereview.sergey.task1.service.statistics;


import com.yourcodereview.sergey.task1.dao.repository.ShortLinkInformationRepository;
import com.yourcodereview.sergey.task1.entity.LinkInformationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticService {

    @Autowired
    private ShortLinkInformationRepository repository;


    public List<LinkInformationEntity> getAllStatistics() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "count"));
    }

    public LinkInformationEntity getByShortLink(String link) {
         return repository.findById(link).orElseGet(LinkInformationEntity::new);
    }
}
