package com.yourcodereview.sergey.task1.service.shortlinkgenerate;

import com.yourcodereview.sergey.task1.dao.repository.ShortLinkInformationRepository;
import com.yourcodereview.sergey.task1.dto.GenerateRequestDto;
import com.yourcodereview.sergey.task1.dto.GenerateResponseDto;
import com.yourcodereview.sergey.task1.entity.LinkInformationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LinkShortenerService {

    @Autowired
    private ShortLinkGenerator shortLinkGenerator;
    @Autowired
    private ShortLinkInformationRepository repository;

    @Transactional
    public GenerateResponseDto handleGenerateShortLinkRequest(GenerateRequestDto requestDto) {
        String originalLink = requestDto.getOriginal();
        String shortLink = "/l/" + shortLinkGenerator.generateShortUrl(originalLink);
        if (!repository.existsById(shortLink)) {
            repository.save(new LinkInformationEntity(shortLink, originalLink, 0));
        }
        return new GenerateResponseDto(shortLink);
    }
}
