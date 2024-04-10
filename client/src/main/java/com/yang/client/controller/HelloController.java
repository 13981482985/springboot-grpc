package com.yang.client.controller;

import com.yang.client.HelloProto;
import com.yang.client.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GrpcClient("grpc-server") // 注入这个对象 并指定要连接的grpc服务器名称（自己配置）  grpc.client.grpc-server.address=static://localhost:9090 这个配置中的grpc-server就是自己配制的
    HelloServiceGrpc.HelloServiceBlockingStub helloService;

    @RequestMapping("/test")
    public String getName(){
        HelloProto.HelloResponse response = helloService.hello(HelloProto.HelloRequest.newBuilder().setName("yang").build());
        return response.getResult();
    }


}
