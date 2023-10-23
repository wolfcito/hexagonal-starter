package solutions.mundovirtual.infraestructura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkExperienceController {
    @GetMapping("/")
    public String workExperience(){
        return "All ready";
    }
}
