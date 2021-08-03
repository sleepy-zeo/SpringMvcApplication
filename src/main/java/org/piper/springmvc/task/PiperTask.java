package org.piper.springmvc.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PiperTask {

    @Scheduled(cron = "0/2 * * * * ?")
    public void read() {
        // log.debug("reading...");
    }

    @Scheduled(cron = "0/4 * * * * ?")
    public void write() {
        // log.info("writing...");
    }
}
