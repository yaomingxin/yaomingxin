package com.example.demo;

import com.example.demo.mapper.TestMapper;
import com.example.demo.pojo.Phase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    TestMapper testMapper;

    @Test
    void contextLoads() {
        Phase phase = testMapper.selectOne ( "1393927" );
        System.out.println ( phase );
    }

}
