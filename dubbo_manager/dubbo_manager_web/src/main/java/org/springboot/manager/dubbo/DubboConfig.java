package org.springboot.manager.dubbo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dubbo/dubbo-client.properties")
@ImportResource({"classpath:dubbo/*.xml"})
public class DubboConfig {
}
