package cappta.dll  ;

import com4j.*;

@IID("{CA4AD0C3-ECC8-3080-84C2-A27CAE4B4DFA}")
public interface IResponseSerializer extends Com4jObject {
  // Methods:
  /**
   * @param responseMessage Mandatory java.lang.String parameter.
   * @return  Returns a value of type cappta.dll.IIteracaoTef
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  cappta.dll.IIteracaoTef deserialize(
    java.lang.String responseMessage);


  // Properties:
}
