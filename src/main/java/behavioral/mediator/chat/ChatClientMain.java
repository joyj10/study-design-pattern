package behavioral.mediator.chat;

public class ChatClientMain {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        ChatUser user1 = new ChatUser("박자바", mediator);
        ChatUser user2 = new ChatUser("김패턴", mediator);
        ChatUser user3 = new ChatUser("이채팅", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hello Mediator!");
    }
}
