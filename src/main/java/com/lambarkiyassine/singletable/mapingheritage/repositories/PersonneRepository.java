package com.lambarkiyassine.singletable.mapingheritage.repositories;

import com.lambarkiyassine.singletable.mapingheritage.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
