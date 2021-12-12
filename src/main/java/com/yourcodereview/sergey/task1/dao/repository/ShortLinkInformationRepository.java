package com.yourcodereview.sergey.task1.dao.repository;

import com.yourcodereview.sergey.task1.entity.LinkInformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShortLinkInformationRepository extends JpaRepository<LinkInformationEntity, String> {

}

