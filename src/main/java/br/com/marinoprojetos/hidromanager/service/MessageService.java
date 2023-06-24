package br.com.marinoprojetos.hidromanager.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageService.class);

    public void processMessage(byte[] message) {
        String messageContent = new String(message);
        LOGGER.info("Receive message: {}", messageContent);
    }

}