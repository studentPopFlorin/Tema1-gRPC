package service;

import io.grpc.stub.StreamObserver;
import proto.Person;
import proto.PersonDetailsGrpc;

import java.time.LocalDate;
import java.time.Period;

public class PersonDetailsImpl extends PersonDetailsGrpc.PersonDetailsImplBase {
    @Override
    public void getDetails(Person.PersonRequest request, StreamObserver<Person.DetailsReply> responseObserver) {

        char gender;
        LocalDate personBirthday;
        LocalDate currentDate=LocalDate.now();
        Period differenceDate;

        int birthdayYear;
        int birthdayMonth;
        int birthdayDay;

        if(request.getCnp().charAt(0)=='1' || request.getCnp().charAt(0)=='5'){
            gender='M';
        }
        else
        {
            gender='F';
        }

        if(request.getCnp().charAt(0)=='1' || request.getCnp().charAt(0)=='2') {
            birthdayYear = 1900 + (request.getCnp().charAt(1)-'0') * 10 + request.getCnp().charAt(2)-'0';
        } else {
            birthdayYear = 2000 + (request.getCnp().charAt(1)-'0') * 10 + request.getCnp().charAt(2)-'0';
        }
        birthdayMonth = (request.getCnp().charAt(3)-'0') * 10 + request.getCnp().charAt(4)-'0';
        birthdayDay = (request.getCnp().charAt(5)-'0') * 10 + request.getCnp().charAt(6)-'0';
        personBirthday = LocalDate.of(birthdayYear, birthdayMonth, birthdayDay);
        differenceDate= Period.between(personBirthday, currentDate);

        Person.DetailsReply reply= Person.DetailsReply.newBuilder().setMessage("Name: "+ request.getName() + " CNP: " + request.getCnp() + " Gen: " +gender + " Age: " + differenceDate.getYears()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
        System.out.println(reply.getMessage());
    }
}

