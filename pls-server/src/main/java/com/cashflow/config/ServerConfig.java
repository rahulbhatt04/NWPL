package com.cashflow.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cashflow.service.config.ServiceConfig;

@Configuration
@Import (ServiceConfig.class)
public class ServerConfig {

}
