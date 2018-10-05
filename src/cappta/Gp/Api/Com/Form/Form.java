package Cappta.Gp.Api.Com.Form;

import cappta.Gp.Api.Com.Interfaces.*;
import com.sun.corba.se.spi.orbutil.fsm.Input;
import com4j.Com4jObject;
import com4j.ComThread;
import com4j.EventCookie;
import java.awt.Component;
import java.util.*;
import javafx.scene.control.Control;
import javax.print.*;
import javax.swing.*;
import org.omg.CORBA.Environment;
import sun.awt.im.InputMethodJFrame;

public class Form extends javax.swing.JFrame {

    IClienteCappta cappta;
    
    IIteracaoTef iteracaoTef;
    
    private final long INTERVALO_MILISEGUNDOS = 500;
    
    private boolean processandoPagamento;
    
    private boolean sessaoMultiTefEmAndamento;
    
    private int resultadoAltenticacao;
    
    private int quantidadeCartoes;
    
    private String cnpj = "34555898000186";
    
    private int pdv = 1;
    
    private String chaveAutenticacao = "795180024C04479982560F61B3C2C06E";
    
    private final int TIPO_VIA_TODAS = 1;
    
    private final int TIPO_VIA_CLIENTE = 2;
    
    private final int TIPO_VIA_LOJA = 3;
    
    private int tipoVia = TIPO_VIA_TODAS;
 
    public Form()
    {
        this.cappta = ClassFactory.createClienteCappta();
        
        initComponents();
        
        LabelQuantidadeDePagamentosMultiTef.setVisible(false);
        
        SpinnerNumberModel model = new SpinnerNumberModel(2, 2, 9, 1);

        NumericUpDownQuantidadeDePagamentosMultiTef.setVisible(false);
        
        NumericUpDownQuantidadeParcelasPagamentoCredito.setVisible(false);
        
        jLabelTipoParcelamentoCredito.setVisible(false);
        
        Administrador.setVisible(false);
        
        jLabelQuantidadeParcelas.setVisible(false);
        
        ImprimirUltimaVia();
        
        AutenticarPDV();
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup transacaoParcelada = new javax.swing.ButtonGroup();
        modoIntegracao = new javax.swing.ButtonGroup();
        multplusCartoes = new javax.swing.ButtonGroup();
        qualVia = new javax.swing.ButtonGroup();
        reimprimirUltimoCupom = new javax.swing.ButtonGroup();
        jPanel11 = new javax.swing.JPanel();
        panelBaseMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPanelTransacoes = new javax.swing.JTabbedPane();
        Credito = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelTipoParcelamentoCredito = new javax.swing.JLabel();
        Administrador = new javax.swing.JComboBox<>();
        jLabelQuantidadeParcelas = new javax.swing.JLabel();
        NumericUpDownQuantidadeParcelasPagamentoCredito = new javax.swing.JSpinner();
        ExecutarCredito = new javax.swing.JButton();
        RadioButtonPagamentoCreditoComParcelas = new javax.swing.JRadioButton();
        RadioButtonPagamentoCreditoSemParcelas = new javax.swing.JRadioButton();
        Cancelamento = new javax.swing.JPanel();
        jLabelSenhaAdm = new javax.swing.JLabel();
        TextBoxSenhaAdministrativaCancelamento = new javax.swing.JTextField();
        jLabelNControle = new javax.swing.JLabel();
        NumericUpDownNumeroControleCancelamento = new javax.swing.JTextField();
        ExecutarCancelamento = new javax.swing.JToggleButton();
        Crediario = new javax.swing.JPanel();
        jLabelQparcelas = new javax.swing.JLabel();
        NumericUpDownQuantidadeParcelasPagamentoCrediario = new javax.swing.JSpinner();
        ExecutaPagamentoCrediario = new javax.swing.JButton();
        Pinpad = new javax.swing.JPanel();
        ComboBoxTipoInformacaoPinpad = new javax.swing.JComboBox<>();
        ButtonSolicitarInformacaoPinpad = new javax.swing.JToggleButton();
        jLabelTPinpad = new javax.swing.JLabel();
        Reimpressão = new javax.swing.JPanel();
        RadioButtonReimprimirUltimoCupom = new javax.swing.JRadioButton();
        RadioButtonNaoReimprimirUltimoCupom = new javax.swing.JRadioButton();
        Reimprimir = new javax.swing.JLabel();
        NumericUpDownNumeroControleReimpressaoCupom = new javax.swing.JTextField();
        jLabelNumeroControle = new javax.swing.JLabel();
        jLabelQualVia = new javax.swing.JLabel();
        RadioButtonReimprimirTodasVias = new javax.swing.JRadioButton();
        RadioButtonReimprimirViaLoja = new javax.swing.JRadioButton();
        RadioButtonReimprimirViaCliente = new javax.swing.JRadioButton();
        ExecutarReimpressao = new javax.swing.JButton();
        Debito = new javax.swing.JPanel();
        PagamentoDebito = new javax.swing.JButton();
        jTextFieldValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextBoxResultado = new javax.swing.JTextPane();
        RadioButtonInterfaceInvisivel = new javax.swing.JRadioButton();
        RadioButtonInterfaceVisivel = new javax.swing.JRadioButton();
        jLabelModoIntegracao = new javax.swing.JLabel();
        jLabelMultiTef = new javax.swing.JLabel();
        RadioButtonUsarMultiTef = new javax.swing.JRadioButton();
        RadioButtonNaoUsarMultiTef = new javax.swing.JRadioButton();
        LabelQuantidadeDePagamentosMultiTef = new javax.swing.JLabel();
        NumericUpDownQuantidadeDePagamentosMultiTef = new javax.swing.JSpinner();

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBaseMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jTabbedPanelTransacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("Transação Parcelada?");

        jLabelTipoParcelamentoCredito.setText("Tipo de Parcelamento");

        Administrador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha parcelamento", "Administrador", "Lojista", " " }));

        jLabelQuantidadeParcelas.setText("Quantidade de Parcelas");

        NumericUpDownQuantidadeParcelasPagamentoCredito.setValue(2);

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
                    .addGroup(CreditoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(RadioButtonPagamentoCreditoComParcelas)
                        .addGap(18, 18, 18)
                        .addComponent(RadioButtonPagamentoCreditoSemParcelas))
                    .addGroup(CreditoLayout.createSequentialGroup()
                        .addGroup(CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipoParcelamentoCredito)
                            .addComponent(jLabelQuantidadeParcelas))
                        .addGap(18, 18, 18)
                        .addGroup(CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NumericUpDownQuantidadeParcelasPagamentoCredito)
                            .addComponent(Administrador, 0, 141, Short.MAX_VALUE))))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(CreditoLayout.createSequentialGroup()
                .addComponent(ExecutarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CreditoLayout.setVerticalGroup(
            CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RadioButtonPagamentoCreditoComParcelas)
                    .addComponent(RadioButtonPagamentoCreditoSemParcelas))
                .addGap(18, 18, 18)
                .addGroup(CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoParcelamentoCredito)
                    .addComponent(Administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumericUpDownQuantidadeParcelasPagamentoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantidadeParcelas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(ExecutarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPanelTransacoes.addTab("Credito", Credito);

        jLabelSenhaAdm.setText("Senha Administrativa");

        TextBoxSenhaAdministrativaCancelamento.setText("cappta");

        jLabelNControle.setText("Número de Controle");

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
                .addGroup(CancelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExecutarCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CancelamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CancelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSenhaAdm)
                            .addComponent(jLabelNControle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CancelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumericUpDownNumeroControleCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextBoxSenhaAdministrativaCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        CancelamentoLayout.setVerticalGroup(
            CancelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelamentoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(CancelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenhaAdm)
                    .addComponent(TextBoxSenhaAdministrativaCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CancelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumericUpDownNumeroControleCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNControle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(ExecutarCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPanelTransacoes.addTab("Cancelamento", Cancelamento);

        jLabelQparcelas.setText("Quantidade de parcelas");

        NumericUpDownQuantidadeParcelasPagamentoCrediario.setValue(2);

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
                .addContainerGap()
                .addComponent(jLabelQparcelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumericUpDownQuantidadeParcelasPagamentoCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(CrediarioLayout.createSequentialGroup()
                .addComponent(ExecutaPagamentoCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CrediarioLayout.setVerticalGroup(
            CrediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrediarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(CrediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQparcelas)
                    .addComponent(NumericUpDownQuantidadeParcelasPagamentoCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(ExecutaPagamentoCrediario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPanelTransacoes.addTab("Crediário", Crediario);

        ComboBoxTipoInformacaoPinpad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha Opção", "Cpf", "Telefone", "Senha", " " }));

        ButtonSolicitarInformacaoPinpad.setText("Executar Operação");
        ButtonSolicitarInformacaoPinpad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSolicitarInformacaoPinpadActionPerformed(evt);
            }
        });

        jLabelTPinpad.setText("Tipo de entrada Pinpad");

        javax.swing.GroupLayout PinpadLayout = new javax.swing.GroupLayout(Pinpad);
        Pinpad.setLayout(PinpadLayout);
        PinpadLayout.setHorizontalGroup(
            PinpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PinpadLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(ComboBoxTipoInformacaoPinpad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(PinpadLayout.createSequentialGroup()
                .addGroup(PinpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTPinpad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSolicitarInformacaoPinpad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PinpadLayout.setVerticalGroup(
            PinpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PinpadLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabelTPinpad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxTipoInformacaoPinpad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(ButtonSolicitarInformacaoPinpad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPanelTransacoes.addTab("Pinpad", Pinpad);

        reimprimirUltimoCupom.add(RadioButtonReimprimirUltimoCupom);
        RadioButtonReimprimirUltimoCupom.setSelected(true);
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

        jLabelNumeroControle.setText("Número de controle");

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
                    .addGroup(ReimpressãoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelQualVia, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(RadioButtonReimprimirTodasVias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonReimprimirViaLoja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonReimprimirViaCliente))
                    .addGroup(ReimpressãoLayout.createSequentialGroup()
                        .addComponent(Reimprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonReimprimirUltimoCupom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonNaoReimprimirUltimoCupom))
                    .addGroup(ReimpressãoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ExecutarReimpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReimpressãoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNumeroControle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NumericUpDownNumeroControleReimpressaoCupom, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        ReimpressãoLayout.setVerticalGroup(
            ReimpressãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReimpressãoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ReimpressãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reimprimir)
                    .addComponent(RadioButtonNaoReimprimirUltimoCupom)
                    .addComponent(RadioButtonReimprimirUltimoCupom))
                .addGap(6, 6, 6)
                .addGroup(ReimpressãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroControle)
                    .addComponent(NumericUpDownNumeroControleReimpressaoCupom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(ReimpressãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQualVia)
                    .addComponent(RadioButtonReimprimirTodasVias)
                    .addComponent(RadioButtonReimprimirViaLoja)
                    .addComponent(RadioButtonReimprimirViaCliente))
                .addGap(65, 65, 65)
                .addComponent(ExecutarReimpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPanelTransacoes.addTab("Reimpressão", Reimpressão);

        PagamentoDebito.setText("Executar Operação");
        PagamentoDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagamentoDebitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DebitoLayout = new javax.swing.GroupLayout(Debito);
        Debito.setLayout(DebitoLayout);
        DebitoLayout.setHorizontalGroup(
            DebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DebitoLayout.createSequentialGroup()
                .addComponent(PagamentoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        DebitoLayout.setVerticalGroup(
            DebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DebitoLayout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(PagamentoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPanelTransacoes.addTab("Débito", Debito);

        jTextFieldValor.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldValor.setText("                                   100");
        jTextFieldValor.setName(""); // NOI18N

        TextBoxResultado.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(TextBoxResultado);

        modoIntegracao.add(RadioButtonInterfaceInvisivel);
        RadioButtonInterfaceInvisivel.setText("Invisível");
        RadioButtonInterfaceInvisivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonInterfaceInvisivelActionPerformed(evt);
            }
        });

        modoIntegracao.add(RadioButtonInterfaceVisivel);
        RadioButtonInterfaceVisivel.setSelected(true);
        RadioButtonInterfaceVisivel.setText("Visível ");
        RadioButtonInterfaceVisivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonInterfaceVisivelActionPerformed(evt);
            }
        });

        jLabelModoIntegracao.setText("Modo de Integração");

        jLabelMultiTef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMultiTef.setText("Utilizar Muliplus Cartões ?");

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

        LabelQuantidadeDePagamentosMultiTef.setText("Quantidade de Pagamentos");

        NumericUpDownQuantidadeDePagamentosMultiTef.setModel(new javax.swing.SpinnerNumberModel(2, 2, 9, 1));
        NumericUpDownQuantidadeDePagamentosMultiTef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumericUpDownQuantidadeDePagamentosMultiTefMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBaseMenuLayout = new javax.swing.GroupLayout(panelBaseMenu);
        panelBaseMenu.setLayout(panelBaseMenuLayout);
        panelBaseMenuLayout.setHorizontalGroup(
            panelBaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBaseMenuLayout.createSequentialGroup()
                        .addComponent(jTabbedPanelTransacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
                    .addGroup(panelBaseMenuLayout.createSequentialGroup()
                        .addComponent(jLabelMultiTef)
                        .addGap(18, 18, 18)
                        .addGroup(panelBaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBaseMenuLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabelModoIntegracao)
                                .addGap(18, 18, 18)
                                .addComponent(RadioButtonInterfaceInvisivel)
                                .addGap(18, 18, 18)
                                .addComponent(RadioButtonInterfaceVisivel))
                            .addGroup(panelBaseMenuLayout.createSequentialGroup()
                                .addComponent(RadioButtonUsarMultiTef)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButtonNaoUsarMultiTef)
                                .addGap(18, 18, 18)
                                .addComponent(LabelQuantidadeDePagamentosMultiTef)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NumericUpDownQuantidadeDePagamentosMultiTef, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBaseMenuLayout.setVerticalGroup(
            panelBaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBaseMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMultiTef, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioButtonUsarMultiTef)
                    .addComponent(RadioButtonNaoUsarMultiTef)
                    .addComponent(LabelQuantidadeDePagamentosMultiTef)
                    .addComponent(NumericUpDownQuantidadeDePagamentosMultiTef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioButtonInterfaceVisivel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelModoIntegracao)
                        .addComponent(RadioButtonInterfaceInvisivel)))
                .addGroup(panelBaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBaseMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseMenuLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTabbedPanelTransacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(371, 371, 371))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBaseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBaseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AutenticarPDV() {
        
        int resultadoAltenticacao;
        if(pdv == 0) {InvalidarAutenticacao("PDV Invalido: ");}  
        if(cnpj.isEmpty() || cnpj.length()!= 14) {InvalidarAutenticacao("CNPJ Invalido : ");}
        if(chaveAutenticacao.isEmpty() || chaveAutenticacao == null) {InvalidarAutenticacao("Chave de Autenticação Invalida:  ");}
        
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

    private void InvalidarAutenticacao(String Error)
    {        
       JOptionPane.showMessageDialog(rootPane , Error + resultadoAltenticacao );
       Runtime.getRuntime().exit(0);
    }
    private void ConfigurarModoIntegracao(boolean exibir)
    {       
        IConfiguracoes configs = ClassFactory.createConfiguracoes();
        configs.exibirInterface(exibir);
        cappta.configurar(configs);
    }
    
    private void RadioButtonUsarMultiTefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonUsarMultiTefActionPerformed
       
        if (RadioButtonUsarMultiTef.isSelected() == false) {return; }
                  
        LabelQuantidadeDePagamentosMultiTef.setVisible(true);
        NumericUpDownQuantidadeDePagamentosMultiTef.setVisible(true);
    }//GEN-LAST:event_RadioButtonUsarMultiTefActionPerformed

    private void RadioButtonNaoUsarMultiTefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNaoUsarMultiTefActionPerformed
       
        if (RadioButtonNaoUsarMultiTef.isSelected() == false) {return;  }           
 
        sessaoMultiTefEmAndamento = false;
        LabelQuantidadeDePagamentosMultiTef.setVisible(false);
        NumericUpDownQuantidadeDePagamentosMultiTef.setVisible(false);
    }//GEN-LAST:event_RadioButtonNaoUsarMultiTefActionPerformed

    private void NumericUpDownQuantidadeDePagamentosMultiTefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumericUpDownQuantidadeDePagamentosMultiTefMouseClicked
        this.quantidadeCartoes = (int) this.NumericUpDownQuantidadeDePagamentosMultiTef.getValue();
    }//GEN-LAST:event_NumericUpDownQuantidadeDePagamentosMultiTefMouseClicked

    private void RadioButtonInterfaceVisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonInterfaceVisivelActionPerformed
        ConfigurarModoIntegracao(true);
    }//GEN-LAST:event_RadioButtonInterfaceVisivelActionPerformed

    private void RadioButtonInterfaceInvisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonInterfaceInvisivelActionPerformed
        ConfigurarModoIntegracao(false);
    }//GEN-LAST:event_RadioButtonInterfaceInvisivelActionPerformed

    private void PagamentoDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagamentoDebitoActionPerformed

        if (this.DeveIniciarMultiCartoes()) {this.IniciarMulticartoes();  }

        double valor = Double.parseDouble(jTextFieldValor.getText());

        if (valor <= 0) { CriarMensagemErroJanela("Por favor preencha com o valor");
            return;
        }

        cappta.pagamentoDebito(valor);
        processandoPagamento = true;
        IterarOperacaoTef();
    }//GEN-LAST:event_PagamentoDebitoActionPerformed

    private void RadioButtonReimprimirViaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonReimprimirViaClienteActionPerformed
        tipoVia = TIPO_VIA_CLIENTE;
    }//GEN-LAST:event_RadioButtonReimprimirViaClienteActionPerformed

    private void RadioButtonReimprimirViaLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonReimprimirViaLojaActionPerformed

        tipoVia = TIPO_VIA_LOJA;
    }//GEN-LAST:event_RadioButtonReimprimirViaLojaActionPerformed

    private void RadioButtonReimprimirTodasViasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonReimprimirTodasViasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonReimprimirTodasViasActionPerformed

    private void RadioButtonReimprimirTodasViasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioButtonReimprimirTodasViasMouseClicked

        tipoVia = TIPO_VIA_TODAS;
    }//GEN-LAST:event_RadioButtonReimprimirTodasViasMouseClicked

    private void ExecutarReimpressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutarReimpressaoActionPerformed
        if (sessaoMultiTefEmAndamento == true) {
            this.CriarMensagemErroJanela("Não é possível cancelar um pagamento com uma sessão multitef em andamento.");
            return;
        }
        if (RadioButtonReimprimirUltimoCupom.isSelected()) {
            cappta.reimprimirUltimoCupom(tipoVia);
        } else {
            cappta.reimprimirCupom(NumericUpDownNumeroControleReimpressaoCupom.getText(), tipoVia);
        }
        processandoPagamento = false;
        IterarOperacaoTef();
    }//GEN-LAST:event_ExecutarReimpressaoActionPerformed

    private void RadioButtonNaoReimprimirUltimoCupomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNaoReimprimirUltimoCupomActionPerformed

        jLabelNumeroControle.setVisible(true);
        NumericUpDownNumeroControleReimpressaoCupom.setVisible(true);
    }//GEN-LAST:event_RadioButtonNaoReimprimirUltimoCupomActionPerformed

    private void RadioButtonReimprimirUltimoCupomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonReimprimirUltimoCupomActionPerformed

        ImprimirUltimaVia();
    }//GEN-LAST:event_RadioButtonReimprimirUltimoCupomActionPerformed

    private void ImprimirUltimaVia()
    {
        NumericUpDownNumeroControleReimpressaoCupom.setVisible(false);
        jLabelNumeroControle.setVisible(false);
    }
    private void ButtonSolicitarInformacaoPinpadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSolicitarInformacaoPinpadActionPerformed

        int tipoDeEntrada = ComboBoxTipoInformacaoPinpad.getSelectedIndex();
        if (tipoDeEntrada == 0) {
            CriarMensagemErroJanela("Porfavor escolha uma opção válida");
            return;
        }

        IRequisicaoInformacaoPinpad iRequisicaoInformacaoPinpad = ClassFactory.createRequisicaoInformacaoPinpad();
        iRequisicaoInformacaoPinpad.tipoInformacaoPinpad(tipoDeEntrada);

        String informacaoPinpad = cappta.solicitarInformacoesPinpad(iRequisicaoInformacaoPinpad);
        AtualizarResultado(informacaoPinpad);
    }//GEN-LAST:event_ButtonSolicitarInformacaoPinpadActionPerformed

    private void ExecutaPagamentoCrediarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutaPagamentoCrediarioActionPerformed

        double valor = Double.parseDouble(jTextFieldValor.getText());
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

    private void RadioButtonPagamentoCreditoSemParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonPagamentoCreditoSemParcelasActionPerformed

        Administrador.setVisible(false);
        jLabelTipoParcelamentoCredito.setVisible(false);
        jLabelQuantidadeParcelas.setVisible(false);
        NumericUpDownQuantidadeParcelasPagamentoCredito.setVisible(processandoPagamento);
    }//GEN-LAST:event_RadioButtonPagamentoCreditoSemParcelasActionPerformed

    private void RadioButtonPagamentoCreditoComParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonPagamentoCreditoComParcelasActionPerformed

        Administrador.setVisible(true);
        jLabelTipoParcelamentoCredito.setVisible(true);
        NumericUpDownQuantidadeParcelasPagamentoCredito.setVisible(true);
        jLabelQuantidadeParcelas.setVisible(true);
    }//GEN-LAST:event_RadioButtonPagamentoCreditoComParcelasActionPerformed

    private void RadioButtonPagamentoCreditoComParcelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioButtonPagamentoCreditoComParcelasMouseClicked

        Administrador.show();
        jLabelTipoParcelamentoCredito.show();
        NumericUpDownQuantidadeParcelasPagamentoCredito.show();
        jLabelQuantidadeParcelas.show();
    }//GEN-LAST:event_RadioButtonPagamentoCreditoComParcelasMouseClicked

    private void ExecutarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutarCreditoActionPerformed

        if (this.DeveIniciarMultiCartoes()) {
            this.IniciarMulticartoes();
        }
        double valor = Double.parseDouble(jTextFieldValor.getText());

        IDetalhesCredito idetalhesCredito = ClassFactory.createDetalhesCredito();
        idetalhesCredito.quantidadeParcelas((int) NumericUpDownQuantidadeParcelasPagamentoCredito.getValue());
        idetalhesCredito.tipoParcelamento(Administrador.getSelectedIndex());
        idetalhesCredito.transacaoParcelada(RadioButtonPagamentoCreditoComParcelas.isSelected());

        int resultado = this.cappta.pagamentoCredito(valor, idetalhesCredito);

        if (resultado != 0) {
            this.CriarMensagemErroPainel(resultado);
            return;
        }

        this.processandoPagamento = true;
        this.IterarOperacaoTef();
    }//GEN-LAST:event_ExecutarCreditoActionPerformed

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
        }
        HabilitarBotoes();
    }

    private void FinalizarPagamento() 
    {
        if (processandoPagamento == false) {return;}
           
        if (sessaoMultiTefEmAndamento) {
            quantidadeCartoes--;
            if (quantidadeCartoes > 0) { return; }   
        }
        
        String mensagem = GerarMensagemTransacaoAprovada();

        this.processandoPagamento = false;
        this.sessaoMultiTefEmAndamento = false;

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, mensagem + "?", "", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            cappta.confirmarPagamentos();

        } else {cappta.desfazerPagamentos();} 
    }
    
    private boolean OperacaoNaoFinalizada(IIteracaoTef iteracaoTef) 
    {
        return iteracaoTef.tipoIteracao() != 1 && iteracaoTef.tipoIteracao() != 2;
    }
    
    private void RequisitarParametros(IRequisicaoParametro requisicaoParametros)
    {
        String mensagem = Input(requisicaoParametros.mensagem());
        int resultado;
        int parametro;
              
        if ( mensagem == null || mensagem.isEmpty())
        {parametro = 2; mensagem = "";}
        else
        {parametro = 1;}
        
        resultado = cappta.enviarParametro(mensagem, parametro);
               
    }
    
    private void ResolverTransacaoPendente(IRespostaTransacaoPendente irespostaTransacaoPendente)
    {
        int acao = 1;
        String parametro = "";
        String msg = irespostaTransacaoPendente.mensagem();
        
        parametro = Input(msg);
        if (parametro.length() == 0) { acao = 2;}   
        else{ acao = 1; }
           
        cappta.enviarParametro(parametro, acao);
    }
   
    private void ExibirDadosOperacaoRecusada(IRespostaOperacaoRecusada resposta)
    {
        AtualizarResultado(resposta.motivo());
    }
    
    private void AtualizarResultado(String mensagem)
    {
        TextBoxResultado.setText(mensagem);
    }
    @SuppressWarnings("empty-statement")
    
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
    
    private void CriarMensagemErroPainel(int resultado) 
    {
        JOptionPane.showMessageDialog(rootPane, resultado);
    }
   
    private String GerarMensagemTransacaoAprovada()
    {
        String mensagem = String.format(" Sim para confirmar e Não para Cancelar",
                (this.sessaoMultiTefEmAndamento ? "ões" : "ão"),
                (this.sessaoMultiTefEmAndamento ? "s" : ""),
                Environment.class);
        return mensagem;
    }

    private void CriarMensagemErroJanela(String mensagem)
    {
        JOptionPane.showMessageDialog(rootPane, mensagem);
    }

    private void HabilitarControlesMultiTef()
    {
        this.HabilitarControle(RadioButtonUsarMultiTef);
        this.HabilitarControle(RadioButtonNaoUsarMultiTef);
        this.HabilitarControle(NumericUpDownQuantidadeDePagamentosMultiTef);
    }

    private void HabilitarBotoes()
    {
        HabilitarControle(PagamentoDebito);
        HabilitarControle(ExecutarCredito);
        HabilitarControle(ExecutarCancelamento);
        HabilitarControle(ExecutarReimpressao);
    }

    private void HabilitarControle(Component componente)
    {
        componente.setEnabled(true);
    }

    private boolean DeveIniciarMultiCartoes() 
    {
        return this.sessaoMultiTefEmAndamento == false && this.RadioButtonUsarMultiTef.isSelected();
    }

    private void IniciarMulticartoes()
    {
        this.quantidadeCartoes = (int) this.NumericUpDownQuantidadeDePagamentosMultiTef.getValue();
        this.sessaoMultiTefEmAndamento = true;
        cappta.iniciarMultiCartoes(this.quantidadeCartoes);
    }

    private void DesabilitarControlesMultiTef() 
    {
        DesabilitarControle(RadioButtonUsarMultiTef);
        DesabilitarControle(RadioButtonNaoUsarMultiTef);
        DesabilitarControle(NumericUpDownQuantidadeDePagamentosMultiTef);
    }

    private void DesabilitarBotoes()
    {
        DesabilitarControle(PagamentoDebito);       
        DesabilitarControle(ExecutarCredito);
        DesabilitarControle(ExecutarCancelamento);
        DesabilitarControle(ExecutarReimpressao);
    }

    private void DesabilitarControle(Component componente) 
    {
        componente.setEnabled(false);
    }
      
    private String Input(String msg) 
    {
        return JOptionPane.showInputDialog(null, msg);
    }

    protected void ExibirMensagem(IMensagem mensagem) {
        JOptionPane opt = new JOptionPane(mensagem.descricao(), JOptionPane.WARNING_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}); // no buttons
        final JDialog dlg = opt.createDialog("Retorno");
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                    dlg.dispose();

                } catch (Throwable th) {
                }
            }
        }).start();
        dlg.setVisible(true);
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
    private javax.swing.JButton PagamentoDebito;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelModoIntegracao;
    private javax.swing.JLabel jLabelMultiTef;
    private javax.swing.JLabel jLabelNControle;
    private javax.swing.JLabel jLabelNumeroControle;
    private javax.swing.JLabel jLabelQparcelas;
    private javax.swing.JLabel jLabelQualVia;
    private javax.swing.JLabel jLabelQuantidadeParcelas;
    private javax.swing.JLabel jLabelSenhaAdm;
    private javax.swing.JLabel jLabelTPinpad;
    private javax.swing.JLabel jLabelTipoParcelamentoCredito;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPanelTransacoes;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.ButtonGroup modoIntegracao;
    private javax.swing.ButtonGroup multplusCartoes;
    private javax.swing.JPanel panelBaseMenu;
    private javax.swing.ButtonGroup qualVia;
    private javax.swing.ButtonGroup reimprimirUltimoCupom;
    // End of variables declaration//GEN-END:variables

}
