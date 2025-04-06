package com.mycompany.uc15_atividade.telas;

import com.mycompany.uc15_atividade.persistencia.Categoria;
import com.mycompany.uc15_atividade.persistencia.CategoriaJPA;
import com.mycompany.uc15_atividade.persistencia.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroCategoria extends javax.swing.JFrame {

    public CadastroCategoria(Usuario usuario) {
        initComponents();

        if (usuario.getTipo().equalsIgnoreCase("Auxiliar")) {
            btnSalvar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } else if (usuario.getTipo().equalsIgnoreCase("Assistente")) {
            btnSalvar.setEnabled(false);
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
        } else if (usuario.getTipo().equalsIgnoreCase("Analista")) {
            btnSalvar.setEnabled(true);
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
        } else {
            btnSalvar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }

    public CadastroCategoria() {
        initComponents();
    }

    private DefaultTableModel montarTabela(List<Categoria> listaCategoria) {
        String[] colunas = {"ID", "Descrição"};
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(colunas);

        for (int i = 0; listaCategoria.size() > i; i++) {
            Categoria categoria = listaCategoria.get(i);

            String[] linha = {
                Integer.toString(categoria.getId()),
                categoria.getDescricao()
            };
            tabela.addRow(linha);
        }
        return tabela;
    }

    private String getIdItemSelecionado() {
        int posicao = jtableCategoria.getSelectedRow();
        if (posicao == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela!");
        }
        return (String) jtableCategoria.getValueAt(posicao, 0);
    }

    private Categoria categoriaEdicao = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableCategoria = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuCadastro = new javax.swing.JMenu();
        jmenuAliquotaFCP = new javax.swing.JMenuItem();
        jmenuAliquotaICMS = new javax.swing.JMenuItem();
        jmenuAliquotaPISCOFINS = new javax.swing.JMenuItem();
        jmenuCategoria = new javax.swing.JMenuItem();
        jmenuCEST = new javax.swing.JMenuItem();
        jmenuCST = new javax.swing.JMenuItem();
        jmenuNCM = new javax.swing.JMenuItem();
        jmenuOrigem = new javax.swing.JMenuItem();
        jmenuProduto = new javax.swing.JMenuItem();
        jmenuRelatorio = new javax.swing.JMenu();
        jmenuProdutos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO DE CATEGORIA");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("Descrição");

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtCategoria.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtableCategoria.setModel(montarTabela(CategoriaJPA.listar()));
        jScrollPane1.setViewportView(jtableCategoria);

        btnEditar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(211, 211, 211))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jmenuCadastro.setText("Cadastro");
        jmenuCadastro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jmenuAliquotaFCP.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jmenuAliquotaFCP.setText("Aliquota FCP");
        jmenuAliquotaFCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuAliquotaFCPActionPerformed(evt);
            }
        });
        jmenuCadastro.add(jmenuAliquotaFCP);

        jmenuAliquotaICMS.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jmenuAliquotaICMS.setText("Aliquota ICMS");
        jmenuAliquotaICMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuAliquotaICMSActionPerformed(evt);
            }
        });
        jmenuCadastro.add(jmenuAliquotaICMS);

        jmenuAliquotaPISCOFINS.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jmenuAliquotaPISCOFINS.setText("Aliquota PIS e COFINS");
        jmenuAliquotaPISCOFINS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuAliquotaPISCOFINSActionPerformed(evt);
            }
        });
        jmenuCadastro.add(jmenuAliquotaPISCOFINS);

        jmenuCategoria.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jmenuCategoria.setText("Categoria");
        jmenuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuCategoriaActionPerformed(evt);
            }
        });
        jmenuCadastro.add(jmenuCategoria);

        jmenuCEST.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jmenuCEST.setText("CEST");
        jmenuCEST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuCESTActionPerformed(evt);
            }
        });
        jmenuCadastro.add(jmenuCEST);

        jmenuCST.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jmenuCST.setText("CST");
        jmenuCST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuCSTActionPerformed(evt);
            }
        });
        jmenuCadastro.add(jmenuCST);

        jmenuNCM.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jmenuNCM.setText("NCM");
        jmenuNCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuNCMActionPerformed(evt);
            }
        });
        jmenuCadastro.add(jmenuNCM);

        jmenuOrigem.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jmenuOrigem.setText("Origem");
        jmenuOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuOrigemActionPerformed(evt);
            }
        });
        jmenuCadastro.add(jmenuOrigem);

        jmenuProduto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jmenuProduto.setText("Produto");
        jmenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuProdutoActionPerformed(evt);
            }
        });
        jmenuCadastro.add(jmenuProduto);

        jMenuBar1.add(jmenuCadastro);

        jmenuRelatorio.setText("Relatório");
        jmenuRelatorio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jmenuProdutos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jmenuProdutos.setText("Produtos");
        jmenuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuProdutosActionPerformed(evt);
            }
        });
        jmenuRelatorio.add(jmenuProdutos);

        jMenuBar1.add(jmenuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmenuAliquotaFCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuAliquotaFCPActionPerformed
        CadastroFcp cadFCP = new CadastroFcp();
        cadFCP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuAliquotaFCPActionPerformed

    private void jmenuAliquotaICMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuAliquotaICMSActionPerformed
        CadastroIcms cadICMS = new CadastroIcms();
        cadICMS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuAliquotaICMSActionPerformed

    private void jmenuAliquotaPISCOFINSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuAliquotaPISCOFINSActionPerformed
        CadastroPis cadPis = new CadastroPis();
        cadPis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuAliquotaPISCOFINSActionPerformed

    private void jmenuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuCategoriaActionPerformed
        CadastroCategoria cadCat = new CadastroCategoria();
        cadCat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuCategoriaActionPerformed

    private void jmenuCESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuCESTActionPerformed
        CadastroCest cadCest = new CadastroCest();
        cadCest.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuCESTActionPerformed

    private void jmenuCSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuCSTActionPerformed
        CadastroCst cadCst = new CadastroCst();
        cadCst.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuCSTActionPerformed

    private void jmenuNCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuNCMActionPerformed
        CadastroNcm cadNcm = new CadastroNcm();
        cadNcm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuNCMActionPerformed

    private void jmenuOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuOrigemActionPerformed
        CadastroOrigem cadOrig = new CadastroOrigem();
        cadOrig.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuOrigemActionPerformed

    private void jmenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuProdutoActionPerformed
        CadastroProduto cadProd = new CadastroProduto();
        cadProd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuProdutoActionPerformed

    private void jmenuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuProdutosActionPerformed
        RelatorioProdutos rtProd = new RelatorioProdutos();
        rtProd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuProdutosActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Categoria categoria = new Categoria();
        categoria.setDescricao(txtCategoria.getText());

        if (categoriaEdicao != null) {
            categoriaEdicao.setDescricao(txtCategoria.getText());
            CategoriaJPA.atualizar(categoriaEdicao);
            JOptionPane.showMessageDialog(null, "Categoria atualizada com sucesso!");

        } else {
            CategoriaJPA.cadastrar(categoria);
            JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!");

        }
        jtableCategoria.setModel(montarTabela(CategoriaJPA.listar()));
        jScrollPane1.setViewportView(jtableCategoria);

        txtCategoria.setText("");

        categoriaEdicao = null;
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        CategoriaJPA.excluir(Integer.parseInt(getIdItemSelecionado()));
        jtableCategoria.setModel(montarTabela(CategoriaJPA.listar()));
        jScrollPane1.setViewportView(jtableCategoria);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String idSelecionado = getIdItemSelecionado();
        categoriaEdicao = CategoriaJPA.obter(Integer.parseInt(idSelecionado));
        txtCategoria.setText(categoriaEdicao.getDescricao());
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmenuAliquotaFCP;
    private javax.swing.JMenuItem jmenuAliquotaICMS;
    private javax.swing.JMenuItem jmenuAliquotaPISCOFINS;
    private javax.swing.JMenuItem jmenuCEST;
    private javax.swing.JMenuItem jmenuCST;
    private javax.swing.JMenu jmenuCadastro;
    private javax.swing.JMenuItem jmenuCategoria;
    private javax.swing.JMenuItem jmenuNCM;
    private javax.swing.JMenuItem jmenuOrigem;
    private javax.swing.JMenuItem jmenuProduto;
    private javax.swing.JMenuItem jmenuProdutos;
    private javax.swing.JMenu jmenuRelatorio;
    private javax.swing.JTable jtableCategoria;
    private javax.swing.JTextField txtCategoria;
    // End of variables declaration//GEN-END:variables
}
