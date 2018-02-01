package io.pivotal.pal.tracker;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Value;
=======

import org.springframework.beans.factory.annotation.Value;

>>>>>>> 36a1e68ddc0a7612a7cd2fafb42c6bd9fee91964
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
<<<<<<< HEAD
public class WelcomeController {

    private String welcomeMessage;

    public WelcomeController(
        @Value("${welcome_message}") String welcomeMessage
    ) {
        this.welcomeMessage = welcomeMessage;
    }

    @GetMapping("/")
    public String sayHello() {
        return welcomeMessage;
    }
}
=======

public class WelcomeController {

    
    public String helloMessage;

    @GetMapping("/")
    public String sayHello() {
        return helloMessage;
    }

    public WelcomeController( @Value("${helloMessage}") String message) {
        helloMessage = message;
    }
}
>>>>>>> 36a1e68ddc0a7612a7cd2fafb42c6bd9fee91964
