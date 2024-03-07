package ua.shuba.myprogress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMyprogressApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyprogressApplication::main).with(TestMyprogressApplication.class).run(args);
	}

}
