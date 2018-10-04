package cappta.Gp.Api.Com.Interfaces  ;

import com4j.*;

@IID("{44B8B0E0-907B-405A-B638-60A25F1F2954}")
public interface IIteracaoTef extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "TipoIteracao"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  int tipoIteracao();


  /**
   * @return  Returns a value of type Api_Com_Cappta_Java.IIteracaoTef
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  cappta.Gp.Api.Com.Interfaces.IIteracaoTef clone();


  // Properties:
}
