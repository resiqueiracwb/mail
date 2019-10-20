package br.com.vivo.james.api;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JamesController {

    @Value("${spring.application.name}")
    private String james;

    @GetMapping("/")
    public String homePage(Model model){

        model.addAttribute("appName",  james);

        return "app";
    }

}
