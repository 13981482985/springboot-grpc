package com.yang.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

    /**
     * gRPC的高级应用
     * 1、一元拦截器
     * 2、流拦截器
     * 3、客户端重试
     * 4、nameResolver 注册中心
     * 5、负载均衡（pick-first、轮询）
     * 6、grpc与微服务的整合
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
