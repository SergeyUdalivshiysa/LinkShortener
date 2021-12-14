package com.yourcodereview.sergey.task1.service.redirect;

import com.yourcodereview.sergey.task1.dao.repository.ShortLinkInformationRepository;
import com.yourcodereview.sergey.task1.entity.LinkInformationEntity;
import com.yourcodereview.sergey.task1.service.statistics.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class RedirectService {

    @Autowired
    private StatisticService statisticService;
    @Autowired
    private ShortLinkInformationRepository repository;

    @Transactional
    public String getRedirectLink(String shortLink) {
        Optional<LinkInformationEntity> optional = repository.findById(shortLink);
        if (optional.isPresent()) {
            LinkInformationEntity entity = optional.get();
            repository.save(new LinkInformationEntity(entity.getShortLink(), entity.getLongLink(), entity.getCount() + 1));
            return entity.getLongLink();
        }
        return "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
    }
}
