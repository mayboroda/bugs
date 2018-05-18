package com.example

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

/**
 * This class must be open in the end
 */

@Configuration
class KotlinConfiguration {
    @Bean
    fun restTemplate(): RestTemplate = RestTemplate()
}