package Com.Api.Java  ;

import com4j.*;

@IID("{8F598C03-4324-4932-851C-64EB8899AB30}")
public interface IProdutoRecarga extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "mobileOperator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String mobileOperator();


  /**
   * <p>
   * Setter method for the COM property "mobileOperator"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void mobileOperator(
    java.lang.String pRetVal);


  /**
   * <p>
   * Getter method for the COM property "Code"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String code();


  /**
   * <p>
   * Setter method for the COM property "Code"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void code(
    java.lang.String pRetVal);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void name(
    java.lang.String pRetVal);


  /**
   * <p>
   * Getter method for the COM property "Price"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  double price();


  /**
   * <p>
   * Setter method for the COM property "Price"
   * </p>
   * @param pRetVal Mandatory double parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void price(
    double pRetVal);


  /**
   * <p>
   * Getter method for the COM property "IsVariable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  boolean isVariable();


  /**
   * <p>
   * Setter method for the COM property "IsVariable"
   * </p>
   * @param pRetVal Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void isVariable(
    boolean pRetVal);


  /**
   * <p>
   * Getter method for the COM property "MinPrice"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  double minPrice();


  /**
   * <p>
   * Setter method for the COM property "MinPrice"
   * </p>
   * @param pRetVal Mandatory double parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void minPrice(
    double pRetVal);


  /**
   * <p>
   * Getter method for the COM property "MaxPrice"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  double maxPrice();


  /**
   * <p>
   * Setter method for the COM property "MaxPrice"
   * </p>
   * @param pRetVal Mandatory double parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  void maxPrice(
    double pRetVal);


  /**
   * <p>
   * Getter method for the COM property "Increment"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  double increment();


  /**
   * <p>
   * Setter method for the COM property "Increment"
   * </p>
   * @param pRetVal Mandatory double parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  void increment(
    double pRetVal);


  /**
   * <p>
   * Getter method for the COM property "ExpirationDateInDays"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  int expirationDateInDays();


  /**
   * <p>
   * Setter method for the COM property "ExpirationDateInDays"
   * </p>
   * @param pRetVal Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  void expirationDateInDays(
    int pRetVal);


  /**
   * <p>
   * Getter method for the COM property "RechargeType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String rechargeType();


  /**
   * <p>
   * Setter method for the COM property "RechargeType"
   * </p>
   * @param pRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  void rechargeType(
    java.lang.String pRetVal);


  // Properties:
}
