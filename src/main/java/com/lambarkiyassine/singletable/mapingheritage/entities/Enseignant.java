package com.lambarkiyassine.singletable.mapingheritage.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("PROF")
public class Enseignant extends Personne{
    private String matiere;
}
