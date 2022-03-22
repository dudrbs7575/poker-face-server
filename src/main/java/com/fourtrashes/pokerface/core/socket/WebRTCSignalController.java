package com.fourtrashes.pokerface.core.socket;

import com.fourtrashes.pokerface.domain.Room;
import com.fourtrashes.pokerface.dto.SignalingDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
public class WebRTCSignalController {
    private final SimpMessagingTemplate messagingTemplate;
    // 차후 레디스로 변경
    private Map<String, Object> roomCashMap = new HashMap<>();

    // 차후 DB에서 가져오도록 변경
    private Map<String, Room> roomList = new HashMap<>();

    @MessageMapping(value = "/join/room/{roomId}")
    public void joinRoom(
            @DestinationVariable int roomId,
            SimpMessageHeaderAccessor header,
            @Payload SignalingDTO.RoomJoinRequest request
    ) {
        log.info("request type: " + roomId);
        log.info("room id: " + request.getType());

        Object room = roomList.get(roomId);
        Object userRoomMappingInfo = roomCashMap.get(header.getSessionId());
        if (room == null) {
            /*
             TODO 예외처리
               - 이미 종료되었거나, 없는 방인 경우 별도 메시지 내려줄 것
             */
        }

        if (userRoomMappingInfo != null) {
            /*
             * TODO 이미 접속한 방이 있는 경우
             *  방의 상태에 따라 분기처리 필요
             * 1. 게임이 진행중인 방인 경우 - 접속 가능 여부 판별후 -> 게임 재접속 or 패배 처리
             * 2. 방이 없어진 경우 해당 cash 정보 삭제
             * 3. 게임이 진행중이지 않은 방인 경우 -> 방이 꽉 찼는지 여부에 따라 분기 처리
             * */
        }

        messagingTemplate.convertAndSend("/sub/room/" + roomId, "");
    }

    @MessageMapping(value = "/offer/room/{roomId}")
    public void offer(@Payload SignalingDTO payload, SimpMessageHeaderAccessor header) {
    }

    @MessageMapping(value = "/answer/room/{roomId}")
    public void answer(@Payload SignalingDTO payload, SimpMessageHeaderAccessor header) {
    }
}
