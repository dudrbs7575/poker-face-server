package com.fourtrashes.pokerface.service;

import com.fourtrashes.pokerface.domain.Room;
import com.fourtrashes.pokerface.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService{
    private final RoomRepository roomRepository;

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
}
