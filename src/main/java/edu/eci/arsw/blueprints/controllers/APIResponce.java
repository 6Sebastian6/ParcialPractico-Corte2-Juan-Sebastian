package edu.eci.arsw.blueprints.controllers;

public class APIResponce {
    public record ApiResponse<T>(int code, String message, T data) {}
}
