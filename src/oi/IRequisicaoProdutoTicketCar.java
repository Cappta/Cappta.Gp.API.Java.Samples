package oi  ;

import com4j.*;

@IID("{4D84F541-0A06-4D35-9948-61C2FC8A2E1D}")
public interface IRequisicaoProdutoTicketCar extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Codigo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int codigo();


  /**
   * <p>
   * Setter method for the COM property "Codigo"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void codigo(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "Descricao"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String descricao();


  /**
   * <p>
   * Setter method for the COM property "Descricao"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void descricao(
    java.lang.String pRetVal);


  /**
   * <p>
   * Getter method for the COM property "Quantidade"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  int quantidade();


  /**
   * <p>
   * Setter method for the COM property "Quantidade"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void quantidade(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "ValorUnitario"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  double valorUnitario();


  /**
   * <p>
   * Setter method for the COM property "ValorUnitario"
   * </p>
   * @param pRetVal Mandatory double parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void valorUnitario(
    double pRetVal);


  /**
   * <p>
   * Getter method for the COM property "ValorDesconto"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  double valorDesconto();


  /**
   * <p>
   * Setter method for the COM property "ValorDesconto"
   * </p>
   * @param pRetVal Mandatory double parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void valorDesconto(
    double pRetVal);


  /**
   * <p>
   * Getter method for the COM property "TipoDesconto"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  int tipoDesconto();


  /**
   * <p>
   * Setter method for the COM property "TipoDesconto"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void tipoDesconto(
    int pRetVal);


  // Properties:
}
