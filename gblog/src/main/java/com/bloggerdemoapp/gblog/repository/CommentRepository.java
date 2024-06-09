package com.bloggerdemoapp.gblog.repository;

import com.bloggerdemoapp.gblog.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
}