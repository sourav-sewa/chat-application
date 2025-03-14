package com.sourav.chat.service;

import com.sourav.chat.dto.ChatMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ChatService {
    public ChatMessage sendMessage(ChatMessage chatMessage){
        log.info("send message: {}",chatMessage.toString());
        return chatMessage;
    }

    public ChatMessage addUser(ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        log.info("add user: {}",chatMessage.toString());
        headerAccessor.getSessionAttributes().put("username",chatMessage.getSender());
        return chatMessage;
    }
}
