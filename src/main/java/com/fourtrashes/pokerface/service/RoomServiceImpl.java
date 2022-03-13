package com.fourtrashes.pokerface.service;

import com.fourtrashes.pokerface.domain.Room;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService{
    @Override
    public Optional<Room> createRoom() {
        return Optional.empty();
    }

    @Override
    public Integer joinRoom(Long roomId) {
        return null;
    }

    @Override
    public Integer leaveRoom(Long roomId) {
        return null;
    }

    @Override
    public Optional<List<Room>> getRoomList() {
        return Optional.empty();
    }
}
