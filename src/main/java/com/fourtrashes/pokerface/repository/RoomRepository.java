package com.fourtrashes.pokerface.repository;

import com.fourtrashes.pokerface.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
