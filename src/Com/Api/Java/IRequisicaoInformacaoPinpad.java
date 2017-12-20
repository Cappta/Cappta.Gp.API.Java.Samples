package Com.Api.Java  ;

import com4j.*;

@IID("{7A327E30-1CC7-449D-BD86-0ECF56A46680}")
public interface IRequisicaoInformacaoPinpad extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "TipoInformacaoPinpad"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int tipoInformacaoPinpad();


  /**
   * <p>
   * Setter method for the COM property "TipoInformacaoPinpad"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void tipoInformacaoPinpad(
    int pRetVal);


  // Properties:
}
