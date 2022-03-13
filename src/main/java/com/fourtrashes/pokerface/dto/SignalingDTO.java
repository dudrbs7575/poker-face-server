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
    static class CandidateRequest {
        private String to;
        private String type;   // offer, answer, join
        private String roomId;   //차후 String or Integer로 결정 필요
        private Object candidate;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    static class CandidateResponse {
        private String from;
        private String type;   // offer, answer, join
        private Object candidate;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    static class SdpRequest {
        private String to;
        private String type;   // offer, answer, join
        private String roomId;   //차후 String or Integer로 결정 필요
        private Object sdp;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    static class SdpResponse {
        private String from;
        private String type;   // offer, answer, join
        private Object sdp;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    static class RoomJoinRequest {
        private String type;   // offer, answer, join
        private String roomId;   //차후 String or Integer로 결정 필요
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    static class RoomJoinResponse {
        private String from;   // offer, answer, join
    }
}
