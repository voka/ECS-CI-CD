package demo.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {

  @GetMapping("/")
  public String hello(){
    return "Hello";
  }
  @GetMapping("/{name}")
  public String helloWithName(@PathVariable String name){
    return "Hello " + name + " Welcome";
  }

  @GetMapping("/gogogo")
  public String yoyoyo(){
    return "v2222222222";
  }
}
