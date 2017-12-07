package cappta.dll  ;

import com4j.*;

@IID("{EE2C8ECD-CE1A-4904-9E48-36BFF9116B01}")
public interface IRespostaRecarga extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CupomLojista"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String cupomLojista();


  /**
   * <p>
   * Getter method for the COM property "CupomCliente"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String cupomCliente();


  // Properties:
}
