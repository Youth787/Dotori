package com.dotori.backend.domain.video.model;

import com.dotori.backend.domain.video.model.dto.VideoDto;
import com.dotori.backend.domain.video.model.entity.Video;

public class VideoMapper {
	public static VideoDto toVideoDto(Video video) {
		return new VideoDto(video.getVideoId(), video.getPath());
	}
}
