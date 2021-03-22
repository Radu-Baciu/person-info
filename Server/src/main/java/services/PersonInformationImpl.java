package services;

import io.grpc.stub.StreamObserver;
import proto.PersonInfo;
import proto.PersonInformationGrpc;

import java.time.LocalDate;
import java.time.Period;

public class PersonInformationImpl extends PersonInformationGrpc.PersonInformationImplBase{
    @Override
    public void giveInfo(PersonInfo.PersonRequest request, StreamObserver<PersonInfo.InfoReply> responseObserver) {
        char sex = 'U';
        int year = 0,month = 0,day = 0;

        if(request.getCnp().charAt(0) == '1')
        {
            year = 1900 + (request.getCnp().charAt(1) - '0') * 10 + (request.getCnp().charAt(2) - '0');
            month = (request.getCnp().charAt(3) - '0') * 10 + (request.getCnp().charAt(4) - '0');
            day = (request.getCnp().charAt(5) - '0') * 10 + (request.getCnp().charAt(6) - '0');
            sex = 'M';
        }
        if(request.getCnp().charAt(0) == '2') {
            year = 1900 + (request.getCnp().charAt(1) - '0') * 10 + (request.getCnp().charAt(2) - '0');
            month = (request.getCnp().charAt(3) - '0') * 10 + (request.getCnp().charAt(4) - '0');
            day = (request.getCnp().charAt(5) - '0') * 10 + (request.getCnp().charAt(6) - '0');
            sex = 'F';
        }
        if(request.getCnp().charAt(0) == '5') {
            year = 2000 + (request.getCnp().charAt(1) - '0') * 10 + (request.getCnp().charAt(2) - '0');
            month = (request.getCnp().charAt(3) - '0') * 10 + (request.getCnp().charAt(4) - '0');
            day = (request.getCnp().charAt(5) - '0') * 10 + (request.getCnp().charAt(6) - '0');
            sex = 'M';
        }
        if(request.getCnp().charAt(0) == '6') {
            year = 2000 + (request.getCnp().charAt(1) - '0') * 10 + (request.getCnp().charAt(2) - '0');
            month = (request.getCnp().charAt(3) - '0') * 10 + (request.getCnp().charAt(4) - '0');
            day = (request.getCnp().charAt(5) - '0') * 10 + (request.getCnp().charAt(6) - '0');
            sex = 'F';
        }

        LocalDate l = LocalDate.of(year,month,day);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(l,now);
        int age = diff.getYears();

        PersonInfo.InfoReply reply = PersonInfo.InfoReply.newBuilder().setMessage("Info: "+request.getName()+ " , "+request.getCnp()+ " , "+sex+ " , "+age).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
        System.out.println(reply.getMessage());
    }
}
