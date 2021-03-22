package services;

import io.grpc.stub.StreamObserver;
import proto.PersonInfo;
import proto.PersonInformationGrpc;

public class PersonInformationImpl extends PersonInformationGrpc.PersonInformationImplBase{
    @Override
    public void giveInfo(PersonInfo.PersonRequest request, StreamObserver<PersonInfo.InfoReply> responseObserver) {
        PersonInfo.InfoReply reply = PersonInfo.InfoReply.newBuilder().setMessage("Info: "+request.getName()+ " , "+request.getCnp()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
