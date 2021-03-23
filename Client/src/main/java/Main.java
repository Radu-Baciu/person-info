import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.PersonInformationGrpc;
import proto.PersonInfo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String isOpen = "1";
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();

        PersonInformationGrpc.PersonInformationBlockingStub personStub = PersonInformationGrpc.newBlockingStub(channel);
        while (isOpen.equals("1")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert name:");
            String personName = scanner.next();
            System.out.println("Insert CNP");
            String personCNP = scanner.next();
            PersonInfo.InfoReply reply = personStub.giveInfo(PersonInfo.PersonRequest.newBuilder().setName(personName).setCnp(personCNP).build());
            System.out.println("Server replied with " + reply);
            System.out.println("Do you still wish to send info (type 1 to continue)");
            isOpen = scanner.next();
        }
        channel.shutdown();
    }
}