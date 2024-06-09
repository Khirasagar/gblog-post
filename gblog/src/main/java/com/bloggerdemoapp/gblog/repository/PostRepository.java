package com.bloggerdemoapp.gblog.repository;

import com.bloggerdemoapp.gblog.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}