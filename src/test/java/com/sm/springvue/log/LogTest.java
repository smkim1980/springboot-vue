package com.sm.springvue.log;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
@Slf4j
public class LogTest {

    @Test
    public void logTest(){
        String test = "Log test";
        log.debug("DEBUG-TEST={}",test);
        log.info("INFO-TEST={}",test);
        log.warn("WARN-test{}" , test);
        log.error("ERROR-test={}" , test);
    }
}
