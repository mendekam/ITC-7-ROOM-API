package com.example.eplstanding.service;

public interface StandingListener<T> {
    void onSuccess(T items);
    void onFailed(String msg);
}

