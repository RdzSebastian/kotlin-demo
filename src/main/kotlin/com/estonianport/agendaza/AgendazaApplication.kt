package com.estonianport.agendaza

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties

@SpringBootApplication
@EnableEncryptableProperties
class AgendazaApplication

fun main(args: Array<String>) {
	runApplication<AgendazaApplication>(*args)
}
