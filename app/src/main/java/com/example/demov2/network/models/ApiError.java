package com.example.demov2.network.models;

public class ApiError {
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    private String error;

    public ApiError(String error) {
        this.error = error;
    }
}
