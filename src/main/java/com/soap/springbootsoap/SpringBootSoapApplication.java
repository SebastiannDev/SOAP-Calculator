package com.soap.springbootsoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.soap")
public class SpringBootSoapApplication {

	// private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
	}

	// @Bean
	// CommandLineRunner init(SoapClient soapClient) {
	// 	return args -> {
	// 		AddResponse addResponse = soapClient.getAddResponse(2, 2);
	// 		LOGGER.info("El resultado de la suma de los números: {} y {} es: {}", 2, 2, addResponse.getAddResult());
	// 	};
	// }

}
