package agrudados;

import estatistica.Calculos;
import estatistica.Central;
import estatistica.DistribuicaoDeFrequencias;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.ElementosModel;
import model.elementos;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Willian
 */
public class Tela_DistribuicaoDeFrequencias extends javax.swing.JInternalFrame {

    String[] colunas = {"Elementos"};
    ElementosModel modeloTabela = new ElementosModel(colunas);
    DefaultTableModel modelDefault = new DefaultTableModel();

    /**
     * Creates new form AnalisedeGrandesConjntosdeDados
     */
    public Tela_DistribuicaoDeFrequencias() {

        initComponents();
        tabelaElementos.setModel(modeloTabela);
        tabelaDistFreq.setModel(modelDefault);
        tabelaElementos.setRowSorter(new TableRowSorter(modeloTabela));
        modelDefault.addColumn("  Classes  ");
        modelDefault.addColumn("Frequência");
        modelDefault.addColumn("Freq. Acumulada");
        modelDefault.addColumn("Freq. Absoluta");
        modelDefault.addColumn("Freq. Abs. Acu.");

    }

    private void carregarIconeAplicacao(JFrame tela, ImageIcon img) {
        tela.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDialog1 = new javax.swing.JDialog();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDistFreq = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaElementos = new javax.swing.JTable();
        panelElementosConjunto = new javax.swing.JPanel();
        botaoAlterarDist = new javax.swing.JButton();
        botaoExcluirDist = new javax.swing.JButton();
        botaoCalcularDist = new javax.swing.JButton();
        caixaDeTextoDist = new javax.swing.JTextField();
        botaoEnviarDist = new javax.swing.JButton();
        barraFerramenta = new javax.swing.JToolBar();
        btnHistograma = new javax.swing.JButton();
        btnPareto = new javax.swing.JButton();
        painelGrafico = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("jMenu2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        tabelaDistFreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Classe", "Frequência", "Freq. Acumulada", "fri", "Fri"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDistFreq.setName(""); // NOI18N
        tabelaDistFreq.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaDistFreq);

        tabelaElementos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Elementos Digitados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaElementos);

        panelElementosConjunto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elementos do conjunto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        botaoAlterarDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_edit.png"))); // NOI18N
        botaoAlterarDist.setText("Alterar");
        botaoAlterarDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarDistActionPerformed(evt);
            }
        });

        botaoExcluirDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_delete.png"))); // NOI18N
        botaoExcluirDist.setText("Excluir");
        botaoExcluirDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirDistActionPerformed(evt);
            }
        });

        botaoCalcularDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table.png"))); // NOI18N
        botaoCalcularDist.setText("Tabela");
        botaoCalcularDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularDistActionPerformed(evt);
            }
        });

        caixaDeTextoDist.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaDeTextoDist.setOpaque(false);
        caixaDeTextoDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaDeTextoDistActionPerformed(evt);
            }
        });
        caixaDeTextoDist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caixaDeTextoDistKeyPressed(evt);
            }
        });

        botaoEnviarDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_go.png"))); // NOI18N
        botaoEnviarDist.setText("Enviar");
        botaoEnviarDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarDistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelElementosConjuntoLayout = new javax.swing.GroupLayout(panelElementosConjunto);
        panelElementosConjunto.setLayout(panelElementosConjuntoLayout);
        panelElementosConjuntoLayout.setHorizontalGroup(
            panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                        .addComponent(botaoCalcularDist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExcluirDist))
                    .addComponent(caixaDeTextoDist))
                .addGap(18, 18, 18)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoAlterarDist, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(botaoEnviarDist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelElementosConjuntoLayout.setVerticalGroup(
            panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixaDeTextoDist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEnviarDist))
                .addGap(18, 18, 18)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluirDist)
                    .addComponent(botaoAlterarDist)
                    .addComponent(botaoCalcularDist))
                .addContainerGap())
        );

        barraFerramenta.setRollover(true);

        btnHistograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chart_bar.png"))); // NOI18N
        btnHistograma.setText("Histograma");
        btnHistograma.setFocusable(false);
        btnHistograma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistograma.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistogramaActionPerformed(evt);
            }
        });
        barraFerramenta.add(btnHistograma);

        btnPareto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chart_curve.png"))); // NOI18N
        btnPareto.setText("Ogiva");
        btnPareto.setFocusable(false);
        btnPareto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPareto.setMaximumSize(new java.awt.Dimension(78, 48));
        btnPareto.setMinimumSize(new java.awt.Dimension(78, 48));
        btnPareto.setPreferredSize(new java.awt.Dimension(78, 48));
        btnPareto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPareto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParetoActionPerformed(evt);
            }
        });
        barraFerramenta.add(btnPareto);

        painelGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gráfico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout painelGraficoLayout = new javax.swing.GroupLayout(painelGrafico);
        painelGrafico.setLayout(painelGraficoLayout);
        painelGraficoLayout.setHorizontalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelGraficoLayout.setVerticalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelElementosConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 363, Short.MAX_VALUE))
                    .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelElementosConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getAccessibleContext().setAccessibleName("telaDadosAgrupados");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistogramaActionPerformed

        painelGrafico.removeAll();
        JInternalFrame frame = new JInternalFrame("Histograma");
        frame.setResizable(false);
        ((BasicInternalFrameUI) frame.getUI()).setNorthPane(null); //retirar o painel superior janela.setBorder(null);
        frame.setBorder(null);
        painelGrafico.add(frame);

        JPanel raiz = new JPanel();
        raiz.setLayout(new BorderLayout());
        Dimension tamanho = new Dimension(590, 447);
        raiz.setPreferredSize(tamanho);
        raiz.setMinimumSize(tamanho);
        frame.add(raiz);
        frame.pack();

        frame.setLocation(7, 20);

        // Cria o painel aonde o gráfico será mostrado.
        JPanel primeiroGrafico = new JPanel();
        Dimension tamanhoArea = new Dimension(590, 447);
        primeiroGrafico.setPreferredSize(tamanhoArea);
        primeiroGrafico.setMinimumSize(tamanhoArea);
        raiz.add(primeiroGrafico, BorderLayout.CENTER);
        Calculos calc = new Calculos();

        int tamTabela = tabelaElementos.getRowCount();
        double value[] = new double[tamTabela];

        for (int i = 0; i < tamTabela; i++) {
            value[i] = Double.parseDouble(tabelaElementos.getValueAt(i, 0).toString());
        }
        Arrays.sort(value);
        calc.iserirDados(value, false);

        int number = calc.getNumClasses();
        HistogramDataset dataset = new HistogramDataset();

        dataset.setType(HistogramType.FREQUENCY);
        dataset.addSeries("", value, number);
        String plotTitle = "Histograma";
        String xaxis = "Dados";
        String yaxis = "Freqência";
        PlotOrientation orientation = PlotOrientation.VERTICAL;

        boolean show = false;
        boolean toolTips = false;
        boolean urls = false;
        int tamX = 590;
        int tamY = 447;
        JFreeChart chart = ChartFactory.createHistogram(plotTitle, xaxis, yaxis,
                dataset, orientation, show, toolTips, urls);
        chart.setBackgroundPaint(Color.white);

        ChartPanel chartPanel = new ChartPanel(chart, tamX, tamY, tamX, tamY, tamX, tamY, urls, toolTips, show, urls, show, true);
        primeiroGrafico.add(chartPanel);
        primeiroGrafico.validate();

        frame.setVisible(true);
    }//GEN-LAST:event_btnHistogramaActionPerformed

    private void botaoAlterarDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarDistActionPerformed

        if (tabelaElementos.getSelectedRow() != -1) {

            modeloTabela.setValueAt(caixaDeTextoDist.getText(), tabelaElementos.getSelectedRow(), 0);

        }
    }//GEN-LAST:event_botaoAlterarDistActionPerformed

    private void botaoExcluirDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirDistActionPerformed

        if (tabelaElementos.getSelectedRow() != -1) {

            modeloTabela.removeRow(tabelaElementos.getSelectedRow());
        }
    }//GEN-LAST:event_botaoExcluirDistActionPerformed

    private void botaoCalcularDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularDistActionPerformed

        int tamTabela = tabelaElementos.getRowCount();
        Object[] novaLinha = {"", "", "", "", ""};
        double intervalo;
        double qtdeClasse;
        double menorValor;

        double valor[] = new double[tamTabela];
        for (int i = 0; i < tamTabela; i++) {
            valor[i] = Double.parseDouble(tabelaElementos.getValueAt(i, 0).toString());
        }
        Arrays.sort(valor);

        Calculos CalculosEstat = new Central();
        CalculosEstat.iserirDados(valor, false);
        qtdeClasse = CalculosEstat.getNumClasses();
        menorValor = DistribuicaoDeFrequencias.truncate(valor[0]);
        intervalo = CalculosEstat.getIntervalo();

        for (int i = 0; i < qtdeClasse; i++) {
            novaLinha[0] = "" + menorValor + " |--- " + (menorValor + intervalo);
            menorValor += intervalo;

            novaLinha[1] = (int) CalculosEstat.getFrequencias()[i];

            novaLinha[2] = (int) CalculosEstat.getFrequenciasAcumuladas()[i];

            novaLinha[3] = DistribuicaoDeFrequencias.truncate(CalculosEstat.getFrequenciaAbsoluta()[i]);

            novaLinha[4] = DistribuicaoDeFrequencias.truncate(CalculosEstat.getFrequenciaAbsolutaAcumulada()[i]);
            modelDefault.addRow(novaLinha);
        }


    }//GEN-LAST:event_botaoCalcularDistActionPerformed

    private void caixaDeTextoDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaDeTextoDistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaDeTextoDistActionPerformed

    private void caixaDeTextoDistKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaDeTextoDistKeyPressed

        if (evt.getKeyCode() == 10) {
            elementos e = new elementos();
            e.setNumeros(Double.parseDouble(caixaDeTextoDist.getText()));
            modeloTabela.addrow(e);
            caixaDeTextoDist.setText("");
        }
    }//GEN-LAST:event_caixaDeTextoDistKeyPressed

    private void botaoEnviarDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarDistActionPerformed

        elementos e = new elementos();
        e.setNumeros(Double.parseDouble(caixaDeTextoDist.getText()));
        modeloTabela.addrow(e);
        caixaDeTextoDist.setText("");
    }//GEN-LAST:event_botaoEnviarDistActionPerformed

    private void btnParetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParetoActionPerformed
        // TODO add your handling code here:
        painelGrafico.removeAll();
        Calculos calc = new Calculos();

        JInternalFrame frame = new JInternalFrame("Histograma");
        frame.setResizable(false);
        ((BasicInternalFrameUI) frame.getUI()).setNorthPane(null); //retirar o painel superior janela.setBorder(null);
        frame.setBorder(null);
        painelGrafico.add(frame);

        JPanel raiz = new JPanel();
        raiz.setLayout(new BorderLayout());
        Dimension tamanho = new Dimension(590, 447);
        raiz.setPreferredSize(tamanho);
        raiz.setMinimumSize(tamanho);
        frame.add(raiz);
        frame.pack();

        frame.setLocation(7, 20);

        // Cria o painel aonde o gráfico será mostrado.
        JPanel primeiroGrafico = new JPanel();
        Dimension tamanhoArea = new Dimension(590, 447);
        primeiroGrafico.setPreferredSize(tamanhoArea);
        primeiroGrafico.setMinimumSize(tamanhoArea);
        raiz.add(primeiroGrafico, BorderLayout.CENTER);

        int tamTabela = tabelaElementos.getRowCount();
        double value[] = new double[tamTabela];

        for (int i = 0; i < tamTabela; i++) {
            value[i] = Double.parseDouble(tabelaElementos.getValueAt(i, 0).toString());
        }
        Arrays.sort(value);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        calc.iserirDados(value, false);
        double menorValor = value[0];
        double intervalo = calc.getIntervalo();
        int numClasses = calc.getNumClasses();

        for (int i = 0; i < numClasses; i++) {
            String text = "" + menorValor + " |---- " + (menorValor + intervalo);
            dataset.addValue(calc.getFrequenciaAbsolutaAcumulada()[i], "", text);
            menorValor += intervalo + 1;
        }
        String plotTitle = "Ogiva";
        String xaxis = "Classes";
        String yaxis = "Frequências";
        PlotOrientation orientation = PlotOrientation.VERTICAL;
        boolean show = false;
        boolean toolTips = false;
        boolean urls = false;
        int tamX = 590;
        int tamY = 447;

        JFreeChart lineChart = ChartFactory.createLineChart(plotTitle, xaxis, yaxis, dataset, orientation, urls, toolTips, urls);
        ChartPanel chartPanel = new ChartPanel(lineChart, tamX, tamY, tamX, tamY, tamX, tamY, urls, toolTips, show, urls, show, true);
        primeiroGrafico.add(chartPanel);
        primeiroGrafico.validate();

        frame.setVisible(true);
    }//GEN-LAST:event_btnParetoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraFerramenta;
    private javax.swing.JButton botaoAlterarDist;
    private javax.swing.JButton botaoCalcularDist;
    private javax.swing.JButton botaoEnviarDist;
    private javax.swing.JButton botaoExcluirDist;
    private javax.swing.JButton btnHistograma;
    private javax.swing.JButton btnPareto;
    private javax.swing.JTextField caixaDeTextoDist;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JPanel painelGrafico;
    private javax.swing.JPanel panelElementosConjunto;
    private javax.swing.JTable tabelaDistFreq;
    private javax.swing.JTable tabelaElementos;
    // End of variables declaration//GEN-END:variables
}
