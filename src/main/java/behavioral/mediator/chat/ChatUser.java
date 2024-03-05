package behavioral.mediator.chat;

import java.util.Objects;

public class ChatUser {
    private String name;
    private ChatMediator mediator;

    public ChatUser(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println(name + ": Sending Message=" + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + ": Received Message=" + message);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatUser chatUser = (ChatUser) object;
        return Objects.equals(name, chatUser.name) && Objects.equals(mediator, chatUser.mediator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mediator);
    }
}
