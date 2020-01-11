package com.example.demo.mapper;

import com.example.demo.pojo.Phase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
* 作者：张明
  *  项目名： demo
  *  时间：2020/1/11  20:54
  *  描述: 

*/
@Component
@Mapper
public interface TestMapper {

    @Select ( "select * from t_phase where phase = #{phase}" )
    Phase selectOne(String phase);
}
