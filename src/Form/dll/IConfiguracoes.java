package cappta.dll  ;

import com4j.*;

@IID("{0C987364-605C-423A-887E-E368A12A0C81}")
public interface IConfiguracoes extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ExibirInterface"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  boolean exibirInterface();


  /**
   * <p>
   * Setter method for the COM property "ExibirInterface"
   * </p>
   * @param pRetVal Mandatory boolean parameter.
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(8)
  void exibirInterface(
    boolean pRetVal);


  // Properties:
}
