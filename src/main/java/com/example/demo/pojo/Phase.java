package com.example.demo.pojo;

import lombok.Data;

/**
* 作者：张明
  *  项目名： demo
  *  时间：2020/1/11  20:54
  *  描述: 

*/
@Data
public class Phase {
    private long id;
    private String phase;
    private long provId;
    private long cityId;
}
