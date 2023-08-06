package com.example.hw11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/welcome" )
public class WelcomeController {
    @GetMapping(path = "/name")
  public String name (){
      return "My name is Afnan";
    }
    @GetMapping(path = "/age")
    public String age(){
        return "My age is 22";
    }
    @GetMapping(path = "/check/status")
    public String status(){
        return "Everything OK";
    }
    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }
    @GetMapping(path = "/names")
    public String[] names(){
        String[] a={"Afnan","Amjad","Maha"};
        return a;
    }
}
