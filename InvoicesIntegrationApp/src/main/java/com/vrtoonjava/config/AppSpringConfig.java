package com.vrtoonjava.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:invoices-context.xml"})
public class AppSpringConfig {

}
