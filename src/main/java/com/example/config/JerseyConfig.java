package com.example.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Created By willz
 * Date : 2020/3/3
 * Time: 15:18
 */
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {

        register(RequestContextFilter.class);

        //配置restful package.

        packages("com.example.rest");

    }
}
