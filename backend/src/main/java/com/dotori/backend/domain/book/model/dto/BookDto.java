package com.dotori.backend.domain.book.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class BookDto {
	private final Long bookId;
	private final String title;
	private final String bookImg;
	private final String author;
	private final String summary;
	private final int roleCnt;
}