package pl.pjatk.WitJag;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")

public class Homework3RestCrontroller {
    @GetMapping("/{id}")
    public ResponseEntity<String> setId(@PathVariable String id) {
        return ResponseEntity.ok(id);
    }

    @GetMapping("/id")
    public ResponseEntity<String> SetIdToo(@RequestParam String id) {
        return ResponseEntity.ok(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateId(@RequestBody String next, @PathVariable String id) {
        return ResponseEntity.ok(next + "\n added to: " + id);
    }

    @PostMapping("/new")
    public ResponseEntity<String> newId(@RequestBody String id) {
        return ResponseEntity.ok(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteId(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }

}

