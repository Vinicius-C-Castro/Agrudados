package Telas;

import model.ElementosModel;
import model.elementos;
import calculos.MedidaTendenciaCentral;

public class medidasdetendenciacentralSimpes extends javax.swing.JInternalFrame {

    ElementosModel modeloTabela = new ElementosModel();

    /**
     * Creates new form medidasdetendenciacentralSimpes
     */
    public medidasdetendenciacentralSimpes() {

        initComponents();
        tabela.setModel(modeloTabela);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        caixaDeTexto = new javax.swing.JTextField();
        botaoEnviar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        resultModa = new javax.swing.JLabel();
        resultMedia = new javax.swing.JLabel();
        resultMediana = new javax.swing.JLabel();
        resultDM = new javax.swing.JLabel();
        resultDP = new javax.swing.JLabel();
        resultVar = new javax.swing.JLabel();
        conjuntoPopulacional = new javax.swing.JRadioButton();
        conjuntoAmostral = new javax.swing.JRadioButton();

        jLabel8.setText("jLabel7");

        setBorder(new javax.swing.border.MatteBorder(null));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Media Simples");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/table.png"))); // NOI18N

        caixaDeTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaDeTextoActionPerformed(evt);
            }
        });
        caixaDeTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caixaDeTextoKeyPressed(evt);
            }
        });

        botaoEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/database_go.png"))); // NOI18N
        botaoEnviar.setText("Enviar");
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/database_delete.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/database_edit.png"))); // NOI18N
        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/calculator.png"))); // NOI18N
        botaoCalcular.setText("Calcular");
        botaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Conjunto X="
            }
        ));
        jScrollPane1.setViewportView(tabela);
        tabela.getAccessibleContext().setAccessibleName("");

        jLabel1.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel1.setText("Média: ");

        jLabel2.setText("Moda: ");

        jLabel3.setText("Mediana: ");

        jLabel4.setText("Desvio Medio: ");

        jLabel5.setText("Variancia: ");

        jLabel6.setText("Desvio Padrão: ");

        jLabel20.setText("Elementos do conjunto ( X )");

        resultModa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultModa.setName("resultModa"); // NOI18N

        resultMedia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultMedia.setName("resultMedia"); // NOI18N

        resultMediana.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultMediana.setName("resultMediana"); // NOI18N

        resultDM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultDM.setName("resultDM"); // NOI18N

        resultDP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultDP.setName("resultDP"); // NOI18N

        resultVar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultVar.setName("resultVar"); // NOI18N

        conjuntoPopulacional.setText("Conjunto Populacional");
        conjuntoPopulacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuntoPopulacionalActionPerformed(evt);
            }
        });

        conjuntoAmostral.setSelected(true);
        conjuntoAmostral.setText("Conjunto Amostral");
        conjuntoAmostral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuntoAmostralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botaoEnviar)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoExcluir))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resultModa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resultMediana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resultDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resultDP, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resultVar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(conjuntoPopulacional)
                                            .addComponent(conjuntoAmostral)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resultMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(caixaDeTexto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCalcular)
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaDeTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCalcular))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEnviar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoAlterar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(resultMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(resultModa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(resultMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(resultDM, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(resultVar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(resultDP, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(conjuntoAmostral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conjuntoPopulacional)
                        .addGap(20, 20, 20))))
        );

        resultModa.getAccessibleContext().setAccessibleName("resultModa");
        resultMedia.getAccessibleContext().setAccessibleName("resultMedia");
        resultMediana.getAccessibleContext().setAccessibleName("resultMediana");
        resultDM.getAccessibleContext().setAccessibleName("resultDM");
        resultDP.getAccessibleContext().setAccessibleName("resultDP");
        resultVar.getAccessibleContext().setAccessibleName("resultVar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed

        int tamTabela = tabela.getRowCount();
        double valor[] = new double[tamTabela];

        for (int i = 0; i < tamTabela; i++) {
            valor[i] = Double.parseDouble(tabela.getValueAt(i, 0).toString());

        }

        MedidaTendenciaCentral medidas = new MedidaTendenciaCentral();

        medidas.setConjuntoAmostral(conjuntoAmostral.isSelected());

        medidas.realizarCalculos(valor);

        resultMedia.setText(String.valueOf(medidas.getMedia()));

        if (medidas.getIndiceModa() >= 0) {
            resultModa.setText(String.valueOf(medidas.getModa()));
        } else if (medidas.getIndiceModa() == -1) {
            resultModa.setText("Amodal");
        } else if (medidas.getIndiceModa() == -2) {
            resultModa.setText("Bimodal");
        } else {
            resultModa.setText("Multimodal");
        }

        resultMediana.setText(String.valueOf(medidas.getMediana()));

        resultVar.setText(String.valueOf(medidas.getVariancia()));

        resultDP.setText(String.valueOf(medidas.getDesvioPadrao()));
        
        resultDM.setText(String.valueOf(medidas.getDesvioMedio()));


    }//GEN-LAST:event_botaoCalcularActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed

        if (tabela.getSelectedRow() != -1) {

            modeloTabela.setValueAt(caixaDeTexto.getText(), tabela.getSelectedRow(), 0);

        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed

        if (tabela.getSelectedRow() != -1) {

            modeloTabela.removeRow(tabela.getSelectedRow());
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed

        elementos e = new elementos();
        e.setNumeros(Double.parseDouble(caixaDeTexto.getText()));
        modeloTabela.addrow(e);
        caixaDeTexto.setText("");
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void caixaDeTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaDeTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaDeTextoActionPerformed

    private void conjuntoPopulacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoPopulacionalActionPerformed
        conjuntoAmostral.setSelected(false);
    }//GEN-LAST:event_conjuntoPopulacionalActionPerformed

    private void conjuntoAmostralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoAmostralActionPerformed
        conjuntoPopulacional.setSelected(false);
    }//GEN-LAST:event_conjuntoAmostralActionPerformed

    private void caixaDeTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaDeTextoKeyPressed

        if (evt.getKeyCode() == 10) {
            elementos e = new elementos();
            e.setNumeros(Double.parseDouble(caixaDeTexto.getText()));
            modeloTabela.addrow(e);
            caixaDeTexto.setText("");
        }
    }//GEN-LAST:event_caixaDeTextoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField caixaDeTexto;
    private javax.swing.JRadioButton conjuntoAmostral;
    private javax.swing.JRadioButton conjuntoPopulacional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel resultDM;
    private javax.swing.JLabel resultDP;
    private javax.swing.JLabel resultMedia;
    private javax.swing.JLabel resultMediana;
    private javax.swing.JLabel resultModa;
    private javax.swing.JLabel resultVar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
