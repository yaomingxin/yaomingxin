package com.example.demo.filter;

import com.example.demo.exception.DataProcessException;
import com.example.demo.mapper.TestMapper;
import com.example.demo.pojo.Standard_Submit;
import com.example.demo.service.FilterChain;
import com.example.demo.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* 作者：张明
  *  项目名： dxpt
  *  时间：2020/1/11  11:33
  *  描述: 

*/
@Component
public class SmsblacknameFilter implements FilterChain {

    @Autowired
    private TestMapper phoneMapper;
    @Autowired
    private QueueService queueService;
    @Override
    public boolean dealObject(Standard_Submit standard_submit) throws DataProcessException {
//        String destMobile = standard_submit.getDestMobile ();
//        System.out.println ( "destMobile = " + destMobile );
//        pase pase = phoneMapper.blackname(destMobile);
//        if (pase==null) {
//            queueService.sendSubmitToMQ(standard_submit,com.zm.until.CacheConstants.CACHE_PREFIX_BLACK);
//            queueService.sendReportToMQ(standard_submit,com.zm.until.CacheConstants.CACHE_PREFIX_BLACK);
//            return true;
//        }
       return false;
    }
}
