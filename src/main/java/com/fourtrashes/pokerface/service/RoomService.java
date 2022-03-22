package com.fourtrashes.pokerface.service;

import com.fourtrashes.pokerface.domain.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    Optional<Room> createRoom();
    Integer joinRoom(Long roomId);
    Integer leaveRoom(Long roomId);
}