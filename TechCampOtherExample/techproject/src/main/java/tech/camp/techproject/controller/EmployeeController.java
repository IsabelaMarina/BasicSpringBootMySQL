package tech.camp.techproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.camp.techproject.model.Employee;
import tech.camp.techproject.repository.EmployeeRepository;


@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository repository;


    @GetMapping("/select")
    public ResponseEntity<List<Employee>> getEmployee(){
        List<Employee> list = null;
        try{
            list = repository.findAll();
        }
        catch(Exception e){
            return new ResponseEntity<List<Employee>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
    }

}
