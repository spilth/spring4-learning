package org.spilth.testweb;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "<h1>Hello from `src/main/java/org/spilth/testweb/HelloController`.</h1>";
    }
}
