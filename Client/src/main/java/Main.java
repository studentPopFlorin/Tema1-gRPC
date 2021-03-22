import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.Person;
import proto.PersonDetailsGrpc;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=scanner.next();
        System.out.println("Enter CNP: ");
        String CNP=scanner.next();

        int option=1;

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();

        PersonDetailsGrpc.PersonDetailsBlockingStub personStub = PersonDetailsGrpc.newBlockingStub(channel);

        Person.DetailsReply reply = personStub.getDetails(Person.PersonRequest.newBuilder().setName(name).setCnp(CNP).build());

        System.out.println("If you want to close the current client, insert 0!");
        while(option!=0)
        {
            System.out.print("Input: ");
            option=scanner.nextInt();
        }

        channel.shutdown();
        scanner.close();
    }
}
