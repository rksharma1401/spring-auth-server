package io.javabrains.springsecurityjpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("hsql")
@Configuration
public class HsqlDataSource  {
    
}