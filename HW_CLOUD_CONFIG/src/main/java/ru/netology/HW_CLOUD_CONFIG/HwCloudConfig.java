package ru.netology.HW_CLOUD_CONFIG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HwCloudConfig {

	public static void main(String[] args) {
		SpringApplication.run(HwCloudConfig.class, args);
	}

}
