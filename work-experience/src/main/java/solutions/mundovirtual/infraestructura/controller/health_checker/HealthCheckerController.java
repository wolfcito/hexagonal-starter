package solutions.mundovirtual.infraestructura.controller.health_checker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HealthCheckerController {

    @GetMapping("/health-check")
    public HashMap<String, String> healthCheckGet(){
        HashMap<String, String> status = new HashMap<>();
        status.put("application", "work_experience");
        status.put("status", "ok");

        return status;
    }
}
