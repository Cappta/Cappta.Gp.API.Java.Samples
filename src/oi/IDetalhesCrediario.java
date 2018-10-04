package oi  ;

import com4j.*;

@IID("{AFF482ED-60D9-437D-8848-10D690B72FAD}")
public interface IDetalhesCrediario extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "QuantidadeParcelas"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int quantidadeParcelas();


  /**
   * <p>
   * Setter method for the COM property "QuantidadeParcelas"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void quantidadeParcelas(
    int pRetVal);


  // Properties:
}
