package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.model.ChatForm;
import com.udacity.jwdnd.c1.review.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

        private List<ChatMessage> messageList = new ArrayList<>();

        private String message;

        public MessageService(String message) {
            this.message = message;
        }

        public String uppercase() {
            return this.message.toUpperCase();
        }

        public String lowercase() {
            return this.message.toLowerCase();
        }

        @PostConstruct
        public void postConstruct() {
            System.out.println("Creating a MessageService bean");
        }

        public void addMessage(ChatForm chatForm) {
            ChatMessage newMessage = new ChatMessage();
            newMessage.setUsername(chatForm.getUsername());
            switch (chatForm.getMessageType()) {
                case "Say":
                    newMessage.setMessageText(chatForm.getMessageText());
                    break;
                case "Shout":
                    newMessage.setMessageText(chatForm.getMessageText().toUpperCase());
                    break;
                case "Whisper":
                    newMessage.setMessageText(chatForm.getMessageText().toLowerCase());
                    break;
            }

        }



}


