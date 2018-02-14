<h1>Integração Java</h1>

A Dll da Cappta foi desenvolvida utilizando as melhores práticas de programação e desenvolvimento de software. Utilizamos o padrão COM pensando justamente na integração entre aplicações construídas em várias linguagens. O Java não tem suporte ao padrão COM, porem existem diversas bibliotecas que fazem o papel de Wrapper.

Obs: Durante a instalação do CapptaGpPlus o mesmo encarrega-se de registrar a DLL em seu computador.

<h3>Etapa 1</h3></br>

<h4>Tempo estimado de 01:00 hora </h4>

 A primeira etapa consiste na na utilização do Com4j ou outra biblioteca para tratamento de Dll em .Net.</br>
 
 Para saber mais sobre Com4j: http://com4j.kohsuke.org/tutorial.html

<h3>Como utilizar?</h3>

Utilizando o CMD, navegue até a pasta onde ira criar o projeto, esta pasta devera conter o Com4j previaente baixado do site citado acima e executar este comando:

java -jar tlbimp.jar -o com4j -p Com.Api.Java "C:\Program Files (x86)\CAPPTA\CapptaGpPlus\Cappta.Gp.Api.Com.tlb"

Depois arraste o arquivo gerado para dentro de seu projeto
	
A primeira função a ser utilizada é **AutenticarPdv()**.</br>
     
Para autenticar é necessário os seguintes dados: CNPJ, PDV e chave de autenticação, estes dados são os mesmos fornecidos durante a instalação do GP.</br>
	
Chave: 795180024C04479982560F61B3C2C06E </br>

Exemplo de utilização de uma instancia
this.cappta = ClassFactory.createClienteCappta();

```javascript

     private void AutenticarPDV() {
        int resultadoAltenticacao;
        resultadoAltenticacao = cappta.autenticarPdv(cnpj, pdv, chaveAutenticacao);

        switch (resultadoAltenticacao) {
            case 1:
                CriarMensagemErroJanela("Não autorizado. Por favor, realize a autenticação para utilizar o CapptaGpPlus");
                break;
            case 2:
                CriarMensagemErroJanela("O CapptaGpPlus esta sendo inicializado, tente novamente em alguns instantes.");
                break;
            case 3:
                CriarMensagemErroJanela("O formato da requisição recebida pelo CapptaGpPlus é inválido.");
                break;
            case 4:
                CriarMensagemErroJanela("Operação cancelada pelo operador.");
                break;
            case 7:
                CriarMensagemErroJanela("Ocorreu um erro interno no CapptaGpPlus.");
                break;
            case 8:
                CriarMensagemErroJanela("Ocorreu um erro na comunicação entre a CappAPI e o CapptaGpPlus.");
                break;
            case 0:
                TextBoxResultado.setText("Autenticado com sucesso");
                break;
        }
    }
```
O resultado para autenticação com sucesso é: 0

<h1>Primeiro esforço.</h1>
	Toda vez que realizar uma ação com o GP, vai perceber que ele começa a exibir o código 2 para autenticação, não se preocupe é assim mesmo, para recuperar os estados do GP, vamos direto para a etapa 3.

<h1> Etapa 2 </h1>

<h4>Tempo estimado de 00:30 minutos</h4>

Temos duas formas de integração, a visivel, onde a interação com o usuário fica por conta da Cappta, e a invisivel onde o form pode ser personalizado.


<h3>Para configurar o modo de integração</h3>

```javascript
  private void ConfigurarModoIntegracao(boolean exibir) {
        IConfiguracoes configs = ClassFactory.createConfiguracoes();
        configs.exibirInterface(exibir);
        cappta.configurar(configs);
    }
```

<h1>Etapa 3</h1>

<h4>Tempo estimado de 01:00 hora</h4>

Conforme mencionado acima a Iteração Tef é muito importante para o perfeito funcionamento da integração, toda as ações de venda e administrativas passam por esta função. 

```javascript
 private void IterarOperacaoTef() {
        if (this.RadioButtonUsarMultiTef.isSelected()) {
            this.DesabilitarControlesMultiTef();
        }
        this.DesabilitarBotoes();
        IIteracaoTef iteracaoTef = null;

        do {
            iteracaoTef = cappta.iterarOperacaoTef();
            if (iteracaoTef.is(IMensagem.class)) {
                IMensagem iMensagem = iteracaoTef.queryInterface(IMensagem.class);
                ExibirMensagem(iMensagem);
            }

            if (iteracaoTef.is(IRequisicaoParametro.class)) {
                IRequisicaoParametro iRequisicaoParametro = iteracaoTef.queryInterface(IRequisicaoParametro.class);
                RequisitarParametros(iRequisicaoParametro);
            }

            if (iteracaoTef.is(IRespostaTransacaoPendente.class)) {
                IRespostaTransacaoPendente resposta = iteracaoTef.queryInterface(IRespostaTransacaoPendente.class);
                ResolverTransacaoPendente(resposta);
            }
            if (iteracaoTef.is(IRespostaOperacaoRecusada.class)) {
                IRespostaOperacaoRecusada resposta = iteracaoTef.queryInterface(IRespostaOperacaoRecusada.class);
                ExibirDadosOperacaoRecusada(resposta);
            }
            if (iteracaoTef.is(IRespostaOperacaoAprovada.class)) {
                IRespostaOperacaoAprovada resposta = iteracaoTef.queryInterface(IRespostaOperacaoAprovada.class);
                ExibirDadosOperacaoAprovada(resposta);
                FinalizarPagamento();
            }

        } while (OperacaoNaoFinalizada(iteracaoTef));

        if (this.sessaoMultiTefEmAndamento == false) {
            this.HabilitarControlesMultiTef();
        }//true
        HabilitarBotoes();
    }

```

Dentro de IterarOperacaoTef() temos alguns métodos:

<h3>Requisitar Parametros</h3>


```javascript
private void RequisitarParametros(IRequisicaoParametro requisicaoParametros)
 {
        String mensagem = input(requisicaoParametros.mensagem());
        int parametro;
        if (mensagem == null) {
            return;
        }
        if (mensagem.isEmpty()) {
            parametro = 2;
        } else {
            parametro = 1;
        }
        cappta.enviarParametro(mensagem, parametro);
    }
```


<h3>Resolver Transacao Pendente</h3>

```javascript
private void ResolverTransacaoPendente(IRespostaTransacaoPendente irespostaTransacaoPendente) 
  {
        ITransacaoPendente transacao = null;
        String inputString = null;
        int acao;
        int result;

        StringBuilder mensagemTransacaoPendente = new StringBuilder();
        mensagemTransacaoPendente.append(irespostaTransacaoPendente.mensagem());
        mensagemTransacaoPendente.append("Número de Controle:" + transacao.numeroControle());
        mensagemTransacaoPendente.append("Bandeira:" + transacao.nomeBandeiraCartao());
        mensagemTransacaoPendente.append("Adquirente:" + transacao.nomeAdquirente());
        mensagemTransacaoPendente.append("Valor:" + transacao.valor());
        mensagemTransacaoPendente.append("Data:" + transacao.dataHoraAutorizacao());

        inputString = JOptionPane.showInputDialog(rootPane, irespostaTransacaoPendente);
        if (inputString.length() <= 0) {
            acao = 2;
        } else {
            acao = 1;
        }

        result = cappta.enviarParametro(inputString, acao);
    }
```
<h3>Exibir Dados Operacao Aprovada</h3>

```javascript
 private void ExibirDadosOperacaoAprovada(IRespostaOperacaoAprovada iRespostaOperacaoAprovada)
 {
        StringBuilder mensagemAprovada = new StringBuilder();

        if (iRespostaOperacaoAprovada.cupomCliente() != null) {
            mensagemAprovada = mensagemAprovada.append(iRespostaOperacaoAprovada.cupomCliente().replaceAll("\"", ""));
        }
        if (iRespostaOperacaoAprovada.cupomLojista() != null) {
            mensagemAprovada = mensagemAprovada.append(iRespostaOperacaoAprovada.cupomLojista().replaceAll("\"", ""));
        }
        if (iRespostaOperacaoAprovada.cupomReduzido() != null) {
            mensagemAprovada = mensagemAprovada.append(iRespostaOperacaoAprovada.cupomReduzido().replaceAll("\"", ""));
        }
        this.AtualizarResultado(mensagemAprovada.toString());

    }
```

<h3>Finalizar Pagamento</h3>

```javascript
private void FinalizarPagamento() 
  {
        if (processandoPagamento = false) {
            return;
        }
        if (sessaoMultiTefEmAndamento) {
            quantidadeCartoes--;
            if (quantidadeCartoes > 0) {
                return;
            }
        }
        String mensagem = GerarMensagemTransacaoAprovada();

        this.processandoPagamento = false;
        this.sessaoMultiTefEmAndamento = false;

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, mensagem + "?", "", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            cappta.confirmarPagamentos();

        } else {
            cappta.desfazerPagamentos();
        }
    }
```

<h1>Etapa 4</h1>

<h4> Tempo estimado de 01:00 hora </h4>

Parabéns agora falta pouco, lembrando que a qualquer momento você pode entrar em contato com a equipe tecnica.

Tel: (11) 4302-6179.

Por se tratar de um ambiente de testes, pode ser utilizado cartões reais para as transações, não sera cobrado nada em sua fatura. Se precisar pode utilizar os cartões presentes em nosso [roteiro de teste](http://docs.desktop.cappta.com.br/docs/portf%C3%B3lio-de-cart%C3%B5es-de-testes). Lembrando que vendas digitadas é permitido apenas para a modalidade crédito.

Vamos para a elaboração dos metodos para pagamento.

O primeiro é pagamento débito, o mais simples.

```javascript
private void jButtonPagamentoDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagamentoDebitoActionPerformed
        if (this.DeveIniciarMultiCartoes()) {
            this.IniciarMulticartoes();
        }

        double valor = Double.parseDouble(jTextFieldValorDebito.getText());
        if(valor <= 0  ){
            CriarMensagemErroJanela("Por favor preencha com o valor");
            return;
        }
        if (this.DeveIniciarMultiCartoes()) {
            this.IniciarMulticartoes();
        }

        cappta.pagamentoDebito(valor);

        processandoPagamento = true;
        IterarOperacaoTef();
    }//GEN-LAST:event_jButtonPagamentoDebitoActionPerformed
```
<h3>Agora pagamento credito:</h3>

```javascript
 private void ExecutarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutarCreditoActionPerformed
        if (this.DeveIniciarMultiCartoes()) {
            this.IniciarMulticartoes();
        }
        double valor = Double.parseDouble(jTextFieldValorCredito.getText());

        IDetalhesCredito idetalhesCredito = ClassFactory.createDetalhesCredito();
        idetalhesCredito.quantidadeParcelas((int) NumericUpDownQuantidadeParcelasPagamentoCredito.getValue());
        idetalhesCredito.tipoParcelamento(Administrador.getSelectedIndex());
        idetalhesCredito.transacaoParcelada(RadioButtonPagamentoCreditoComParcelas.isSelected());

        if (this.DeveIniciarMultiCartoes()) {
            this.IniciarMulticartoes();
        }

        int resultado = this.cappta.pagamentoCredito(valor, idetalhesCredito);

        if (resultado != 0) {
            this.CriarMensagemErroPainel(resultado);
            return;
        }

        this.processandoPagamento = true;
        this.IterarOperacaoTef();
    }//GEN-LAST:event_ExecutarCreditoActionPerformed
```

<h3>Crediário </h3>

```javascript
 private void ExecutaPagamentoCrediarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutaPagamentoCrediarioActionPerformed
        double valor = (int) NumericUpDownValorPagamentoCrediario.getValue();
        IDetalhesCrediario detalhes = ClassFactory.createDetalhesCrediario();
        detalhes.quantidadeParcelas((int) NumericUpDownQuantidadeParcelasPagamentoCrediario.getValue());

        if (DeveIniciarMultiCartoes()) {
            IniciarMulticartoes();
        }

        int resultado = cappta.pagamentoCrediario(valor, detalhes);
        if (resultado != 0) {
            CriarMensagemErroPainel(resultado);
            return;
        }

        processandoPagamento = true;
        IterarOperacaoTef();
    }//GEN-LAST:event_ExecutaPagamentoCrediarioActionPerformed
```

<h1>Etapa 5 </h1>

<h4> Tempo estimado de 01:00 hora </h4>

**Funções administrativas**

Agora que tratamos as formas de pagamento, podemos partir para as funções administrativas. 

Clientes com frequência pedem a reimpressão de um comprovante ou um cancelamento, as funções administrativas tem a função de deixar praticas e acessiveis estas funções.

<h3>Para reimpressão </h3>
Temos as seguintes formas: 

Reimpressão por número de controle

Reimpressão cupom lojista

Reimpressão cupom cliente

Reimpressão de todas as vias

```javascript
private void OnButtonExecutaReimpressaoCupomClick(object sender, EventArgs e)
{
	if (this.sessaoMultiTefEmAndamento == true)
{
this.CriarMensagemErroJanela("Não é possível reimprimir um cupom com uma sessão multitef em andamento."); return;
}

	int resultado = this.RadioButtonReimprimirUltimoCupom.Checked

		? this.cliente.ReimprimirUltimoCupom(this.tipoVia)
		: this.cliente.ReimprimirCupom(this.NumericUpDownNumeroControleReimpressaoCupom.Value.ToString("00000000000"), this.tipoVia);

	if (resultado != 0) { this.CriarMensagemErroPainel(resultado); return; }

	this.processandoPagamento = false;
	this.IterarOperacaoTef();
}

```

<h3>Para Cancelamento </h3>

Para cancelar uma transação é preciso do número de controle e da senha administrativa, esta senha é configurável no Pinpad e por padrão é: **cappta**.  O número de controle é informado na resposta da operação aprovada.

```javascript
private void ExecutarCancelamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutarCancelamentoActionPerformed
        if (sessaoMultiTefEmAndamento == true) {
            this.CriarMensagemErroJanela("Não é possível cancelar um pagamento com uma sessão multitef em andamento.");
            return;
        }

        String senhaAdministrativa = TextBoxSenhaAdministrativaCancelamento.getText();

        if (senhaAdministrativa.isEmpty()) {
            this.CriarMensagemErroJanela("A senha administrativa não pode ser vazia.");
            return;
        }

        String numeroControle = NumericUpDownNumeroControleCancelamento.getText();
        if (numeroControle.isEmpty()) {
            this.CriarMensagemErroJanela("A senha administrativa não pode ser vazia.");
            return;
        }

        int resultado = cappta.cancelarPagamento(senhaAdministrativa, numeroControle);
        if (resultado != 0) {
            CriarMensagemErroPainel(resultado);
            return;
        }

        processandoPagamento = false;
        IterarOperacaoTef();

    }//GEN-LAST:event_ExecutarCancelamentoActionPerformed

```
<h1> Etapa 6 </h1>

<h4> Tempo estimado de 00:40 minutos </h4>

Agora que ja fizemos 80% da integração precisamos trabalhar no Multicartões.

Multicartões ou MultiTef é uma forma de passar mais de um cartão em uma transação, nossa forma de realizar esta tarefa é diferente, se cancelarmos uma venda no meio de uma transação multtef todas são canceladas.

```javascript
private void IniciarMulticartoes() {
        this.quantidadeCartoes = (int) this.NumericUpDownQuantidadeDePagamentosMultiTef.getValue();
        this.sessaoMultiTefEmAndamento = true;
        cappta.iniciarMultiCartoes(this.quantidadeCartoes);
    }

```
<h6>
Para o código completo basta clonar o repositório, qualquer dúvida entre em contato com o time de homologação e parceria Cappta.
Quando completar a integração basta acessar nossa documentação e seguir os passos do nosso [roteiro](http://docs.desktop.cappta.com.br/docs). </h6>


**Configurando e usando:**

------------------------------------------------------------

- Instale e execute o CapptaGpPlus.exe com os dados forneceidos pela equipe;

- Execute o CapptaGpPlus;

- Extraia e abra o diretório Cappta.Gp.API.CSharp.Samples-master;

- Abra o arquivo Form.java  em um editor de texto e configure os parametros "Cnpj" e "Pdv" com os dados fornedidos para instalação do CapptaGpPlus (não alterar a Chave de Autenticação); 
**Ex.:** authenticationKey: '795180024C04479982560F61B3C2C06E', merchantCnpj: '00000000000000', checkoutNumber: 14

- Execute o Cappta.Gp.Api.Com.Sample.exe ou use o código do projeto para fazer as transações de testes.




Cappta.Gp.API.Java.Samples

Para utilização da DLL em soluções Java é necessário utilizar o Com4j uma biblioteca responsável por gerar definições de tipo Java de uma biblioteca do tipo COM

Para saber mais sobre Com4j: http://com4j.kohsuke.org/tutorial.html

Como utilizar?

Utilizando o CMD, navegue até a pasta onde ira criar o projeto, esta pasta devera conter o Com4j previaente baixado do site citado acima e executar este comando:

java -jar tlbimp.jar -o com4j -p Com.Api.Java "C:\Program Files (x86)\CAPPTA\CapptaGpPlus\Cappta.Gp.Api.Com.tlb"

Depois arraste o arquivo gerado para dentro de seu projeto
