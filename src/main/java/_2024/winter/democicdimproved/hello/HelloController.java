package _2024.winter.democicdimproved.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<String> printHello(){
        return ResponseEntity.ok().body("Hello, World! kkkk");
    }
    @GetMapping("/bye")
    public ResponseEntity<String> printBye(){
        return ResponseEntity.ok().body("Bye, World!");
    }
}
