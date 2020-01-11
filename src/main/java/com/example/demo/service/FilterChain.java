package com.example.demo.service;


import com.example.demo.exception.DataProcessException;
import com.example.demo.pojo.Standard_Submit;

public interface FilterChain {
    public boolean dealObject(Standard_Submit standard_submit) throws DataProcessException;
}

