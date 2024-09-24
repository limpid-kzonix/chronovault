package com.worxbend.service;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;


@ApplicationScoped
public class Scheduler {

    private static final Logger LOG = Logger.getLogger(Scheduler.class);

    @Scheduled(every="10s")
    void increment() {
        LOG.info("Scheduler increment");
    }
}
