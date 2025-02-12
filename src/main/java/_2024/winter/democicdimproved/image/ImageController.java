package _2024.winter.democicdimproved.image;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/image")
public class ImageController {

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(
            @RequestParam("fileName") String fileName)
    {
        return ResponseEntity.ok().body(
                "Upload image: " + fileName
        );
    }

    @GetMapping("/download")
    public ResponseEntity<String> downloadImage()
    {
        return ResponseEntity.ok().body(
                "Download clear!"
        );
    }
}
