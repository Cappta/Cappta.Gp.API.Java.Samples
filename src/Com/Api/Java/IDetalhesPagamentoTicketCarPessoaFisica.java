package Com.Api.Java  ;

import com4j.*;

@IID("{9FC96AB8-65CB-414C-86F9-D6BC5EF0E62C}")
public interface IDetalhesPagamentoTicketCarPessoaFisica extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "NumeroReciboFiscal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String numeroReciboFiscal();


  /**
   * <p>
   * Setter method for the COM property "NumeroReciboFiscal"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void numeroReciboFiscal(
    java.lang.String pRetVal);


  /**
   * <p>
   * Getter method for the COM property "NumeroSerialECF"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String numeroSerialECF();


  /**
   * <p>
   * Setter method for the COM property "NumeroSerialECF"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void numeroSerialECF(
    java.lang.String pRetVal);


  // Properties:
}
