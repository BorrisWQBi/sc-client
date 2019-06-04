package com.borris.sc.client.scclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.borris.sc.client")
@MapperScan("com.borris.sc.client.mapper")
public class ScClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScClientApplication.class, args);
	}

}

@RestController
class ServiceInstanceController{

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/service-instance/{appName}")
	public List<ServiceInstance> serviceInstanceList(@PathVariable String appName){
		return this.discoveryClient.getInstances(appName);
	}
}