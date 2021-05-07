package pl.pjatk.WitJag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/***
@RestController
@RequestMapping("/test")
public class JazRestController {
    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld() {
        return ResponseEntity.ok("Hello world");
        //  return ResponseEntity.status(HttpStatus.OK).body("Hello world");
    }

    @GetMapping("/abc")
    public ResponseEntity<String> getHelloWorldAbc() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello world ABC");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar(Car car) {
      //  Car vw = new Car("VM");
        return ResponseEntity.ok(car);
    }



    @PostMapping("/new")
    public ResponseEntity<Car> addNewCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }





}
*///