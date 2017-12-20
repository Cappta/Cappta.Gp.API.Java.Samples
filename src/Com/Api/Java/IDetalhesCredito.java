package Com.Api.Java  ;

import com4j.*;

@IID("{39FA5108-EF0F-457B-A003-54460A297824}")
public interface IDetalhesCredito extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "TransacaoParcelada"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean transacaoParcelada();


  /**
   * <p>
   * Setter method for the COM property "TransacaoParcelada"
   * </p>
   * @param pRetVal Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void transacaoParcelada(
    boolean pRetVal);


  /**
   * <p>
   * Getter method for the COM property "TipoParcelamento"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  int tipoParcelamento();


  /**
   * <p>
   * Setter method for the COM property "TipoParcelamento"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void tipoParcelamento(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "QuantidadeParcelas"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  int quantidadeParcelas();


  /**
   * <p>
   * Setter method for the COM property "QuantidadeParcelas"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void quantidadeParcelas(
    int pRetVal);


  // Properties:
}
