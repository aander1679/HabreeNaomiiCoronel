package com.cepractica.coronelespiritu.controllers;

import com.cepractica.coronelespiritu.dtos.AppDTO;
import com.cepractica.coronelespiritu.entities.App;
import com.cepractica.coronelespiritu.serviceinterfaces.IAppService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coronelEspiritu/apps")
public class AppController {

    @Autowired
    private IAppService appService;

    @PostMapping("/insert")
    public void registrar (@RequestBody AppDTO appDTO){
        ModelMapper m= new ModelMapper();
        App app = m.map(appDTO, App.class);
        appService.insert(app);
    }
}
