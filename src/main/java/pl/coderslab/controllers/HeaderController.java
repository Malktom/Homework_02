package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class HeaderController {


    @GetMapping("/showUserAgent")
public String showUserAgent (Model model, @RequestHeader("User-Agent") String header) {
        model.addAttribute("userAgent", header);

        return "userAgent";
    }
}
