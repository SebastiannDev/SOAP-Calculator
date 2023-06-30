package com.soap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.soap.client.SoapClient;

@Configuration
public class SoapConfig {

    @Bean
    Jaxb2Marshaller marshaller() {

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.soap.wsdl"); // put the same package used in pom.xml named: generatePackage
        return marshaller;
    }

    @Bean
    SoapClient getSoapClient(Jaxb2Marshaller marshaller) {

        SoapClient soapClient = new SoapClient();
        soapClient.setDefaultUri("http://www.dneonline.com/calculator.asmx");
        soapClient.setMarshaller(marshaller); // convert xml to class
        soapClient.setUnmarshaller(marshaller); // convert xml to class

        return soapClient;
    }
}
