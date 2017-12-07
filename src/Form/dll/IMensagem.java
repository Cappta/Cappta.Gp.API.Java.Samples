package cappta.dll  ;

import com4j.*;

@IID("{C4410200-F363-4FFA-8D50-C3475CBAB4A6}")
public interface IMensagem extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Descricao"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String descricao();


  // Properties:
}
