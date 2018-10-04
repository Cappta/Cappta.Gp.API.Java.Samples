package oi  ;

import com4j.*;

@IID("{A4561B77-83F6-4A53-B844-8508CA7D016F}")
public interface IDetalheLoja extends Com4jObject {
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
   * Getter method for the COM property "NomeFantasia"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String nomeFantasia();


  /**
   * <p>
   * Setter method for the COM property "NomeFantasia"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void nomeFantasia(
    java.lang.String pRetVal);


  /**
   * <p>
   * Getter method for the COM property "cnpj"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String cnpj();


  /**
   * <p>
   * Setter method for the COM property "cnpj"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void cnpj(
    java.lang.String pRetVal);


  /**
   * <p>
   * Getter method for the COM property "pdv"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  int pdv();


  /**
   * <p>
   * Setter method for the COM property "pdv"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void pdv(
    int pRetVal);


  // Properties:
}
