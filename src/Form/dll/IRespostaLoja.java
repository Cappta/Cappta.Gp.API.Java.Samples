package cappta.dll  ;

import com4j.*;

@IID("{9D6A929F-80B3-4C33-AD04-1D26173216F0}")
public interface IRespostaLoja extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CodigoResposta"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int codigoResposta();


  /**
   * <p>
   * Setter method for the COM property "CodigoResposta"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void codigoResposta(
    int pRetVal);


    // Properties:
  }
