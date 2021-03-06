package com.ps.services.impl;

import org.springframework.stereotype.Service;

import com.ps.ents.Response;
import com.ps.repos.ResponseRepo;
import com.ps.services.ResponseService;

@Service
public class SimpleResponseService extends SimpleAbstractService<Response> implements ResponseService {

    private ResponseRepo repo;
    
    //                setters & getters
    public void setRepo(ResponseRepo responseRepo) {
        this.repo = responseRepo;
    }

    @Override
    public ResponseRepo getRepo() {
        return repo;
    }
}
