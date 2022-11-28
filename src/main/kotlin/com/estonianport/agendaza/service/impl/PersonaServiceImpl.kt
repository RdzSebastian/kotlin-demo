package com.estonianport.agendaza.service.impl

import GenericServiceImpl
import com.estonianport.agendaza.model.Persona
import com.estonianport.agendaza.repository.PersonaRepository
import com.estonianport.agendaza.service.PersonaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class PersonaServiceImpl : GenericServiceImpl<Persona, Long>(), PersonaService {

    @Autowired
    lateinit var personaRepository: PersonaRepository

    override val dao : CrudRepository<Persona, Long>
        get() = personaRepository
}
