package com.webflux.demo.weather

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping(value = ["/weather"])
class WeatherController {

    @GetMapping("/{city}")
    fun getWeather(@PathVariable city: String): Mono<String> =
        Mono.just(city)
}