package cappta.dll  ;

import com4j.*;

@IID("{7293D495-C2BF-49DA-99C2-9F7D01F90C33}")
public interface IDetalhesRecarga extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Ddd"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int ddd();


  /**
   * <p>
   * Setter method for the COM property "Ddd"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void ddd(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "Celular"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  int celular();


  /**
   * <p>
   * Setter method for the COM property "Celular"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void celular(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "ValorRecarga"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  double valorRecarga();


  /**
   * <p>
   * Setter method for the COM property "ValorRecarga"
   * </p>
   * @param pRetVal Mandatory double parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void valorRecarga(
    double pRetVal);


  /**
   * <p>
   * Getter method for the COM property "TransactionId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  int transactionId();


  /**
   * <p>
   * Setter method for the COM property "TransactionId"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void transactionId(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "Produto"
   * </p>
   * @return  Returns a value of type cappta.dll.IProdutoRecarga
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  cappta.dll.IProdutoRecarga produto();


  /**
   * <p>
   * Setter method for the COM property "Produto"
   * </p>
   * @param pRetVal Mandatory cappta.dll.IProdutoRecarga parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void produto(
    cappta.dll.IProdutoRecarga pRetVal);


  // Properties:
}
