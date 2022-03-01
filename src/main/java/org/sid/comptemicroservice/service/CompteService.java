package org.sid.comptemicroservice.service;

public interface CompteService {
    void virement(Long codeSource,Long codeDestination, double montant);
}
