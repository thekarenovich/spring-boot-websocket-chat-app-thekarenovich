package com.erik.websocket.payload;

import com.erik.websocket.model.MessageType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;
    private boolean typing;
    private String chatName;

}
