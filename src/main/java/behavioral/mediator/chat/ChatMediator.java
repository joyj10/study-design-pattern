package behavioral.mediator.chat;

public interface ChatMediator {
    void sendMessage(String message, ChatUser chatUser);

    void addUser(ChatUser chatUser);
}
