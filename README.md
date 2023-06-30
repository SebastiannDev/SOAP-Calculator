# SOAP PROJECT

This app use an api from `http://www.dneonline.com/calculator.asmx?WSDL)` to serve services.

* Features:
    - Can send an variable via `POST` with two integers to endpoint to get the result operations.
    - The endponits: `[GET]{/welcome}, [POST]{/sumar}, [POST]{/restar}, [POST]{/multiplicar}, [POST]{/dividir}`
    - Send format Query Params: `numberA => {int}, numberB => {int}`
* Format response server:
```json
{
    "result": 1
}
```
