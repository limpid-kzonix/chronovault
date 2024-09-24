package com.worxbend;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.jackson.ObjectMapperCustomizer;
import jakarta.inject.Singleton;
import org.jboss.logging.Logger;

@Singleton
public class DefaultObjectMapperCustomizer implements ObjectMapperCustomizer {

    private static final Logger LOG = Logger.getLogger(DefaultObjectMapperCustomizer.class);

    @Override
    public void customize(ObjectMapper objectMapper) {
        LOG.info("Scheduler increment");
        // register custom modules here
    }
}
