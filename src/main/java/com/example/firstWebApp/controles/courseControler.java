package com.example.firstWebApp.controles;
import com.example.firstWebApp.entities.course;
import com.example.firstWebApp.services.courseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class courseControler {

    @Autowired
    private courseServices courseServices;
    @PostMapping("/course/addCourse")
    public @ResponseBody course addCourse(@RequestBody course c)
    {
        return courseServices.addCourse(c);
    }
}