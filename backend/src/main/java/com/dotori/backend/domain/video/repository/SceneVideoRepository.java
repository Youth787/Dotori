package com.dotori.backend.domain.video.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dotori.backend.domain.video.model.entity.SceneVideo;

public interface SceneVideoRepository extends JpaRepository<SceneVideo, Long> {
}
