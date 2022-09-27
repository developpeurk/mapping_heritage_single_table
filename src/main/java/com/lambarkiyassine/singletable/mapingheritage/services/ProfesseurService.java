package com.lambarkiyassine.singletable.mapingheritage.services;

import com.lambarkiyassine.singletable.mapingheritage.entities.Enseignant;
import com.lambarkiyassine.singletable.mapingheritage.entities.Etudiant;
import com.lambarkiyassine.singletable.mapingheritage.repositories.PersonneRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProfesseurService {
    private final PersonneRepository personneRepository;

    public ProfesseurService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    public Enseignant saveEtudiant(Enseignant enseignant){
        return personneRepository.save(enseignant);
    }
}
