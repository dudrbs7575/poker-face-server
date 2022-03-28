package com.fourtrashes.pokerface.service;

import com.fourtrashes.pokerface.domain.Room;

public interface RoomService {
    Room createRoom();
    void joinRoom(String url, Object user);
    void leaveRoom(String url, Object user);
}
