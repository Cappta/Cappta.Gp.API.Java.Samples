package cappta.dll  ;

import com4j.*;

@IID("{FCE2A076-A595-41F9-BBE9-50AEC491BC94}")
public interface IRespostaOperacaoRecusada extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CodigoMotivo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int codigoMotivo();


  /**
   * <p>
   * Getter method for the COM property "Motivo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String motivo();


  // Properties:
}
