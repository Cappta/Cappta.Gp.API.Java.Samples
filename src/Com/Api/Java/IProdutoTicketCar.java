package Com.Api.Java  ;

import com4j.*;

@IID("{391BB57A-269E-4B18-959D-2C347A0EC352}")
public interface IProdutoTicketCar extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "RamoAtividadeId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int ramoAtividadeId();


  /**
   * <p>
   * Setter method for the COM property "RamoAtividadeId"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void ramoAtividadeId(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "RamoAtividadeNome"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String ramoAtividadeNome();


  /**
   * <p>
   * Setter method for the COM property "RamoAtividadeNome"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void ramoAtividadeNome(
    java.lang.String pRetVal);


  /**
   * <p>
   * Getter method for the COM property "TipoProdutoId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  int tipoProdutoId();


  /**
   * <p>
   * Setter method for the COM property "TipoProdutoId"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void tipoProdutoId(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "TipoProdutoNome"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String tipoProdutoNome();


  /**
   * <p>
   * Setter method for the COM property "TipoProdutoNome"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void tipoProdutoNome(
    java.lang.String pRetVal);


  /**
   * <p>
   * Getter method for the COM property "ProdutoId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  int produtoId();


  /**
   * <p>
   * Setter method for the COM property "ProdutoId"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void produtoId(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "ProdutoNome"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String produtoNome();


  /**
   * <p>
   * Setter method for the COM property "ProdutoNome"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void produtoNome(
    java.lang.String pRetVal);


  // Properties:
}
