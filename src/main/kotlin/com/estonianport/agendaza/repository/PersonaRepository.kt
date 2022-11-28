package com.estonianport.agendaza.repository

import com.estonianport.agendaza.model.Persona
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonaRepository : CrudRepository<Persona, Long> {
}