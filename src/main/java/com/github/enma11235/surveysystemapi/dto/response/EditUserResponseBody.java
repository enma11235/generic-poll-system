package com.github.enma11235.surveysystemapi.dto.response;

public class EditUserResponseBody {
    private String token;

    public EditUserResponseBody(String token) {
        this.token = token;
    }

    public EditUserResponseBody(){}

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
