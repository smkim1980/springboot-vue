package com.sm.springvue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class SpringVueController {

    @Value("${spring.pid.file}")
    private String springPidFileName;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Value("${springboot.vue.name : local}")
    private String springbootVueName;

    @GetMapping("/active")
    public Map<String ,String > getYml(){

        log.info("pid={},profile={}",springPidFileName,activeProfile);

        Map<String,String> result = new HashMap<>();
        result.put("springPidFileName" , springPidFileName);
        result.put("activeProfile" , activeProfile);
        result.put("springbootVueName" , springbootVueName);

        return result;
    }
}
