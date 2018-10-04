package oi  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static oi.IClienteCappta createClienteCappta() {
    return COM4J.createInstance(oi.IClienteCappta.class, "{558C9FB7-207A-4F17-87BA-CAC733D25BC3}" );
  }

  public static oi._ProcessWrapper createProcessWrapper() {
    return COM4J.createInstance(oi._ProcessWrapper.class, "{F10204B9-03CF-3BD1-8DA6-7D4D27A732D0}" );
  }

  public static oi.IDetalheLoja createDetalheLoja() {
    return COM4J.createInstance(oi.IDetalheLoja.class, "{87496E86-3915-441B-A813-DB6463A37B84}" );
  }

  public static oi.IDetalhesOperadoras createDetalhesOperadoras() {
    return COM4J.createInstance(oi.IDetalhesOperadoras.class, "{ED43EE8B-84BC-45C8-A61A-85EE738F96B3}" );
  }

  public static oi.IDetalhesProdutosOperadoras createDetalhesProdutosOperadoras() {
    return COM4J.createInstance(oi.IDetalhesProdutosOperadoras.class, "{F7FF46CE-0437-49F2-95EE-2C8DA291F55E}" );
  }

  public static oi.IDetalhesRecarga createDetalhesRecarga() {
    return COM4J.createInstance(oi.IDetalhesRecarga.class, "{4EFD6042-100F-41D7-A744-D91E8D3D05B0}" );
  }

  public static oi.IProdutoRecarga createProdutoRecarga() {
    return COM4J.createInstance(oi.IProdutoRecarga.class, "{C147FFA1-5C8F-465F-B10C-BF4F3D897F80}" );
  }

  public static oi.IRespostaInformacaoPinpad createRespostaInformacaoPinpad() {
    return COM4J.createInstance(oi.IRespostaInformacaoPinpad.class, "{8ED58B1E-9F32-46A3-866D-2BF9305CE308}" );
  }

  public static oi.IRequisicaoInformacaoPinpad createRequisicaoInformacaoPinpad() {
    return COM4J.createInstance(oi.IRequisicaoInformacaoPinpad.class, "{C2DBA4EC-A426-4E21-9190-E7785DDA6422}" );
  }

  public static oi.IConfiguracoes createConfiguracoes() {
    return COM4J.createInstance(oi.IConfiguracoes.class, "{0B40CBAD-5E0E-4F3D-B117-541232E9AF64}" );
  }

  public static oi.IRespostaLoja createRespostaLoja() {
    return COM4J.createInstance(oi.IRespostaLoja.class, "{DFDF22DD-9588-473A-86D9-EFB261F072AF}" );
  }

  public static oi.IRespostaRecarga createRespostaRecarga() {
    return COM4J.createInstance(oi.IRespostaRecarga.class, "{6D6AEE29-A29E-4F78-9CA6-0BB2AEA5F8F8}" );
  }

  public static oi.IRespostaTransacaoPendente createRespostaTransacaoPendente() {
    return COM4J.createInstance(oi.IRespostaTransacaoPendente.class, "{ACF93A9B-923D-45D3-9F6E-2C8FDCEEF7CE}" );
  }

  public static oi.ITransacaoPendente createTransacaoPendente() {
    return COM4J.createInstance(oi.ITransacaoPendente.class, "{4565C580-D5A7-4A6A-9CC2-5D0CBE159FA0}" );
  }

  public static oi.IDetalhesPagamentoTicketCarPessoaFisica createDetalhesPagamentoTicketCarPessoaFisica() {
    return COM4J.createInstance(oi.IDetalhesPagamentoTicketCarPessoaFisica.class, "{B19BC291-2C96-4062-91EF-1E6AF84AB9CA}" );
  }

  public static oi.IDetalhesPagamentoTicketCarGestaoFrota createDetalhesPagamentoTicketCarGestaoFrota() {
    return COM4J.createInstance(oi.IDetalhesPagamentoTicketCarGestaoFrota.class, "{FEAF74EE-2AC7-46BF-8830-2FD877E264AA}" );
  }

  public static oi._MapTicketCarProductsResponse createMapTicketCarProductsResponse() {
    return COM4J.createInstance(oi._MapTicketCarProductsResponse.class, "{885CBF1E-AA7A-3AAD-8C4A-4BA005F408EB}" );
  }

  public static oi.IProdutoTicketCar createProdutoTicketCar() {
    return COM4J.createInstance(oi.IProdutoTicketCar.class, "{316F0BF9-16EB-40F6-8659-C936285B69FC}" );
  }

  public static oi.IRequisicaoProdutoTicketCar createRequisicaoProdutoTicketCar() {
    return COM4J.createInstance(oi.IRequisicaoProdutoTicketCar.class, "{8612DBE9-0B89-4BED-A855-095AF5170208}" );
  }

  public static oi.IRespostaProdutoTicketCar createRespostaProdutoTicketCar() {
    return COM4J.createInstance(oi.IRespostaProdutoTicketCar.class, "{6ED5DBFC-7585-44AA-BB3F-999F46C194A6}" );
  }

  public static oi.IRequisicaoParametro createRequisicaoParametro() {
    return COM4J.createInstance(oi.IRequisicaoParametro.class, "{603C49A8-3075-46A1-96D9-36FDE425B8DB}" );
  }

  public static oi.IRespostaOperacaoAprovada createRespostaOperacaoAprovada() {
    return COM4J.createInstance(oi.IRespostaOperacaoAprovada.class, "{9D0865CE-CBC1-41BF-9442-969107A33F6E}" );
  }

  public static oi.IRespostaOperacaoRecusada createRespostaOperacaoRecusada() {
    return COM4J.createInstance(oi.IRespostaOperacaoRecusada.class, "{804AD494-D7CF-4BB6-9814-0B65E90E0916}" );
  }

  public static oi.IDetalhesCrediario createDetalhesCrediario() {
    return COM4J.createInstance(oi.IDetalhesCrediario.class, "{BA468712-754C-42A3-8609-8A6BE4AE39E9}" );
  }

  public static oi.IDetalhesCredito createDetalhesCredito() {
    return COM4J.createInstance(oi.IDetalhesCredito.class, "{A9CB4E2F-8B2C-4379-9DBF-7A3642E61AA9}" );
  }
}
