package com.yang.server.grpcServer;

import com.yang.server.HelloProto;
import com.yang.server.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase { // 实现grpc接口
    @Override
    public void hello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        String name = request.getName();
        System.out.println("参数值 name is "+name);
        responseObserver.onNext(HelloProto.HelloResponse.newBuilder().setResult("all is ok!").build());
        responseObserver.onCompleted();
    }
}
