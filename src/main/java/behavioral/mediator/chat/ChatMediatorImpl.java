package behavioral.mediator.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<ChatUser> chatUsers;

    public ChatMediatorImpl() {
        this.chatUsers = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, ChatUser chatUser) {
        // 자신 제외 유저에게 메시지 발송
        for (ChatUser u : chatUsers) {
            if (u != chatUser) {
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(ChatUser chatUser) {
        chatUsers.add(chatUser);
    }
}
