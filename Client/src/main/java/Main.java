import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.PersonInformationGrpc;
import proto.PersonInfo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personName = scanner.next();
        String personCNP = scanner.next();

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();

        PersonInformationGrpc.PersonInformationBlockingStub bookStub = PersonInformationGrpc.newBlockingStub(channel);

        PersonInfo.InfoReply reply = bookStub.giveInfo(PersonInfo.PersonRequest.newBuilder().setName(personName).setCnp(personCNP).build());

        channel.shutdown();
        scanner.close();
    }
}