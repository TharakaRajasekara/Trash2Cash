package com.backend.friday_test.service.IMPL;

import com.backend.friday_test.dto.DeveloperDetailsDTO;
import com.backend.friday_test.entity.Developers;
import com.backend.friday_test.repository.DeveloperRepository;
import com.backend.friday_test.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperServiceIMPL implements DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public String saveDetails(DeveloperDetailsDTO developerDetailsDTO) {
        Developers developers = new Developers(
                developerDetailsDTO.getId(),
                developerDetailsDTO.getName(),
                developerDetailsDTO.getAddress(),
                developerDetailsDTO.getTelephone()
        );
        developerRepository.save(developers);
        return "yoyo data saved success";
    }

}
