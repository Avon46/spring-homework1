package com.example.demo.dto;

public class ErrorResponse {

    private int status;
    private String message;
    private String path;
    private String timeStamp;

    public ErrorResponse(int status, String message, String path, String timeStamp) {
        this.status = status;
        this.message = message;
        this.path = path;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }

    public String getTimeStamp() {
        return timeStamp;
    }
}