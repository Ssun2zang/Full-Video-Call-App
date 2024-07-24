package com.haisley.videocall;

import com.haisley.videocall.user.User;
import com.haisley.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	){
		return args -> {
			service.register(User.builder()
					.username("haisley")
					.email("haisley@mail.com")
					.password("aaa")
					.build());
			service.register(User.builder()
					.username("hazel")
					.email("hazel@mail.com")
					.password("bbb")
					.build());
			service.register(User.builder()
					.username("noah")
					.email("noah@mail.com")
					.password("ccc")
					.build());
			service.register(User.builder()
					.username("hyden")
					.email("hyden@mail.com")
					.password("ddd")
					.build());
		};
	}
}
