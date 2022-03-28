package com.fourtrashes.pokerface.constants;

public enum ExceptionType {
    NOT_FOUNT_RESOURCE("E001", "데이터가 존재하지 않습니다."),
    NOT_EXIST_ROOM("R001", "존재하지 않는 방입니다."),
    ALREADY_FULL_ROOM("R002", "이미 사용자가 가득찬 방입니다."),
    ALREADY_EXIT_ROOM("R003", "이미 종료된 방입니다.");
    private String code;
    private String message;

    ExceptionType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
