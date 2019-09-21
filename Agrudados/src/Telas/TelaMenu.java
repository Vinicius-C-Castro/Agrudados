package Telas;

import java.awt.Color;
import javax.swing.ImageIcon;

public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
       this.carregarIconeAplicacao();
       this.setExtendedState(MAXIMIZED_BOTH);
       this.setUndecorated(true);
       initComponents();

    }
    private void carregarIconeAplicacao(){
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(getClass().getResource("/imagens/agrudadosIco.png"));
        this.setIconImage(imageIcon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        telaFundo = new javax.swing.JPanel();
        labelImagemFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.layout.GroupLayout jDesktopPane1Layout = new org.jdesktop.layout.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jDesktopPane2Layout = new org.jdesktop.layout.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agrudados");
        setFocusCycleRoot(false);
        setFocusable(false);

        telaFundo.setBackground(new java.awt.Color(51, 51, 51));
        telaFundo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaInicialfinal.jpg"))); // NOI18N

        org.jdesktop.layout.GroupLayout telaFundoLayout = new org.jdesktop.layout.GroupLayout(telaFundo);
        telaFundo.setLayout(telaFundoLayout);
        telaFundoLayout.setHorizontalGroup(
            telaFundoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(telaFundoLayout.createSequentialGroup()
                .add(labelImagemFundo)
                .add(0, 0, Short.MAX_VALUE))
        );
        telaFundoLayout.setVerticalGroup(
            telaFundoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(telaFundoLayout.createSequentialGroup()
                .add(labelImagemFundo)
                .add(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setForeground(new java.awt.Color(222, 52, 52));
        jMenuBar1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(2, 4));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(507, 35));

        jMenu1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/sum.png"))); // NOI18N
        jMenu1.setText("   Médias");
        jMenu1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu1.setPreferredSize(new java.awt.Dimension(100, 50));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/font.png"))); // NOI18N
        jMenuItem2.setText("Simples");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/text_letter_omega.png"))); // NOI18N
        jMenuItem1.setText("Ponderada");
        jMenuItem1.setInheritsPopupMenu(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/application_view_tile.png"))); // NOI18N
        jMenu2.setText("Gráficos e Tabelas");
        jMenu2.setFocusCycleRoot(true);
        jMenu2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(157, 19));

        jMenuItem3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/chart_bar.png"))); // NOI18N
        jMenuItem3.setText("Analise de dados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/information.png"))); // NOI18N
        jMenu3.setText("Sobre");
        jMenu3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/rosette.png"))); // NOI18N
        jMenuItem4.setText("Historia");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(telaFundo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(telaFundo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         medidasdetendenciacentralSimpes tela = new medidasdetendenciacentralSimpes(); 
         labelImagemFundo.add(tela);        
         tela.setVisible(true);   
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         medidasdetendenciacentralPonderada tela2 = new medidasdetendenciacentralPonderada();
         labelImagemFundo.add(tela2);
         tela2.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        AnalisedeGrandesConjntosdeDados tela4 = new AnalisedeGrandesConjntosdeDados();
        labelImagemFundo.add(tela4);
        tela4.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Historia tela3 = new Historia();
        labelImagemFundo.add(tela3);
        tela3.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel labelImagemFundo;
    private javax.swing.JPanel telaFundo;
    // End of variables declaration//GEN-END:variables
}