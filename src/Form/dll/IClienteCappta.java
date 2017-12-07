package cappta.dll  ;

import com4j.*;

@IID("{B7EAC4F5-BAB7-4371-9BAC-A962CF737EDD}")
public interface IClienteCappta extends Com4jObject {
  // Methods:
  /**
   * @param senhaAdministrativa Mandatory java.lang.String parameter.
   * @param numeroControle Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int cancelarPagamento(
    java.lang.String senhaAdministrativa,
    java.lang.String numeroControle);


  /**
   * @param valor Mandatory double parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int pagamentoDebito(
    double valor);


  /**
   * @param valor Mandatory double parameter.
   * @param detalhes Mandatory cappta.dll.IDetalhesCrediario parameter.
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int pagamentoCrediario(
    double valor,
    cappta.dll.IDetalhesCrediario detalhes);


  /**
   * @param valor Mandatory double parameter.
   * @param detalhes Mandatory cappta.dll.IDetalhesCredito parameter.
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int pagamentoCredito(
    double valor,
    cappta.dll.IDetalhesCredito detalhes);


  /**
   * @param numeroControle Mandatory java.lang.String parameter.
   * @param tipoVia Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  int reimprimirCupom(
    java.lang.String numeroControle,
    int tipoVia);


  /**
   * @param tipoVia Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  int reimprimirUltimoCupom(
    int tipoVia);


  /**
   * @param quantidadePagamentos Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  int iniciarMultiCartoes(
    int quantidadePagamentos);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  int confirmarPagamentos();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  int desfazerPagamentos();


  /**
   * @param parametro Mandatory java.lang.String parameter.
   * @param acao Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  int enviarParametro(
    java.lang.String parametro,
    int acao);


  /**
   * @param cnpj Mandatory java.lang.String parameter.
   * @param pdv Mandatory int parameter.
   * @param chaveAutenticacao Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  int autenticarPdv(
    java.lang.String cnpj,
    int pdv,
    java.lang.String chaveAutenticacao);


  /**
   * @return  Returns a value of type cappta.dll.IIteracaoTef
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  cappta.dll.IIteracaoTef iterarOperacaoTef();


  /**
   * @param requisicaoPinpad Mandatory cappta.dll.IRequisicaoInformacaoPinpad parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String solicitarInformacoesPinpad(
    cappta.dll.IRequisicaoInformacaoPinpad requisicaoPinpad);


  /**
   * @param configs Mandatory cappta.dll.IConfiguracoes parameter.
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  int configurar(
    cappta.dll.IConfiguracoes configs);


  /**
   * @param valor Mandatory double parameter.
   * @param detalhes Mandatory cappta.dll.IDetalhesPagamentoTicketCarPessoaFisica parameter.
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  int pagamentoTicketCarPessoaFisica(
    double valor,
    cappta.dll.IDetalhesPagamentoTicketCarPessoaFisica detalhes);


  /**
   * @return  Returns a value of type cappta.dll.IDetalhesOperadoras
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(22)
  cappta.dll.IDetalhesOperadoras obterOperadoras();


  /**
   * @param mobileOperator Mandatory java.lang.String parameter.
   * @return  Returns a value of type cappta.dll.IDetalhesProdutosOperadoras
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(23)
  cappta.dll.IDetalhesProdutosOperadoras obterProdutosOperadoras(
    java.lang.String mobileOperator);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(24)
  int abortarOperacao();


  /**
   * @return  Returns a value of type cappta.dll.IRespostaLoja
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(25)
  cappta.dll.IRespostaLoja obterLojas();


  /**
   * @param loja Mandatory cappta.dll.IDetalheLoja parameter.
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(26)
  int ativarLoja(
    cappta.dll.IDetalheLoja loja);


  /**
   * @param detalhes Mandatory cappta.dll.IDetalhesRecarga parameter.
   * @return  Returns a value of type cappta.dll.IIteracaoTef
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(27)
  cappta.dll.IIteracaoTef recargaCelular(
    cappta.dll.IDetalhesRecarga detalhes);


  // Properties:
}
