package com.greenfox.peertopeer.DTO;

public class ResponseMessageDto {

    private String status;
    private String message;

    public ResponseMessageDto(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseMessageDto() {
        this.status = status;
        this.message = message;
    }

    public ResponseMessageDto(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
