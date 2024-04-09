package org.example.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${injected.env.var}")
    private String injectedEnvVar;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! <br>" +
                "I have an env variable as INJECTED_ENV_VAR : " + injectedEnvVar;
    }
}
