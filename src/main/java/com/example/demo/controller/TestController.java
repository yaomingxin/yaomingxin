package com.example.demo.controller;


import com.example.demo.exception.DataProcessException;
import com.example.demo.filter.SmsOpIdFilter;
import com.example.demo.pojo.Standard_Submit;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* 作者：张明
  *  项目名： dxpt
  *  时间：2020/1/10  20:26
  *  描述: 

*/
@Controller
@RequestMapping("test")
public class TestController {

    @ResponseBody
    @RequestMapping("test1")
    public String test( @Param ( "destMobile" ) String destMobile ) throws DataProcessException {

        SmsOpIdFilter smsOpIdFilter = new SmsOpIdFilter ();
        Standard_Submit standard_submit = new Standard_Submit ();
        standard_submit.setDestMobile ( destMobile );
        boolean b = smsOpIdFilter.dealObject ( standard_submit );
        System.out.println ( "b = " + b );
        return destMobile;
    }
}