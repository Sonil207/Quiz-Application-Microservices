package com.sonil.quiz_service.model;

public class Response {

    private Integer id;
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Integer getId() {
        return id;
    }


    public Response(Integer id, String response) {
        this.id = id;
        this.response = response;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Response() {
    }
}
