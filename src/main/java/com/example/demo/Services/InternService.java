package com.example.demo.Services;

import com.example.demo.Models.Intern;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InternService {
    List<Intern> interns;
    InternService(){
        interns=new ArrayList<>();
        interns.add(new Intern(
                0,
                "Pankaj Shukla",
                "SDE",
                "EMR",
                "pankajshuklajavacoder@gmail.com"
        ));
        interns.add(new Intern(
                1,
                "Adesh Singh",
                "SDE",
                "Diagnostic",
                "adeshsingh@gmail.com"
        ));
    }

    public List<Intern> getInterns(){
        return interns;
    }
    public String addNewIntern(Intern intern){
        interns.add(intern);
        return "Intern add sucessfully ";
    }
    public Intern getIntern(int id ){
        return interns.get(id);
    }
    public String deleteIntern(int id){
        interns.remove(id);
        return "Intern details removed sucessfully ";
    }


}
