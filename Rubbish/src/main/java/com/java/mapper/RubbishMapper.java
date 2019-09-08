package com.java.mapper;

import com.java.pojo.Rubbish;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface RubbishMapper {
    List<Rubbish> getrubbish(@Param(value = "RuName") String RuName);

}
