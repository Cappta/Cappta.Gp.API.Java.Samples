package cappta.Gp.Api.Com.Interfaces  ;

import com4j.*;

@IID("{6C656481-2AF9-4533-A7B2-4AF80B5DCFCA}")
public interface IDetalhesOperadoras extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CodigoResposta"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int codigoResposta();


  /**
   * <p>
   * Setter method for the COM property "CodigoResposta"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void codigoResposta(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "Operadoras"
   * </p>
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String[] operadoras();


  /**
   * <p>
   * Setter method for the COM property "Operadoras"
   * </p>
   * @param pRetVal Mandatory java.lang.String[] parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void operadoras(
    java.lang.String[] pRetVal);


  // Properties:
}
