package com.backend.friday_test.repository;

import com.backend.friday_test.entity.Developers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DeveloperRepository extends JpaRepository<Developers,Integer> {

}
