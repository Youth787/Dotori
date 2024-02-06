package com.dotori.backend.domain.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dotori.backend.domain.room.model.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
