package org.example.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface ProducerService {
    void producerAnswer(SendMessage sendMessage);
    void produceToParser(SendMessage sendMessage);
    void produceBeforeParsing(SendMessage sendMessage);
}
