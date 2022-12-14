package com.projects.passwordlaps.repositories;

import com.projects.passwordlaps.models.PasswordModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordRepository extends JpaRepository<PasswordModel, Integer> { }
