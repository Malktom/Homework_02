package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
@Controller
public class RedirectController {

    @GetMapping("first")
    public String first() {

        return "first";
    }
    @GetMapping("third")
    public String third() {

        return "third";
    }
    @GetMapping("second")
    public String second() {

        return "redirect:/third";
    }
}
