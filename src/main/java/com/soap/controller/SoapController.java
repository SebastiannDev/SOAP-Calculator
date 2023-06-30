package com.soap.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soap.client.SoapClient;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.SubtractResponse;

@RestController
public class SoapController {

    @Autowired
    private SoapClient soapClient;

    @GetMapping("/welcome")
    public String hello() {
        return "Hello test";
    }

    @PostMapping("/sumar")
    public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB) {
        AddResponse addResponse = soapClient.getAddResponse(numberA, numberB);

        Map<String, Integer> response = new HashMap<>();
        response.put("result: ", addResponse.getAddResult());

        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/restar")
    public ResponseEntity<?> subtract(@RequestParam int numberA, @RequestParam int numberB) {
        SubtractResponse subtractResponse = soapClient.getSubtractResponse(numberA, numberB);

        Map<String, Integer> response = new HashMap<>();
        response.put("result: ", subtractResponse.getSubtractResult());

        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/multiplicar")
    public ResponseEntity<?> multiply(@RequestParam int numberA, @RequestParam int numberB) {
        MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(numberA, numberB);

        Map<String, Integer> response = new HashMap<>();
        response.put("result: ", multiplyResponse.getMultiplyResult());

        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/dividir")
    public ResponseEntity<?> divide(@RequestParam int numberA, @RequestParam int numberB) {
        DivideResponse divideResponse = soapClient.getDivideResponse(numberA, numberB);

        Map<String, Integer> response = new HashMap<>();
        response.put("result: ", divideResponse.getDivideResult());

        return ResponseEntity.ok().body(response);
    }

}
