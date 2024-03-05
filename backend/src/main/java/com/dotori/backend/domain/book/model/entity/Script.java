package com.dotori.backend.domain.book.model.entity;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
@Table(name = "script")
public class Script {
	@Id
	@Column(name = "script_id")
	@GeneratedValue(strategy = IDENTITY)
	private Long scriptId;

	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;

	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "scene_id", nullable = false)
	private Scene scene;

	@Column(name = "script_order")
	private int scriptOrder;

	@Column(length = 100, name = "content")
	private String content;

	@Builder
	public Script(Role role, Scene scene, int scriptOrder, String content) {
		this.role = role;
		this.scene = scene;
		this.scriptOrder = scriptOrder;
		this.content = content;
	}
}
