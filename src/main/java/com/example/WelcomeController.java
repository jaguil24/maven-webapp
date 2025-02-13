package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";  // This will resolve to /WEB-INF/jsp/welcome.jsp
    }
}
