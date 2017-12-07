package Form;

import cappta.dll.ClassFactory;
import cappta.dll.IClienteCappta;
import cappta.dll.IConfiguracoes;
import cappta.dll.IDetalhesCrediario;
import cappta.dll.IDetalhesCredito;
import cappta.dll.IIteracaoTef;
import cappta.dll.IMensagem;
import cappta.dll.IRequisicaoParametro;
import cappta.dll.IRespostaOperacaoAprovada;
import cappta.dll.IRespostaOperacaoRecusada;
import cappta.dll.IRespostaTransacaoPendente;
import cappta.dll.ITransacaoPendente;
import com4j.Com4jObject;
import com4j.ComThread;
import com4j.EventCookie;
import java.awt.Component;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Control;
import javax.swing.JOptionPane;
import org.omg.CORBA.Environment;

public class Form extends javax.swing.JFrame {

    IClienteCappta cappta;
    IIteracaoTef iteracaoTef;
    private final long INTERVALO_MILISEGUNDOS = 500;
    private boolean processandoPagamento;
    private boolean sessaoMultiTefEmAndamento;
    private int resultadoAltenticacao;
    private int quantidadeCartoes;
    private String cnpj = "34555898000186";
    private int pdv = 6;
    private String chaveAutenticacao = "795180024C04479982560F61B3C2C06E";
    private final int TIPO_VIA_TODAS = 1;
    private final int TIPO_VIA_CLIENTE = 2;
    private final int TIPO_VIA_LOJA = 3;
    private int tipoVia = TIPO_VIA_TODAS;

    public Form() {
        this.cappta = ClassFactory.createClienteCappta();
        initComponents();
    }

    //  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup transacaoParcelada = new javax.swing.ButtonGroup();
        modoIntegracao = new javax.swing.ButtonGroup();
        multplusCartoes = new javax.swing.ButtonGroup();
        qualVia = new javax.swing.ButtonGroup();
        reimprimirUltimoCupom = new javax.swing.ButtonGroup();
        panelBase = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RadioButtonUsarMultiTef = new javax.swing.JRadioButton();
        RadioButtonNaoUsarMultiTef = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonIniciarForm = new javax.swing.JButton();
        LabelQuantidadeDePagamentosMultiTef = new javax.swing.JLabel();
        NumericUpDownQuantidadeDePagamentosMultiTef = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        RadioButtonInterfaceVisivel = new javax.swing.JRadioButton();
        RadioButtonInterfaceInvisivel = new javax.swing.JRadioButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        Debito = new javax.swing.JPanel();
        jButtonPagamentoDebito = new javax.swing.JButton();
        jTextFieldValorDebito = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Credito = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldValorCredito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabelTipoParcelamentoCredito = new javax.swing.JLabel();
        Administrador = new javax.swing.JComboBox<>();
        jLabelQuantidadeParcelas = new javax.swing.JLabel();
        NumericUpDownQuantidadeParcelasPagamentoCredito = new javax.swing.JSpinner();
        ExecutarCredito = new javax.swing.JButton();
        RadioButtonPagamentoCreditoComParcelas = new javax.swing.JRadioButton();
        RadioButtonPagamentoCreditoSemParcelas = new javax.swing.JRadioButton();
        Cancelamento = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        TextBoxSenhaAdministrativaCancelamento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        NumericUpDownNumeroControleCancelamento = new javax.swing.JTextField();
        ExecutarCancelamento = new javax.swing.JToggleButton();
        Crediario = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        NumericUpDownValorPagamentoCrediario = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        NumericUpDownQuantidadeParcelasPagamentoCrediario = new javax.swing.JSpinner();
        ExecutaPagamentoCrediario = new javax.swing.JButton();
        Pinpad = new javax.swing.JPanel();
        ComboBoxTipoInformacaoPinpad = new javax.swing.JComboBox<>();
        ButtonSolicitarInformacaoPinpad = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        Reimpressão = new javax.swing.JPanel();
        RadioButtonReimprimirUltimoCupom = new javax.swing.JRadioButton();
        RadioButtonNaoReimprimirUltimoCupom = new javax.swing.JRadioButton();
        Reimprimir = new javax.swing.JLabel();
        NumericUpDownNumeroControleReimpressaoCupom = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabelQualVia = new javax.swing.JLabel();
        RadioButtonReimprimirTodasVias = new javax.swing.JRadioButton();
        RadioButtonReimprimirViaLoja = new javax.swing.JRadioButton();
        RadioButtonReimprimirViaCliente = new javax.swing.JRadioButton();
        jLabelNumeroControle = new javax.swing.JLabel();
        ExecutarReimpressao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextBoxResultado = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBase.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Utilizar Muliplus Cartões ?");

        multplusCartoes.add(RadioButtonUsarMultiTef);
        RadioButtonUsarMultiTef.setText("Sim");
        RadioButtonUsarMultiTef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonUsarMultiTefActionPerformed(evt);
            }
        });

        multplusCartoes.add(RadioButtonNaoUsarMultiTef);
        RadioButtonNaoUsarMultiTef.setSelected(true);
        RadioButtonNaoUsarMultiTef.setText("Não");
        RadioButtonNaoUsarMultiTef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonNaoUsarMultiTefActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Cappta Melhor Solução");

        jButtonIniciarForm.setText("Iniciar Form");
        jButtonIniciarForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarFormActionPerformed(evt);
            }
        });

        LabelQuantidadeDePagamentosMultiTef.setText("Quantidade de Pagamentos");

        NumericUpDownQuantidadeDePagamentosMultiTef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumericUpDownQuantidadeDePagamentosMultiTefMouseClicked(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Modo de Integração"));

        modoIntegracao.add(RadioButtonInterfaceVisivel);
        RadioButtonInterfaceVisivel.setSelected(true);
        RadioButtonInterfaceVisivel.setText("Visível ");
        RadioButtonInterfaceVisivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonInterfaceVisivelActionPerformed(evt);
            }
        });

        modoIntegracao.add(RadioButtonInterfaceInvisivel);
        RadioButtonInterfaceInvisivel.setText("Invisível");
        RadioButtonInterfaceInvisivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonInterfaceInvisivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(RadioButtonInterfaceVisivel)
                .addGap(28, 28, 28)
                .addComponent(RadioButtonInterfaceInvisivel)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonInterfaceVisivel)
                    .addComponent(RadioButtonInterfaceInvisivel))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(RadioButtonUsarMultiTef)
                        .addGap(18, 18, 18)
                        .addComponent(RadioButtonNaoUsarMultiTef)
                        .addGap(32, 32, 32)
                        .addComponent(LabelQuantidadeDePagamentosMultiTef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NumericUpDownQuantidadeDePagamentosMultiTef, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonIniciarForm, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonIniciarForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioButtonUsarMultiTef)
                    .addComponent(RadioButtonNaoUsarMultiTef)
                    .addComponent(LabelQuantidadeDePagamentosMultiTef)
                    .addComponent(NumericUpDownQuantidadeDePagamentosMultiTef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonPagamentoDebito.setText("Executar Operação");
        jButtonPagamentoDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagamentoDebitoActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor ");

        javax.swing.GroupLayout DebitoLayout = new javax.swing.GroupLayout(Debito);
        Debito.setLayout(DebitoLayout);
        DebitoLayout.setHorizontalGroup(
            DebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DebitoLayout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldValorDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jButtonPagamentoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DebitoLayout.setVerticalGroup(
            DebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DebitoLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(DebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPagamentoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
        );

        jTabbedPane5.addTab("Débito", Debito);

        jLabel6.setText("Valor");

        jLabel7.setText("Transação Parcelada?");

        jLabelTipoParcelamentoCredito.setText("Tipo de Parcelamento");
        jLabelTipoParcelamentoCredito.setEnabled(false);

        Administrador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha parcelamento", "Administrador", "Lojista", " " }));

        jLabelQuantidadeParcelas.setText("Quantidade de Parcelas");

        ExecutarCredito.setText("Executar Operação");
        ExecutarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecutarCreditoActionPerformed(evt);
            }
        });

        transacaoParcelada.add(RadioButtonPagamentoCreditoComParcelas);
        RadioButtonPagamentoCreditoComParcelas.setText("Sim");
        RadioButtonPagamentoCreditoComParcelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioButtonPagamentoCreditoComParcelasMouseClicked(evt);
            }
        });
        RadioButtonPagamentoCreditoComParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonPagamentoCreditoComParcelasActionPerformed(evt);
            }
        });

        transacaoParcelada.add(RadioButtonPagamentoCreditoSemParcelas);
        RadioButtonPagamentoCreditoSemParcelas.setSelected(true);
        RadioButtonPagamentoCreditoSemParcelas.setText("Não");
        RadioButtonPagamentoCreditoSemParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonPagamentoCreditoSemParcelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreditoLayout = new javax.swing.GroupLayout(Credito);
        Credito.setLayout(CreditoLayout);
        CreditoLayout.setHorizontalGroup(
            CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreditoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ExecutarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreditoLayout.createSequentialGroup()
                        .addGroup(CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabelQuantidadeParcelas)
                            .addComponent(jLabelTipoParcelamentoCredito)
                            .addGroup(CreditoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CreditoLayout.createSequentialGroup()
                                        .addComponent(jTextFieldValorCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel7)
                                        .addGap(32, 32, 32)
                                        .addComponent(RadioButtonPagamentoCreditoComParcelas)
                                        .addGap(26, 26, 26)
                                        .addComponent(RadioButtonPagamentoCreditoSemParcelas))
                                    .addGroup(CreditoLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(NumericUpDownQuantidadeParcelasPagamentoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CreditoLayout.setVerticalGroup(
            CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addGroup(CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(RadioButtonPagamentoCreditoComParcelas)
                    .addComponent(RadioButtonPagamentoCreditoSemParcelas))
                .addGap(18, 18, 18)
                .addComponent(jLabelTipoParcelamentoCredito)
                .addGap(15, 15, 15)
                .addComponent(Administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelQuantidadeParcelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumericUpDownQuantidadeParcelasPagamentoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExecutarCredito)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Credito", Credito);

        jLabel16.setText("Senha Administrativa");

        TextBoxSenhaAdministrativaCancelamento.setText("cappta");

        jLabel17.setText("Número de Controle");

        ExecutarCancelamento.setText("Executar Operação");
        ExecutarCancelamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecutarCancelamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CancelamentoLayout = new javax.swing.GroupLayout(Cancelamento);
        Cancelamento.setLayout(CancelamentoLayout);
        CancelamentoLayout.setHorizontalGroup(
            CancelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelamentoLayout.createSequentialGroup()
                .addGroup(CancelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NumericUpDownNumeroControleCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CancelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CancelamentoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel16))
                        .addGroup(CancelamentoLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(TextBoxSenhaAdministrativaCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CancelamentoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel17))))
                .addContainerGap(383, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelamentoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExecutarCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CancelamentoLayout.setVerticalGroup(
            CancelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelamentoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextBoxSenhaAdministrativaCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumericUpDownNumeroControleCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(ExecutarCancelamento)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Cancelamento", Cancelamento);

        jLabel10.setText("Valor");

        jLabel11.setText("Quantidade de parcelas");

        ExecutaPagamentoCrediario.setText("Pagamento Crediário");
        ExecutaPagamentoCrediario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecutaPagamentoCrediarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrediarioLayout = new javax.swing.GroupLayout(Crediario);
        Crediario.setLayout(CrediarioLayout);
        CrediarioLayout.setHorizontalGroup(
            CrediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrediarioLayout.createSequentialGroup()
                .addGroup(CrediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(CrediarioLayout.createSequentialGroup()
                .addGroup(CrediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrediarioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(NumericUpDownValorPagamentoCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrediarioLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(NumericUpDownQuantidadeParcelasPagamentoCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(392, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrediarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExecutaPagamentoCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CrediarioLayout.setVerticalGroup(
            CrediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrediarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumericUpDownValorPagamentoCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumericUpDownQuantidadeParcelasPagamentoCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(ExecutaPagamentoCrediario))
        );

        jTabbedPane5.addTab("Crediário", Crediario);

        ComboBoxTipoInformacaoPinpad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonSolicitarInformacaoPinpad.setText("Executar Operação");

        jLabel15.setText("Tipo de enrada Pinpad");

        javax.swing.GroupLayout PinpadLayout = new javax.swing.GroupLayout(Pinpad);
        Pinpad.setLayout(PinpadLayout);
        PinpadLayout.setHorizontalGroup(
            PinpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PinpadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSolicitarInformacaoPinpad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PinpadLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(ComboBoxTipoInformacaoPinpad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(PinpadLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PinpadLayout.setVerticalGroup(
            PinpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PinpadLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxTipoInformacaoPinpad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(ButtonSolicitarInformacaoPinpad)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Pinpad", Pinpad);

        reimprimirUltimoCupom.add(RadioButtonReimprimirUltimoCupom);
        RadioButtonReimprimirUltimoCupom.setText("Sim");
        RadioButtonReimprimirUltimoCupom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonReimprimirUltimoCupomActionPerformed(evt);
            }
        });

        reimprimirUltimoCupom.add(RadioButtonNaoReimprimirUltimoCupom);
        RadioButtonNaoReimprimirUltimoCupom.setText("Não");
        RadioButtonNaoReimprimirUltimoCupom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonNaoReimprimirUltimoCupomActionPerformed(evt);
            }
        });

        Reimprimir.setText("Reimprimir Ultimo Cupom ?");

        jLabelQualVia.setText("Qual Via?");

        qualVia.add(RadioButtonReimprimirTodasVias);
        RadioButtonReimprimirTodasVias.setSelected(true);
        RadioButtonReimprimirTodasVias.setText("Todas");
        RadioButtonReimprimirTodasVias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioButtonReimprimirTodasViasMouseClicked(evt);
            }
        });
        RadioButtonReimprimirTodasVias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonReimprimirTodasViasActionPerformed(evt);
            }
        });

        qualVia.add(RadioButtonReimprimirViaLoja);
        RadioButtonReimprimirViaLoja.setText("Loja");
        RadioButtonReimprimirViaLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonReimprimirViaLojaActionPerformed(evt);
            }
        });

        qualVia.add(RadioButtonReimprimirViaCliente);
        RadioButtonReimprimirViaCliente.setText("Cliente");
        RadioButtonReimprimirViaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonReimprimirViaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabelQualVia))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RadioButtonReimprimirTodasVias)
                        .addGap(10, 10, 10)
                        .addComponent(RadioButtonReimprimirViaLoja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonReimprimirViaCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelQualVia)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonReimprimirTodasVias)
                    .addComponent(RadioButtonReimprimirViaLoja)
                    .addComponent(RadioButtonReimprimirViaCliente))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabelNumeroControle.setText("Número de controle");

        ExecutarReimpressao.setText("Executar Operação");
        ExecutarReimpressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecutarReimpressaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReimpressãoLayout = new javax.swing.GroupLayout(Reimpressão);
        Reimpressão.setLayout(ReimpressãoLayout);
        ReimpressãoLayout.setHorizontalGroup(
            ReimpressãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReimpressãoLayout.createSequentialGroup()
                .addGroup(ReimpressãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reimprimir)
                    .addGroup(ReimpressãoLayout.createSequentialGroup()
                        .addComponent(RadioButtonReimprimirUltimoCupom)
                        .addGap(28, 28, 28)
                        .addComponent(RadioButtonNaoReimprimirUltimoCupom))
                    .addGroup(ReimpressãoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ReimpressãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReimpressãoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(NumericUpDownNumeroControleReimpressaoCupom, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNumeroControle))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReimpressãoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExecutarReimpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ReimpressãoLayout.setVerticalGroup(
            ReimpressãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReimpressãoLayout.createSequentialGroup()
                .addGroup(ReimpressãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReimpressãoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Reimprimir)
                        .addGap(18, 18, 18)
                        .addGroup(ReimpressãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButtonReimprimirUltimoCupom)
                            .addComponent(RadioButtonNaoReimprimirUltimoCupom))
                        .addGap(9, 9, 9)
                        .addComponent(jLabelNumeroControle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NumericUpDownNumeroControleReimpressaoCupom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReimpressãoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(ExecutarReimpressao)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Reimpressão", Reimpressão);

        jScrollPane1.setViewportView(TextBoxResultado);

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane5)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarFormActionPerformed

        AutenticarPDV();
        ConfigurarModoIntegracao(true);
        IniciarControles();
    }//GEN-LAST:event_jButtonIniciarFormActionPerformed

    private void jButtonPagamentoDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagamentoDebitoActionPerformed
        if (this.DeveIniciarMultiCartoes()) {
            this.IniciarMulticartoes();
        }

        double valor = Double.parseDouble(jTextFieldValorDebito.getText());

        if (this.DeveIniciarMultiCartoes()) {
            this.IniciarMulticartoes();
        }

        int resultado = cappta.pagamentoDebito(valor);
        if (resultado != 0) {
            this.CriarMensagemErroPainel(resultado);
            return;
        }

        processandoPagamento = true;
        IterarOperacaoTef();
    }//GEN-LAST:event_jButtonPagamentoDebitoActionPerformed

    private void RadioButtonUsarMultiTefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonUsarMultiTefActionPerformed
        if (RadioButtonUsarMultiTef.isSelected() == false) {
            return;
        }
        LabelQuantidadeDePagamentosMultiTef.show();
        NumericUpDownQuantidadeDePagamentosMultiTef.show();
    }//GEN-LAST:event_RadioButtonUsarMultiTefActionPerformed

    private void RadioButtonNaoUsarMultiTefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNaoUsarMultiTefActionPerformed
        if (RadioButtonNaoUsarMultiTef.isSelected() == false) {
            return;
        }

        sessaoMultiTefEmAndamento = false;
        LabelQuantidadeDePagamentosMultiTef.hide();
        NumericUpDownQuantidadeDePagamentosMultiTef.hide();
    }//GEN-LAST:event_RadioButtonNaoUsarMultiTefActionPerformed

    private void NumericUpDownQuantidadeDePagamentosMultiTefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumericUpDownQuantidadeDePagamentosMultiTefMouseClicked
        this.quantidadeCartoes = (int) this.NumericUpDownQuantidadeDePagamentosMultiTef.getValue();
    }//GEN-LAST:event_NumericUpDownQuantidadeDePagamentosMultiTefMouseClicked

    private void RadioButtonInterfaceVisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonInterfaceVisivelActionPerformed
        if (this.RadioButtonInterfaceInvisivel.isSelected() == false) {
            return;
        }
        this.ConfigurarModoIntegracao(true);
    }//GEN-LAST:event_RadioButtonInterfaceVisivelActionPerformed

    private void RadioButtonInterfaceInvisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonInterfaceInvisivelActionPerformed
        if (this.RadioButtonInterfaceVisivel.isSelected() == false) {
            return;
        }
        this.ConfigurarModoIntegracao(false);
    }//GEN-LAST:event_RadioButtonInterfaceInvisivelActionPerformed

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

    private void RadioButtonPagamentoCreditoComParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonPagamentoCreditoComParcelasActionPerformed
        Administrador.setVisible(true);
        jLabelTipoParcelamentoCredito.setVisible(true);
        NumericUpDownQuantidadeParcelasPagamentoCredito.setVisible(true);
        jLabelQuantidadeParcelas.setVisible(true);
    }//GEN-LAST:event_RadioButtonPagamentoCreditoComParcelasActionPerformed

    private void RadioButtonPagamentoCreditoComParcelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioButtonPagamentoCreditoComParcelasMouseClicked
        // TODO add your handling code here:
        Administrador.show();
        jLabelTipoParcelamentoCredito.show();
        NumericUpDownQuantidadeParcelasPagamentoCredito.show();
        jLabelQuantidadeParcelas.show();
    }//GEN-LAST:event_RadioButtonPagamentoCreditoComParcelasMouseClicked

    private void RadioButtonPagamentoCreditoSemParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonPagamentoCreditoSemParcelasActionPerformed
        Administrador.setVisible(false);
        jLabelTipoParcelamentoCredito.setVisible(false);
        jLabelQuantidadeParcelas.setVisible(false);
        NumericUpDownQuantidadeParcelasPagamentoCredito.setVisible(processandoPagamento);
    }//GEN-LAST:event_RadioButtonPagamentoCreditoSemParcelasActionPerformed

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

    private void RadioButtonReimprimirUltimoCupomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonReimprimirUltimoCupomActionPerformed
        jLabelNumeroControle.hide();
        NumericUpDownNumeroControleReimpressaoCupom.hide();
    }//GEN-LAST:event_RadioButtonReimprimirUltimoCupomActionPerformed

    private void RadioButtonNaoReimprimirUltimoCupomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNaoReimprimirUltimoCupomActionPerformed
        
        NumericUpDownNumeroControleReimpressaoCupom.show();
        jLabelNumeroControle.show();
    }//GEN-LAST:event_RadioButtonNaoReimprimirUltimoCupomActionPerformed

    private void RadioButtonReimprimirTodasViasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioButtonReimprimirTodasViasMouseClicked
        tipoVia = TIPO_VIA_TODAS;
    }//GEN-LAST:event_RadioButtonReimprimirTodasViasMouseClicked

    private void RadioButtonReimprimirTodasViasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonReimprimirTodasViasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonReimprimirTodasViasActionPerformed

    private void RadioButtonReimprimirViaLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonReimprimirViaLojaActionPerformed
        tipoVia = TIPO_VIA_LOJA;
    }//GEN-LAST:event_RadioButtonReimprimirViaLojaActionPerformed

    private void RadioButtonReimprimirViaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonReimprimirViaClienteActionPerformed
        tipoVia = TIPO_VIA_CLIENTE;
    }//GEN-LAST:event_RadioButtonReimprimirViaClienteActionPerformed

    private void ExecutarReimpressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutarReimpressaoActionPerformed
        if (sessaoMultiTefEmAndamento == true) {
            this.CriarMensagemErroJanela("Não é possível cancelar um pagamento com uma sessão multitef em andamento.");
            return;
        }
        if (RadioButtonReimprimirUltimoCupom.isSelected()){ cappta.reimprimirUltimoCupom(tipoVia);}
        else{
            cappta.reimprimirCupom(NumericUpDownNumeroControleReimpressaoCupom.getText(), tipoVia);
        }
       processandoPagamento = false;
       IterarOperacaoTef();
    }//GEN-LAST:event_ExecutarReimpressaoActionPerformed

    private void ExecutaPagamentoCrediarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutaPagamentoCrediarioActionPerformed
        double valor = (double)NumericUpDownValorPagamentoCrediario.getValue();
        IDetalhesCrediario detalhes = ClassFactory.createDetalhesCrediario();
        detalhes.quantidadeParcelas((int)NumericUpDownQuantidadeParcelasPagamentoCrediario.getValue());
        
        if(DeveIniciarMultiCartoes()){IniciarMulticartoes();}
        
        int resultado = cappta.pagamentoCrediario(valor, detalhes);       
        if (resultado != 0){CriarMensagemErroPainel(resultado);return;}
        
        processandoPagamento = true;
        IterarOperacaoTef();    
    }//GEN-LAST:event_ExecutaPagamentoCrediarioActionPerformed

    private void AutenticarPDV() {
        int resultadoAltenticacao;
        resultadoAltenticacao = cappta.autenticarPdv(cnpj, pdv, chaveAutenticacao);
        System.out.println(resultadoAltenticacao);
        if (resultadoAltenticacao == 0) {
            TextBoxResultado.setText("Altenticado com sucesso");
        }
        this.CriarMensagemErroPainel(resultadoAltenticacao);
    }

    private void IniciarControles() {
        Dictionary<Integer, TipoParcelamento> tiposParcelamento = new Hashtable<Integer, TipoParcelamento>();
        tiposParcelamento.put(0, TipoParcelamento.Administrador);
        tiposParcelamento.put(1, TipoParcelamento.Loja);

        Administrador.getSelectedIndex();

    }

    private void ConfigurarModoIntegracao(boolean exibirInterface) {      
        IConfiguracoes configs = ClassFactory.createConfiguracoes();
        configs.exibirInterface(exibirInterface);
        cappta.configurar(configs);
    }

    private void CriarMensagemErroPainel(int resultado) {
        JOptionPane.showMessageDialog(rootPane, resultado);
    }

    private void ExibirMensagem(IMensagem descricao) {
        JOptionPane.showMessageDialog(rootPane, descricao);
    }

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

                try {
                    Thread.sleep(INTERVALO_MILISEGUNDOS);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (iteracaoTef.is(IRequisicaoParametro.class)) {
                IRequisicaoParametro iRequisicaoParametro = iteracaoTef.queryInterface(IRequisicaoParametro.class);
                RequisitarParametros(iRequisicaoParametro);
            }

            if (iteracaoTef.is(IRequisicaoParametro.class)) {
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

    private void RequisitarParametros(IRequisicaoParametro requisicaoParametros) {
        String entrada;
        int parametro;
        int resposta;

        entrada = JOptionPane.showInputDialog(rootPane, requisicaoParametros.mensagem());
        if (entrada.length() <= 0) {
            parametro = 2;
        } else {
            parametro = 1;
        }

        resposta = cappta.enviarParametro(entrada, parametro);
    }

    private void ResolverTransacaoPendente(IRespostaTransacaoPendente irespostaTransacaoPendente) {
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

    private void ExibirDadosOperacaoRecusada(IRespostaOperacaoRecusada resposta) {
        AtualizarResultado(String.format("{1}, {2}, {3}", resposta.codigoMotivo(), resposta.motivo()));
    }

    private void AtualizarResultado(String mensagem) {

        TextBoxResultado.setText(mensagem);
    }

    private boolean OperacaoNaoFinalizada(IIteracaoTef iteracaoTef) {
        return iteracaoTef.tipoIteracao() != 1 && iteracaoTef.tipoIteracao() != 2;
    }

    @SuppressWarnings("empty-statement")
    private void ExibirDadosOperacaoAprovada(IRespostaOperacaoAprovada iRespostaOperacaoAprovada) {
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

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    private void FinalizarPagamento() {
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

    private String GerarMensagemTransacaoAprovada() {
        String mensagem = String.format(" Sim para confirmar e Não para Cancelar",
                (this.sessaoMultiTefEmAndamento ? "ões" : "ão"),
                (this.sessaoMultiTefEmAndamento ? "s" : ""),
                Environment.class);
        return mensagem;
    }

    private boolean DeveIniciarMultiCartoes() {
        return this.sessaoMultiTefEmAndamento == false && this.RadioButtonUsarMultiTef.isSelected();
    }

    private void IniciarMulticartoes() {
        this.quantidadeCartoes = (int) this.NumericUpDownQuantidadeDePagamentosMultiTef.getValue();
        this.sessaoMultiTefEmAndamento = true;
        cappta.iniciarMultiCartoes(this.quantidadeCartoes);
    }

    private void DesabilitarControlesMultiTef() {
        DesabilitarControle(RadioButtonUsarMultiTef);
        DesabilitarControle(RadioButtonNaoUsarMultiTef);
        DesabilitarControle(NumericUpDownQuantidadeDePagamentosMultiTef);
    }

    private void DesabilitarBotoes() {
        DesabilitarControle(jButtonPagamentoDebito);
        DesabilitarControle(jButtonIniciarForm);
    }

    private void DesabilitarControle(Component componente) {
        componente.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Administrador;
    private javax.swing.JToggleButton ButtonSolicitarInformacaoPinpad;
    private javax.swing.JPanel Cancelamento;
    private javax.swing.JComboBox<String> ComboBoxTipoInformacaoPinpad;
    private javax.swing.JPanel Crediario;
    private javax.swing.JPanel Credito;
    private javax.swing.JPanel Debito;
    private javax.swing.JButton ExecutaPagamentoCrediario;
    private javax.swing.JToggleButton ExecutarCancelamento;
    private javax.swing.JButton ExecutarCredito;
    private javax.swing.JButton ExecutarReimpressao;
    private javax.swing.JLabel LabelQuantidadeDePagamentosMultiTef;
    private javax.swing.JTextField NumericUpDownNumeroControleCancelamento;
    private javax.swing.JTextField NumericUpDownNumeroControleReimpressaoCupom;
    private javax.swing.JSpinner NumericUpDownQuantidadeDePagamentosMultiTef;
    private javax.swing.JSpinner NumericUpDownQuantidadeParcelasPagamentoCrediario;
    private javax.swing.JSpinner NumericUpDownQuantidadeParcelasPagamentoCredito;
    private javax.swing.JSpinner NumericUpDownValorPagamentoCrediario;
    private javax.swing.JPanel Pinpad;
    private javax.swing.JRadioButton RadioButtonInterfaceInvisivel;
    private javax.swing.JRadioButton RadioButtonInterfaceVisivel;
    private javax.swing.JRadioButton RadioButtonNaoReimprimirUltimoCupom;
    private javax.swing.JRadioButton RadioButtonNaoUsarMultiTef;
    private javax.swing.JRadioButton RadioButtonPagamentoCreditoComParcelas;
    private javax.swing.JRadioButton RadioButtonPagamentoCreditoSemParcelas;
    private javax.swing.JRadioButton RadioButtonReimprimirTodasVias;
    private javax.swing.JRadioButton RadioButtonReimprimirUltimoCupom;
    private javax.swing.JRadioButton RadioButtonReimprimirViaCliente;
    private javax.swing.JRadioButton RadioButtonReimprimirViaLoja;
    private javax.swing.JRadioButton RadioButtonUsarMultiTef;
    private javax.swing.JPanel Reimpressão;
    private javax.swing.JLabel Reimprimir;
    private javax.swing.JTextPane TextBoxResultado;
    private javax.swing.JTextField TextBoxSenhaAdministrativaCancelamento;
    private javax.swing.JButton jButtonIniciarForm;
    private javax.swing.JButton jButtonPagamentoDebito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelNumeroControle;
    private javax.swing.JLabel jLabelQualVia;
    private javax.swing.JLabel jLabelQuantidadeParcelas;
    private javax.swing.JLabel jLabelTipoParcelamentoCredito;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField jTextFieldValorCredito;
    private javax.swing.JTextField jTextFieldValorDebito;
    private javax.swing.ButtonGroup modoIntegracao;
    private javax.swing.ButtonGroup multplusCartoes;
    private javax.swing.JPanel panelBase;
    private javax.swing.ButtonGroup qualVia;
    private javax.swing.ButtonGroup reimprimirUltimoCupom;
    // End of variables declaration//GEN-END:variables

    private void HabilitarControlesMultiTef() {
        this.HabilitarControle(RadioButtonUsarMultiTef);
        this.HabilitarControle(RadioButtonNaoUsarMultiTef);
        this.HabilitarControle(NumericUpDownQuantidadeDePagamentosMultiTef);
    }

    private void HabilitarBotoes() {
        HabilitarControle(jButtonPagamentoDebito);
        HabilitarControle(jButtonIniciarForm);
    }

    private void HabilitarControle(Component componente) {
        componente.setEnabled(true);
    }

    private void CriarMensagemErroJanela(String mensagem) {
        JOptionPane.showMessageDialog(rootPane, mensagem);
    }

}
