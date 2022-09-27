package com.lambarkiyassine.singletable.mapingheritage.services;

import com.lambarkiyassine.singletable.mapingheritage.entities.Etudiant;
import com.lambarkiyassine.singletable.mapingheritage.repositories.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EtudiantService {
    private final PersonneRepository personneRepository;

    public EtudiantService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    public Etudiant saveEtudiant(Etudiant etudiant){
        return personneRepository.save(etudiant);
    }

}
