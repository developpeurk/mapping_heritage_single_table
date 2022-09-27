package com.lambarkiyassine.singletable.mapingheritage;

import com.lambarkiyassine.singletable.mapingheritage.entities.Enseignant;
import com.lambarkiyassine.singletable.mapingheritage.entities.Etudiant;
import com.lambarkiyassine.singletable.mapingheritage.repositories.PersonneRepository;
import com.lambarkiyassine.singletable.mapingheritage.services.EtudiantService;
import com.lambarkiyassine.singletable.mapingheritage.services.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MapingHeritageApplication implements CommandLineRunner {

    List<Enseignant> enseignants = new ArrayList<>();
    List<Etudiant> etudiants = new ArrayList<>();

    @Autowired
    private EtudiantService etudiantService;
    @Autowired
    private ProfesseurService professeurService;
    public static void main(String[] args) {
        SpringApplication.run(MapingHeritageApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("Hassan");
        etudiant.setDateNaissance(new Date());
        etudiant.setNote(14);
        etudiants.add(etudiant);
        etudiantService.saveEtudiant(etudiant);

        System.out.println("-----Etudiants--------");
        etudiants.stream().forEach(et->{
            System.out.print(et.getNom() + "\t ");
            System.out.print(et.getDateNaissance()  + "\t ");
            System.out.println(et.getNote() );
        });
        System.out.println("-------------");
        Enseignant enseignant = new Enseignant();
        enseignant.setNom("Mohamed");
        enseignant.setDateNaissance(new Date());
        enseignant.setMatiere("MATH");
        enseignants.add(enseignant);
        professeurService.saveEtudiant(enseignant);
        System.out.println("-----Professeurs--------");
        enseignants.stream().forEach(ens->{
            System.out.print(ens.getNom()+ "\t ");
            System.out.print(ens.getDateNaissance()+ "\t ");
            System.out.println(ens.getMatiere());
        });
        System.out.println("-------------");

    }
}
