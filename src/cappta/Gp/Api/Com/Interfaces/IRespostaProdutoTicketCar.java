package cappta.Gp.Api.Com.Interfaces  ;

import com4j.*;

@IID("{3687FED3-4266-4677-A6B3-35FEF3C3DE6E}")
public interface IRespostaProdutoTicketCar extends Com4jObject {
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


    // Properties:
  }
