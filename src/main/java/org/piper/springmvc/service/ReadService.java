package org.piper.springmvc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReadService {

    public void read() {
        log.info("read finished");
    }
}
