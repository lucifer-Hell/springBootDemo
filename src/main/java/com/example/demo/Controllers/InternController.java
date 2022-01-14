package com.example.demo.Controllers;

import com.example.demo.Models.Intern;
import com.example.demo.Services.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InternController {
    // use to automatically assign an intance of the required service
    @Autowired
    private InternService internService;

    @GetMapping(value="/interns")
    public List<Intern> getInterns(){
        return internService.getInterns();
    }
    @GetMapping(value="/interns/{id}")
    public Intern getIntern(@PathVariable int id){
        return internService.getIntern(id);
    }
    @PostMapping(value="/interns" )
    public String addIntern(@RequestBody Intern intern){
        return internService.addNewIntern(intern);
    }

    @DeleteMapping(value="/interns/{id}")
    public String deleteIntern(@PathVariable int id){
        return internService.deleteIntern(id);
    }



}
