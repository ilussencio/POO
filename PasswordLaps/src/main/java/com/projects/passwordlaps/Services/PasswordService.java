package com.projects.passwordlaps.Services;

import com.projects.passwordlaps.repositories.PasswordRepository;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {
    final PasswordRepository passwordRepository;

    public PasswordService(PasswordRepository passwordRepository){
        this.passwordRepository = passwordRepository;
    }


}
