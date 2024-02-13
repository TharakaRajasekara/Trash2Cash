package com.backend.friday_test.controller;

import com.backend.friday_test.dto.DeveloperDetailsDTO;
import com.backend.friday_test.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("shield/backend")
@CrossOrigin
public class DeveloperController {

@Autowired
private DeveloperService developerService;

@PostMapping("/save_developer")
    public String saveDeveloper(@RequestBody DeveloperDetailsDTO developerDetailsDTO){
    String praneetha = developerService.saveDetails(developerDetailsDTO);
    return praneetha;
}

}
