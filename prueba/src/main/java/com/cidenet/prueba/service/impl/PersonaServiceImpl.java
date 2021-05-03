package com.cidenet.prueba.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cidenet.prueba.commons.GenericServiceImpl;
import com.cidenet.prueba.dto.PersonaDTO;
import com.cidenet.prueba.model.Persona;
import com.cidenet.prueba.service.api.PersonaServiceAPI;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, PersonaDTO> implements PersonaServiceAPI {

    @Autowired
    private Firestore firestore;

    @Override
    public CollectionReference getCollection() {
        return firestore.collection("personas");
    }

}