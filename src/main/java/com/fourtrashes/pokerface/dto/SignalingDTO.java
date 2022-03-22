package com.fourtrashes.pokerface.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class SignalingDTO {

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class CandidateRequest {
        private String to;
        private String type;   // offer, answer, join
        private String roomId;   //차후 String or Integer로 결정 필요
        private Object candidate;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class CandidateResponse {
        private Long code;
        private String from;
        private String type;   // offer, answer, join
        private Object candidate;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class SdpRequest {
        private String to;
        private String type;   // offer, answer, join
        private String roomId;   //차후 String or Integer로 결정 필요
        private Object sdp;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class SdpResponse {
        private Long code;
        private String from;
        private String type;   // offer, answer, join
        private Object sdp;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class RoomJoinRequest {
        private String type;   // offer, answer, join
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class RoomJoinResponse {
        private Long code;
        private String from;   // offer, answer, join
    }
}
