package com.kotlin.apifirstdevelopment.config

import org.springdoc.core.SpringDocConfigProperties
import org.springdoc.core.SpringDocConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class SwaggerConfig {

    @Bean
    open fun springDocConfiguration(): SpringDocConfiguration = SpringDocConfiguration()

    @Bean
    open fun springDocConfigProperties(): SpringDocConfigProperties = SpringDocConfigProperties()
}