package com.local.vmc.qualifier.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.vmc.qualifier.annotation" })
public class AdditionalConfig {

}
