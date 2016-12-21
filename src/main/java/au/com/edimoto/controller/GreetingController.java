package au.com.edimoto.controller;

import au.com.edimoto.entity.Greeting;
import au.com.edimoto.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by torree on 2/12/2016.
 */
@Controller
public class GreetingController {

    @Autowired
    UserEntity userEntity;

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

    @GetMapping("/saludar")
    public String saludarForm(Model model) {
        model.addAttribute("userEntity", userEntity);
        return "SaludarUser";
    }


}
