package Com.Api.Java  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static Com.Api.Java.IClienteCappta createClienteCappta() {
    return COM4J.createInstance( Com.Api.Java.IClienteCappta.class, "{558C9FB7-207A-4F17-87BA-CAC733D25BC3}" );
  }

  public static Com.Api.Java._ProcessWrapper createProcessWrapper() {
    return COM4J.createInstance( Com.Api.Java._ProcessWrapper.class, "{F10204B9-03CF-3BD1-8DA6-7D4D27A732D0}" );
  }

  public static Com.Api.Java.IDetalheLoja createDetalheLoja() {
    return COM4J.createInstance( Com.Api.Java.IDetalheLoja.class, "{87496E86-3915-441B-A813-DB6463A37B84}" );
  }

  public static Com.Api.Java.IDetalhesOperadoras createDetalhesOperadoras() {
    return COM4J.createInstance( Com.Api.Java.IDetalhesOperadoras.class, "{ED43EE8B-84BC-45C8-A61A-85EE738F96B3}" );
  }

  public static Com.Api.Java.IDetalhesProdutosOperadoras createDetalhesProdutosOperadoras() {
    return COM4J.createInstance( Com.Api.Java.IDetalhesProdutosOperadoras.class, "{F7FF46CE-0437-49F2-95EE-2C8DA291F55E}" );
  }

  public static Com.Api.Java.IDetalhesRecarga createDetalhesRecarga() {
    return COM4J.createInstance( Com.Api.Java.IDetalhesRecarga.class, "{4EFD6042-100F-41D7-A744-D91E8D3D05B0}" );
  }

  public static Com.Api.Java.IProdutoRecarga createProdutoRecarga() {
    return COM4J.createInstance( Com.Api.Java.IProdutoRecarga.class, "{C147FFA1-5C8F-465F-B10C-BF4F3D897F80}" );
  }

  public static Com.Api.Java.IRespostaInformacaoPinpad createRespostaInformacaoPinpad() {
    return COM4J.createInstance( Com.Api.Java.IRespostaInformacaoPinpad.class, "{8ED58B1E-9F32-46A3-866D-2BF9305CE308}" );
  }

  public static Com.Api.Java.IRequisicaoInformacaoPinpad createRequisicaoInformacaoPinpad() {
    return COM4J.createInstance( Com.Api.Java.IRequisicaoInformacaoPinpad.class, "{C2DBA4EC-A426-4E21-9190-E7785DDA6422}" );
  }

  public static Com.Api.Java.IConfiguracoes createConfiguracoes() {
    return COM4J.createInstance( Com.Api.Java.IConfiguracoes.class, "{0B40CBAD-5E0E-4F3D-B117-541232E9AF64}" );
  }

  public static Com.Api.Java.IRespostaLoja createRespostaLoja() {
    return COM4J.createInstance( Com.Api.Java.IRespostaLoja.class, "{DFDF22DD-9588-473A-86D9-EFB261F072AF}" );
  }

  public static Com.Api.Java.IRespostaRecarga createRespostaRecarga() {
    return COM4J.createInstance( Com.Api.Java.IRespostaRecarga.class, "{6D6AEE29-A29E-4F78-9CA6-0BB2AEA5F8F8}" );
  }

  public static Com.Api.Java.IRespostaTransacaoPendente createRespostaTransacaoPendente() {
    return COM4J.createInstance( Com.Api.Java.IRespostaTransacaoPendente.class, "{ACF93A9B-923D-45D3-9F6E-2C8FDCEEF7CE}" );
  }

  public static Com.Api.Java.ITransacaoPendente createTransacaoPendente() {
    return COM4J.createInstance( Com.Api.Java.ITransacaoPendente.class, "{4565C580-D5A7-4A6A-9CC2-5D0CBE159FA0}" );
  }

  public static Com.Api.Java.IDetalhesPagamentoTicketCarPessoaFisica createDetalhesPagamentoTicketCarPessoaFisica() {
    return COM4J.createInstance( Com.Api.Java.IDetalhesPagamentoTicketCarPessoaFisica.class, "{B19BC291-2C96-4062-91EF-1E6AF84AB9CA}" );
  }

  public static Com.Api.Java.IDetalhesPagamentoTicketCarGestaoFrota createDetalhesPagamentoTicketCarGestaoFrota() {
    return COM4J.createInstance( Com.Api.Java.IDetalhesPagamentoTicketCarGestaoFrota.class, "{FEAF74EE-2AC7-46BF-8830-2FD877E264AA}" );
  }

  public static Com.Api.Java._MapTicketCarProductsResponse createMapTicketCarProductsResponse() {
    return COM4J.createInstance( Com.Api.Java._MapTicketCarProductsResponse.class, "{885CBF1E-AA7A-3AAD-8C4A-4BA005F408EB}" );
  }

  public static Com.Api.Java.IProdutoTicketCar createProdutoTicketCar() {
    return COM4J.createInstance( Com.Api.Java.IProdutoTicketCar.class, "{316F0BF9-16EB-40F6-8659-C936285B69FC}" );
  }

  public static Com.Api.Java.IRequisicaoProdutoTicketCar createRequisicaoProdutoTicketCar() {
    return COM4J.createInstance( Com.Api.Java.IRequisicaoProdutoTicketCar.class, "{8612DBE9-0B89-4BED-A855-095AF5170208}" );
  }

  public static Com.Api.Java.IRespostaProdutoTicketCar createRespostaProdutoTicketCar() {
    return COM4J.createInstance( Com.Api.Java.IRespostaProdutoTicketCar.class, "{6ED5DBFC-7585-44AA-BB3F-999F46C194A6}" );
  }

  public static Com.Api.Java.IRequisicaoParametro createRequisicaoParametro() {
    return COM4J.createInstance( Com.Api.Java.IRequisicaoParametro.class, "{603C49A8-3075-46A1-96D9-36FDE425B8DB}" );
  }

  public static Com.Api.Java.IRespostaOperacaoAprovada createRespostaOperacaoAprovada() {
    return COM4J.createInstance( Com.Api.Java.IRespostaOperacaoAprovada.class, "{9D0865CE-CBC1-41BF-9442-969107A33F6E}" );
  }

  public static Com.Api.Java.IRespostaOperacaoRecusada createRespostaOperacaoRecusada() {
    return COM4J.createInstance( Com.Api.Java.IRespostaOperacaoRecusada.class, "{804AD494-D7CF-4BB6-9814-0B65E90E0916}" );
  }

  public static Com.Api.Java.IDetalhesCrediario createDetalhesCrediario() {
    return COM4J.createInstance( Com.Api.Java.IDetalhesCrediario.class, "{BA468712-754C-42A3-8609-8A6BE4AE39E9}" );
  }

  public static Com.Api.Java.IDetalhesCredito createDetalhesCredito() {
    return COM4J.createInstance( Com.Api.Java.IDetalhesCredito.class, "{A9CB4E2F-8B2C-4379-9DBF-7A3642E61AA9}" );
  }
}
