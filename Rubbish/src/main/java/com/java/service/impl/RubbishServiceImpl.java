package com.java.service.impl;

import com.java.mapper.RubbishMapper;
import com.java.pojo.Rubbish;
import com.java.service.RubbishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubbishServiceImpl implements RubbishService {
    @Autowired
    private RubbishMapper rubbishMapper;
    @Override
    public List<Rubbish> getrubbish(String RuName) {
        return rubbishMapper.getrubbish(RuName);
    }
}
