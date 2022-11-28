package com.estonianport.agendaza.controller

import com.estonianport.agendaza.model.Persona
import com.estonianport.agendaza.service.PersonaService
import com.estonianport.agendaza.service.impl.PersonaServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
class PersonaController {

    @Autowired
    lateinit var personaService: PersonaService

    @GetMapping("/getAllPersona")
    fun getAll(): MutableList<Persona>? {
        return personaService.getAll()
    }

    @PostMapping("/savePersona")
    fun save(@RequestBody persona: Persona): ResponseEntity<Persona> {
        personaService.save(persona)
        return ResponseEntity<Persona>(persona, HttpStatus.OK)
    }

    @DeleteMapping("/deletePersona/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Persona> {
        val persona = personaService.get(id)
        if (persona != null) {
            personaService.delete(id)
        } else {
            return ResponseEntity<Persona>(HttpStatus.NO_CONTENT)
        }
        return ResponseEntity<Persona>(persona, HttpStatus.OK)
    }
}