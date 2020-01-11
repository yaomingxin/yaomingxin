package com.example.demo.filter;

import com.example.demo.exception.DataProcessException;
import com.example.demo.mapper.TestMapper;
import com.example.demo.pojo.Phase;
import com.example.demo.pojo.Standard_Submit;
import com.example.demo.service.FilterChain;
import com.example.demo.until.CheckPhone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
  * 作者：张明
  *  项目名： dxpt
  *  时间：2020/1/10  17:19
  *  描述:
*/
@Service
public class SmsOpIdFilter implements FilterChain {

    private final static Logger log = LoggerFactory.getLogger(SmsOpIdFilter.class);

    @Autowired
    private TestMapper phoneMapper;

    @Override
    public boolean dealObject(Standard_Submit standard_submit) throws DataProcessException {
        Phase pase = new Phase ();
        String mobile = standard_submit.getDestMobile ();
        if (CheckPhone.isChinaMobilePhoneNum(mobile)) {
            standard_submit.setOperatorId(1);
        } else if (CheckPhone.isChinaUnicomPhoneNum(mobile)) {
            standard_submit.setOperatorId(2);
        } else {
            standard_submit.setOperatorId(3);
        }
        String substring = mobile.substring ( 0, 7 );
        Phase provId =null;
        Phase pase1 = new Phase ();

        System.err.println ( "pase1 = " + pase1 );

//        pase1.setPhase ( substring );
//        System.err.println ( "pase1 = " + pase1 );
//        try {
//            provId = phoneMapper.mySelectOne ( pase1.getPhase () );
//            System.out.println ( "provId = " + provId );
//        } catch (Exception e) {
//            e.printStackTrace ();
//        }
//        if (provId != null) {
//            standard_submit.setDestMobile ( mobile );
//            standard_submit.setProvinceId ( provId.getProvId ().intValue () );
//            standard_submit.setCityId ( provId.getCityd ().intValue () );
//            System.out.println ( "standard_submit = " + standard_submit );
//        }else{
//            log.warn("没有找到此上行手机号的区域:{}", mobile);
//        }
        return true;
    }
}
