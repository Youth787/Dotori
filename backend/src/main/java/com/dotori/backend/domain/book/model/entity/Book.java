package com.dotori.backend.domain.book.model.entity;

import static javax.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
@Table(name = "book")
@DynamicInsert
public class Book {
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = IDENTITY)
	private Long bookId;

	@Column(length = 20)
	private String title;

	@Column(length = 100, name = "book_img")
	private String bookImg;

	@Column(length = 20)
	@ColumnDefault("'저자 미상'")
	private String author;

	@Column(length = 300)
	private String summary;

	@Column(name = "role_cnt")
	private int roleCnt;

	@Builder
	public Book(String title, String bookImg, String author, String summary, int roleCnt) {
		this.title = title;
		this.bookImg = bookImg;
		this.author = author;
		this.summary = summary;
		this.roleCnt = roleCnt;
	}
}
