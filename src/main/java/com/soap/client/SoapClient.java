package com.soap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.soap.wsdl.Add;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.Divide;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.Multiply;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.Subtract;
import com.soap.wsdl.SubtractResponse;

public class SoapClient extends WebServiceGatewaySupport {

    /* Client that consume the SOAP Calculator */

    private final String marshallUrl = "http://www.dneonline.com/calculator.asmx";

    /**
     * Method handle the addition of two numbers
     * 
     * @param numberA
     * @param numberB
     * @return AddResponse
     */
    public AddResponse getAddResponse(int numberA, int numberB) {

        Add addRequest = new Add();
        addRequest.setIntA(numberA);
        addRequest.setIntB(numberB);

        SoapActionCallback soappActionCallback = new SoapActionCallback("http://tempuri.org/Add");

        AddResponse addResponse = (AddResponse) getWebServiceTemplate()
                .marshalSendAndReceive(marshallUrl, addRequest, soappActionCallback);

        return addResponse;
    }

    /**
     * Method handle te Subtract of two numbers
     * 
     * @param numberA
     * @param numberB
     * @return SubtractResponse
     */
    public SubtractResponse getSubtractResponse(int numberA, int numberB) {

        Subtract subtractRequest = new Subtract();
        subtractRequest.setIntA(numberA);
        subtractRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");

        SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate()
                .marshalSendAndReceive(marshallUrl, subtractRequest, soapActionCallback);

        return subtractResponse;
    }

    /**
     * Method handle te Multiply of two numbers
     * 
     * @param numberA
     * @param numberB
     * @return MultiplyResponse
     */
    public MultiplyResponse getMultiplyResponse(int numberA, int numberB) {
        Multiply multiplyRequest = new Multiply();
        multiplyRequest.setIntA(numberA);
        multiplyRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");

        MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate()
                .marshalSendAndReceive(marshallUrl, multiplyRequest, soapActionCallback);

        return multiplyResponse;
    }

    /**
     * Method handle te Divide of two numbers
     * 
     * @param numberA
     * @param numberB
     * @return DivideResponse
     */
    public DivideResponse getDivideResponse(int numberA, int numberB) {
        Divide divideRequest = new Divide();
        divideRequest.setIntA(numberA);
        divideRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");
        
        DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate()
            .marshalSendAndReceive(marshallUrl, divideRequest, soapActionCallback);

        return divideResponse;
    }
}
