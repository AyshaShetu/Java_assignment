import java.util.Scanner;
public class ChatRoom {
    public static void main(String[] args) {
        Scanner emoji = new Scanner(System.in);

        System.out.println("name of chat room :  ");
        String chatroomName = emoji.nextLine();

        System.out.println("Number of participants :  ");
        int participantsNumber = emoji.nextInt();

        System.out.println("content of all messages:   ");
        String messageContent = emoji.nextLine();

        System.out.println(
                "Chatroom Name is "  + chatroomName +
                        "\nTotal participants are " + participantsNumber +
                               "\nContent of Messages : "  + messageContent
        );
    }
}
