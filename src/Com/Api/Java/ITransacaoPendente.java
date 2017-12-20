package Com.Api.Java  ;

import com4j.*;

@IID("{BD569E64-0F02-46F2-A8C0-6581F963B32A}")
public interface ITransacaoPendente extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "numeroControle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String numeroControle();


  /**
   * <p>
   * Getter method for the COM property "NomeAdquirente"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String nomeAdquirente();


  /**
   * <p>
   * Getter method for the COM property "NomeBandeiraCartao"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String nomeBandeiraCartao();


  /**
   * <p>
   * Getter method for the COM property "DataHoraAutorizacao"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Date dataHoraAutorizacao();


  /**
   * <p>
   * Getter method for the COM property "valor"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  double valor();


  // Properties:
}
