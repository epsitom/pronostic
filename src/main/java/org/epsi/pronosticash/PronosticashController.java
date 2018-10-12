package org.epsi.pronosticash;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PronosticashController {

    @RequestMapping("/")
    public String index() {
        return "TEST";
    }
}
