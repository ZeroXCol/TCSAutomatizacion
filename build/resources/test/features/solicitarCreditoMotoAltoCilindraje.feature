Feature: Solicitar credito de moto
  Como cliente potencial
  Quiero acceder a la pagina de bancolombia
  para solicitar un credito de moto alto cilindraje


  Background:
    Given el cliente potencial acceder a la url de bancolombia

  Scenario Outline: Solicitar credito de moto alto cilindraje
    When Selecciona la opcion vehiculos para solicitar un credito de moto alto cilindraje
    And ingresa los datos "<seleccionVehiculo>" "<montoPrestamo>" "<numeroCuotas>"
    Then debe generarse una cotizacion de la cual se guardaran los valores
    And se debe validar "<cuotaMensualAValidar>" "<seguroDeVidaValidar>""<totalValidar>"
    And se debe guardar la informacion obtenida en excel
    Examples:
      | seleccionVehiculo | montoPrestamo | numeroCuotas | cuotaMensualAValidar | seguroDeVidaValidar | totalValidar |
      | Motos             | 19,350,355.00 | 48           | 718,502.33           | 58,051.07           | 776,553.39   |






