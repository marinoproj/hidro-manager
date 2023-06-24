package br.com.marinoprojetos.hidromanager.endpoint;

import br.com.marinoprojetos.hidromanager.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class TcpServerEndpoint {

    @Autowired
    private MessageService messageService;

    @ServiceActivator(inputChannel = "inboundChannel")
    public void process(byte[] message) {
        messageService.processMessage(message);
    }

}