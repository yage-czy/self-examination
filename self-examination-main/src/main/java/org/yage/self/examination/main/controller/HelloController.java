package org.yage.self.examination.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping(value = "/hi")
public class HelloController {

    /**
     * @param name
     * @return
     */
    @RequestMapping("/sayHello")
    public Map<String, Object> sayHello(@RequestParam String name) {

        Map<String, Object> result = new HashMap<>();

        result.put("name", name);
        result.put("code", "00000");
        result.put("message", "success");

        return result;
    }
}
