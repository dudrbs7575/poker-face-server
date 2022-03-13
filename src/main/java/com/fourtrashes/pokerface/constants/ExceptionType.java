package com.fourtrashes.pokerface.constants;

public enum ExceptionType {
    NOT_FOUNT_RESOURCE("E001", "데이터가 존재하지 않습니다.");
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
