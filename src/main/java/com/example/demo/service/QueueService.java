package com.example.demo.service;


import com.example.demo.pojo.Standard_Submit;

public interface QueueService {
    void sendSubmitToMQ(Standard_Submit submit, String errorCode);
    void sendReportToMQ(Standard_Submit submit, String errorCode);
}
