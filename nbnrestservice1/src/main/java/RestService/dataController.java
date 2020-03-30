package RestService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class dataController {
    private static final String template = "Hello, %s!, your Age is: %d";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/data")
    public Greeting greeting(@RequestParam(value="id", defaultValue="1") String id) {
        return new Greeting(id);
    }
}
