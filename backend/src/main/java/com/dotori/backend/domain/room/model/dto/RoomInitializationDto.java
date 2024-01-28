package com.dotori.backend.domain.room.model.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomInitializationDto {
	private Map<String, Object> sessionProperties;
	private Map<String, Object> roomInfo;
}
