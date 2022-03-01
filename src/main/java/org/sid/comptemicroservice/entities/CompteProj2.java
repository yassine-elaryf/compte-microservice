package org.sid.comptemicroservice.entities;

import org.sid.comptemicroservice.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p2",types = Compte.class)
public interface CompteProj2 {
    double getSolde();
    TypeCompte getType();
}
