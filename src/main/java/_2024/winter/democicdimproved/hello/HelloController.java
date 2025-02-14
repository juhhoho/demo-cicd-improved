package _2024.winter.democicdimproved.hello;

import _2024.winter.democicdimproved.email.entity.Email;
import _2024.winter.democicdimproved.email.repository.EmailRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class HelloController {

    private final EmailRepository emailRepository;

    @GetMapping("/hello")
    public ResponseEntity<String> printHello(){
        log.info("[HelloController - printHello]");

        List<Email> all = emailRepository.findAll();
        log.info(all.toString());


        return ResponseEntity.ok().body("Hello, World! kkkk");
    }
    @GetMapping("/bye")
    public ResponseEntity<String> printBye(){
        return ResponseEntity.ok().body("Bye, World!");
    }
}
