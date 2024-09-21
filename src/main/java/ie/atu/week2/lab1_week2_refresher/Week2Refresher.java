package ie.atu.week2.lab1_week2_refresher;

import org.springframework.web.bind.annotation.*;

@RestController
public class Week2Refresher {
    @GetMapping("/hello")
    public String message(){
        return "Hello";
    }


    @GetMapping("/hello/{name}")
    public String myName(@PathVariable String name){
        return "Your name is " + name;
    }

    @GetMapping("/search")
    public String search(@RequestParam String search1, @RequestParam(defaultValue =  "") String search2) {
        return search1 + " " + search2;
    }
}