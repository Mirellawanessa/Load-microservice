package com.mirellawanessa

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
    info = Info(
        title = "load-simulator",
        version = "0.1",
        description = "Simulates an API with a REST endpoint",
        license = License(name = "MIT License", url = "https://github.com/Mirellawanessa/load-microservice/blob/main/LICENSE"),
        contact = Contact(name = "Mirella", email = "mirellawanessacorreia@gmail.com")
    )
)
object Api

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.mirellawanessa")
        .start()
}
