package com.example.springboot_class_01_050724;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAPI {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }

    @RequestMapping("/hello/{name}")
    public String HelloName(@PathVariable("name") String name) {
        return "Hello " + name + " !";
    }

    @RequestMapping("/hello/{name}/{times}")
    public String helloNameTimes(@PathVariable("name") String name, @PathVariable("times") int times) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= times; i++) {
            sb.append("Hello ").append(name).append(" ! ").append(i).append("<br>");
        }
        return sb.toString();
    }
}
