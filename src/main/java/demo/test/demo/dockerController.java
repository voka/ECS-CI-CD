package demo.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {

  @GetMapping("/")
  public String hello(){
    return "Hello";
  }
}
