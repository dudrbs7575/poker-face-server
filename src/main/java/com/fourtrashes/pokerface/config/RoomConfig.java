package com.fourtrashes.pokerface.config;

import com.fourtrashes.pokerface.domain.Room;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class RoomConfig {
    @Bean
    public ConcurrentHashMap<String, Room> roomList() {
        return new ConcurrentHashMap<>();
    }
}
