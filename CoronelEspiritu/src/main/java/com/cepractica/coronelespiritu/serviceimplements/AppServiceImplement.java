package com.cepractica.coronelespiritu.serviceimplements;

import com.cepractica.coronelespiritu.entities.App;
import com.cepractica.coronelespiritu.repositories.IAppRepository;
import com.cepractica.coronelespiritu.serviceinterfaces.IAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImplement implements IAppService {


    @Autowired
    private IAppRepository appRepository;

    @Override
    public void insert(App app){appRepository.save(app);}



}
