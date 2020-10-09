/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.app;

import br.com.rogerio.dal.RelatorioDalOrdenadoPorNome;
import br.com.rogerio.dal.RelatorioDal;
import br.com.rogerio.dal.RelatorioDalOrdenacaoEnfaseCursoNome;
import br.com.rogerio.dal.RelatorioDalOrdenacaoPorCursoEnfaseNome;
import br.com.rogerio.dal.RelatorioDalOrdenacaoPorCursoEnome;
import br.com.rogerio.dal.RelatorioDalOrdenacaoPorSituacaoCursoNome;
import br.com.rogerio.dal.RelatorioDalOrdenacaoPorSituacaoEnome;
import br.com.rogerio.dal.RelatorioDalOrdenadoPorCurso;
import br.com.rogerio.dal.RelatorioDalOrdenadoPorEnfase;
import br.com.rogerio.dal.RelatorioDalOrdenadoPorSituacao;
import br.com.rogerio.modelo.Relatorio;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author roger
 */
public class RelatorioView extends javax.swing.JFrame {

    String nomeDoArquivo;
    RelatorioDal dalNome;
    RelatorioDal dalCurso;
    RelatorioDal dalEnfase;
    RelatorioDal dalSituacao;
    RelatorioDal dalCursoEnome;
    RelatorioDal dalSituacaoEnome;
    RelatorioDal dalSituacaoCursoNome;
    RelatorioDal dalEnfaseCursoNome;
    RelatorioDal dalCursoEnfaseNome;

    /**
     * Creates new form RelatorioView
     */
    public RelatorioView() {
        try {
            initComponents();

            // Este comando abaixo cria o evento ao pressionar enter por padrão
            //jPanelRelatorio.getRootPane().setDefaultButton(jButtonOrdenarPorNome);
            nomeDoArquivo = "C:\\Users\\roger\\Documents\\NetBeansProjects\\Projeto_Template_RelatorioDasEnfases\\src\\br\\com\\rogerio\\dados\\relatorio.csv";
            dalNome = new RelatorioDalOrdenadoPorNome(nomeDoArquivo);
            dalCurso = new RelatorioDalOrdenadoPorCurso(nomeDoArquivo);
            dalEnfase = new RelatorioDalOrdenadoPorEnfase(nomeDoArquivo);
            dalSituacao = new RelatorioDalOrdenadoPorSituacao(nomeDoArquivo);
            dalCursoEnome = new RelatorioDalOrdenacaoPorCursoEnome(nomeDoArquivo);
            dalSituacaoEnome = new RelatorioDalOrdenacaoPorSituacaoEnome(nomeDoArquivo);
            dalSituacaoCursoNome = new RelatorioDalOrdenacaoPorSituacaoCursoNome(nomeDoArquivo);
            dalEnfaseCursoNome = new RelatorioDalOrdenacaoEnfaseCursoNome(nomeDoArquivo);
            dalCursoEnfaseNome = new RelatorioDalOrdenacaoPorCursoEnfaseNome(nomeDoArquivo);

        } catch (Exception ex) {
            Logger.getLogger(RelatorioView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void imprimirRelatorioOrdenado(ArrayList<Relatorio> lista) {
        DefaultTableModel model = (DefaultTableModel) jTableRelatorioEnfase.getModel();
        model.setNumRows(0);
        int pos = 0;
        while (pos < lista.size()) {
            String[] linha = new String[4];
            Relatorio aux = lista.get(pos);
            linha[0] = aux.getNome().toUpperCase();
            linha[1] = aux.getCurso();
            linha[2] = aux.getSituacao();
            linha[3] = aux.getEnfase().toUpperCase();
            model.addRow(linha);
            pos++;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRelatorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonOrdenarPorNome = new javax.swing.JButton();
        jButtonOrdenarPorCurso = new javax.swing.JButton();
        jButtonOrdenarPorEnfase = new javax.swing.JButton();
        jButtonOrdenadoPorSituacao = new javax.swing.JButton();
        jButtonOrdenadoCursoEnome = new javax.swing.JButton();
        jButtonSituacaoNome = new javax.swing.JButton();
        jButtonSituacaoCursoNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorioEnfase = new javax.swing.JTable();
        jButtonEnfaseCursoNome = new javax.swing.JButton();
        jButtonCursoEnfaseNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatório da Ênfases");
        setResizable(false);

        jLabel1.setText("Ordenar por:");

        jButtonOrdenarPorNome.setText("Nome");
        jButtonOrdenarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorNomeActionPerformed(evt);
            }
        });
        jButtonOrdenarPorNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonOrdenarPorNomeKeyPressed(evt);
            }
        });

        jButtonOrdenarPorCurso.setText("Curso");
        jButtonOrdenarPorCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorCursoActionPerformed(evt);
            }
        });
        jButtonOrdenarPorCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonOrdenarPorCursoKeyPressed(evt);
            }
        });

        jButtonOrdenarPorEnfase.setText("Ênfase");
        jButtonOrdenarPorEnfase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorEnfaseActionPerformed(evt);
            }
        });
        jButtonOrdenarPorEnfase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonOrdenarPorEnfaseKeyPressed(evt);
            }
        });

        jButtonOrdenadoPorSituacao.setText("Situação");
        jButtonOrdenadoPorSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenadoPorSituacaoActionPerformed(evt);
            }
        });
        jButtonOrdenadoPorSituacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonOrdenadoPorSituacaoKeyPressed(evt);
            }
        });

        jButtonOrdenadoCursoEnome.setText("Curso e Nome");
        jButtonOrdenadoCursoEnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenadoCursoEnomeActionPerformed(evt);
            }
        });
        jButtonOrdenadoCursoEnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonOrdenadoCursoEnomeKeyPressed(evt);
            }
        });

        jButtonSituacaoNome.setText("Situação de Nome");
        jButtonSituacaoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSituacaoNomeKeyPressed(evt);
            }
        });

        jButtonSituacaoCursoNome.setText("Situacao / Curso / Nome");
        jButtonSituacaoCursoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSituacaoCursoNomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRelatorioLayout = new javax.swing.GroupLayout(jPanelRelatorio);
        jPanelRelatorio.setLayout(jPanelRelatorioLayout);
        jPanelRelatorioLayout.setHorizontalGroup(
            jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOrdenarPorNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOrdenarPorCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOrdenadoPorSituacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOrdenarPorEnfase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOrdenadoCursoEnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSituacaoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSituacaoCursoNome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRelatorioLayout.setVerticalGroup(
            jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRelatorioLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonOrdenarPorNome)
                    .addComponent(jButtonOrdenarPorCurso)
                    .addComponent(jButtonOrdenadoPorSituacao)
                    .addComponent(jButtonOrdenarPorEnfase)
                    .addComponent(jButtonOrdenadoCursoEnome)
                    .addComponent(jButtonSituacaoNome)
                    .addComponent(jButtonSituacaoCursoNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableRelatorioEnfase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Curso", "Situação", "Ênfase"
            }
        ));
        jScrollPane1.setViewportView(jTableRelatorioEnfase);
        if (jTableRelatorioEnfase.getColumnModel().getColumnCount() > 0) {
            jTableRelatorioEnfase.getColumnModel().getColumn(1).setMinWidth(70);
            jTableRelatorioEnfase.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTableRelatorioEnfase.getColumnModel().getColumn(1).setMaxWidth(70);
            jTableRelatorioEnfase.getColumnModel().getColumn(2).setMinWidth(100);
            jTableRelatorioEnfase.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableRelatorioEnfase.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableRelatorioEnfase.getColumnModel().getColumn(3).setMinWidth(100);
            jTableRelatorioEnfase.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableRelatorioEnfase.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jButtonEnfaseCursoNome.setText("Enfase / Curso / Nome");
        jButtonEnfaseCursoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEnfaseCursoNomeKeyPressed(evt);
            }
        });

        jButtonCursoEnfaseNome.setText("Curso / Enfase / Nome");
        jButtonCursoEnfaseNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCursoEnfaseNomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButtonEnfaseCursoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCursoEnfaseNome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnfaseCursoNome)
                    .addComponent(jButtonCursoEnfaseNome))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOrdenarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorNomeActionPerformed
        try {
            imprimirRelatorioOrdenado(dalNome.listarRelatorio());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage() + "\nAtenção !!!");
        }
    }//GEN-LAST:event_jButtonOrdenarPorNomeActionPerformed

    private void jButtonOrdenarPorCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorCursoActionPerformed
        try {
            imprimirRelatorioOrdenado(dalCurso.listarRelatorio());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonOrdenarPorCursoActionPerformed

    private void jButtonOrdenarPorEnfaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorEnfaseActionPerformed
        try {
            imprimirRelatorioOrdenado(dalEnfase.listarRelatorio());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonOrdenarPorEnfaseActionPerformed

    private void jButtonOrdenadoPorSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenadoPorSituacaoActionPerformed
        try {
            imprimirRelatorioOrdenado(dalSituacao.listarRelatorio());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonOrdenadoPorSituacaoActionPerformed

    private void jButtonOrdenadoCursoEnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenadoCursoEnomeActionPerformed
        try {
            imprimirRelatorioOrdenado(dalCursoEnome.listarRelatorio());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonOrdenadoCursoEnomeActionPerformed

    private void jButtonOrdenarPorNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorNomeKeyPressed
        try {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                imprimirRelatorioOrdenado(dalNome.listarRelatorio());
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!!\n" + erro.getMessage());

        }
    }//GEN-LAST:event_jButtonOrdenarPorNomeKeyPressed

    private void jButtonOrdenarPorCursoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorCursoKeyPressed
        try {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                imprimirRelatorioOrdenado(dalCurso.listarRelatorio());
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!!\n" + erro.getMessage());

        }
    }//GEN-LAST:event_jButtonOrdenarPorCursoKeyPressed

    private void jButtonOrdenadoPorSituacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonOrdenadoPorSituacaoKeyPressed
        try {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                imprimirRelatorioOrdenado(dalSituacao.listarRelatorio());
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!!\n" + erro.getMessage());

        }
    }//GEN-LAST:event_jButtonOrdenadoPorSituacaoKeyPressed

    private void jButtonOrdenarPorEnfaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorEnfaseKeyPressed
        try {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                imprimirRelatorioOrdenado(dalEnfase.listarRelatorio());
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!!\n" + erro.getMessage());

        }
    }//GEN-LAST:event_jButtonOrdenarPorEnfaseKeyPressed

    private void jButtonOrdenadoCursoEnomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonOrdenadoCursoEnomeKeyPressed
        try {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                imprimirRelatorioOrdenado(dalCursoEnome.listarRelatorio());
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!!\n" + erro.getMessage());

        }
    }//GEN-LAST:event_jButtonOrdenadoCursoEnomeKeyPressed

    private void jButtonSituacaoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSituacaoNomeKeyPressed
        try {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                imprimirRelatorioOrdenado(dalSituacaoEnome.listarRelatorio());
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!!\n" + erro.getMessage());

        }
    }//GEN-LAST:event_jButtonSituacaoNomeKeyPressed

    private void jButtonSituacaoCursoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSituacaoCursoNomeKeyPressed
        try {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                imprimirRelatorioOrdenado(dalSituacaoCursoNome.listarRelatorio());

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!!\n" + erro.getMessage());

        }
    }//GEN-LAST:event_jButtonSituacaoCursoNomeKeyPressed

    private void jButtonEnfaseCursoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEnfaseCursoNomeKeyPressed
        try {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                imprimirRelatorioOrdenado(dalEnfaseCursoNome.listarRelatorio());
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!!\n" + erro.getMessage());

        }
    }//GEN-LAST:event_jButtonEnfaseCursoNomeKeyPressed

    private void jButtonCursoEnfaseNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCursoEnfaseNomeKeyPressed
        try {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                imprimirRelatorioOrdenado(dalCursoEnfaseNome.listarRelatorio());
                jButtonOrdenarPorNome.requestFocus();
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção !!!\n" + erro.getMessage());

        }
    }//GEN-LAST:event_jButtonCursoEnfaseNomeKeyPressed

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
            java.util.logging.Logger.getLogger(RelatorioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCursoEnfaseNome;
    private javax.swing.JButton jButtonEnfaseCursoNome;
    private javax.swing.JButton jButtonOrdenadoCursoEnome;
    private javax.swing.JButton jButtonOrdenadoPorSituacao;
    private javax.swing.JButton jButtonOrdenarPorCurso;
    private javax.swing.JButton jButtonOrdenarPorEnfase;
    private javax.swing.JButton jButtonOrdenarPorNome;
    private javax.swing.JButton jButtonSituacaoCursoNome;
    private javax.swing.JButton jButtonSituacaoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRelatorioEnfase;
    // End of variables declaration//GEN-END:variables

}
