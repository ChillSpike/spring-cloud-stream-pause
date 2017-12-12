package com.example.configclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.Lifecycle;

/**
 * @author Vladislav Fefelov
 * @since 12/12/17
 */
@Slf4j
public class LifecycleBean implements Lifecycle {

    @Override
    public void start() {
        log.info("Lifecycle Bean started");
    }

    @Override
    public void stop() {
        log.info("Lifecycle Bean stopped");
    }

    @Override
    public boolean isRunning() {
        return true;
    }

}
