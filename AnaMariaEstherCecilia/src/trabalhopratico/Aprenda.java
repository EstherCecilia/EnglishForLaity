/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public final class Aprenda extends javax.swing.JFrame {

    private Lista<String> lista = new Lista<String>();
    private DadosJogador dados;
    private int ondeParei;
    private int totalPalavra = 1000;

    /**
     * Creates new form Aprenda
     */
    public Aprenda() {
        initComponents();

    }

    public Aprenda(DadosJogador jogador) { //recebe os dados do usuario que fez login
        initComponents();
        this.setLocationRelativeTo(null);
        this.dados = jogador;
        preencherPalavra();

    }

    public void mudarPosicao() {
        FileReader fr;
        BufferedReader readerf = null;//ler arquivo
        ArrayList<DadosJogador> dado = new ArrayList<>();
        FileWriter fw;
        BufferedWriter fwriter = null;//escrever no arquivo

        try {
            fr = new FileReader("Cadastro.txt");
            readerf = new BufferedReader(fr);
            String linha = readerf.readLine();

            while (linha != null) {//se linha igual a null      todas linhas jÃƒÂ¡ foram lidas
                String[] textoSeparado = linha.split(";");
                DadosJogador d = new DadosJogador();
                d.setNome(textoSeparado[0]);
                d.setSenha(textoSeparado[1]);
                int pontos = Integer.parseInt(textoSeparado[2]);
                int posicao = Integer.parseInt(textoSeparado[3]);
                d.setPontos(pontos);
                d.setOndeParei(posicao);
                if (linha.equals(dados.getNome() + ";" + dados.getSenha() + ";" + pontos + ";" + posicao)) {

                    d.setPontos(dados.getPontos());
                    d.setOndeParei(dados.getOndeParei());
                }
                dado.add(d);
                linha = readerf.readLine();
            }

        } catch (IOException ex) {
            Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            if (readerf != null) {
                try {
                    readerf.close();

                } catch (IOException ex) {
                    Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            File file = new File("Cadastro.txt");
            file.delete();
            try {
                fw = new FileWriter("Cadastro.txt", true);
                fwriter = new BufferedWriter(fw);
                for (int i = 0; i < dado.size(); i++) {
                    fwriter.write(dado.get(i).getNome() + ";" + dado.get(i).getSenha() + ";" + dado.get(i).getPontos() + ";" + dado.get(i).getOndeParei() + "\r\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(Editar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {

                try {
                    fwriter.close();

                } catch (IOException ex) {
                    Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void preencherPalavra() {
        ondeParei = dados.getOndeParei();

        FileReader fr;
        BufferedReader readerf = null;

        try {
            if (totalPalavra < ondeParei) {
                System.out.println("voce brilhou");
            } else {
                int aux;
                String linhaVetor[];
                fr = new FileReader("palavras.txt");
                readerf = new BufferedReader(fr);

                do {
                    String linha = readerf.readLine();
                    linhaVetor = linha.split(";");
                    aux = Integer.parseInt(linhaVetor[0]);
                } while (aux < ondeParei);

                lista.adicionar(linhaVetor[1]); //palvra em ingles
                lista.adicionar(linhaVetor[2]); //pronuncia
                lista.adicionar(linhaVetor[3]); //traducao
            }
        } catch (IOException ex) {
            Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            if (readerf != null) {
                try {
                    readerf.close();
                } catch (IOException ex) {
                    Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        alteraDados();
        ondeParei++;
        dados.setOndeParei(ondeParei);
    }

    public void alteraDados() {
        this.palavra.setText(lista.imprimir(0));
        this.traducao.setText(lista.imprimir(2));
        this.pronuncia.setText(lista.imprimir(1));
        lista.esvazia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        palavra = new javax.swing.JLabel();
        traducao = new javax.swing.JLabel();
        pronuncia = new javax.swing.JLabel();
        proxima = new javax.swing.JButton();
        teste = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PALAVRA DO DIA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("WORD:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("TRANSLATION:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("PRONUNCIATION :");

        palavra.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N

        traducao.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N

        pronuncia.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N

        proxima.setText("Proxima Palavra");
        proxima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proximaMouseClicked(evt);
            }
        });
        proxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximaActionPerformed(evt);
            }
        });

        teste.setText("Treinar traduções");
        teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testeActionPerformed(evt);
            }
        });

        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(teste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(proxima, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(palavra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pronuncia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(traducao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(palavra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traducao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pronuncia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proxima)
                    .addComponent(teste))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {palavra, pronuncia, traducao});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximaActionPerformed
        this.preencherPalavra();


    }//GEN-LAST:event_proximaActionPerformed

    private void proximaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proximaMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_proximaMouseClicked

    private void testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testeActionPerformed
        // TODO add your handling code here:
        mudarPosicao();
        new TesteTraducao(dados).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_testeActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        mudarPosicao();
        new Menu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(Aprenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aprenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aprenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aprenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                //new Aprenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton menu;
    private javax.swing.JLabel palavra;
    private javax.swing.JLabel pronuncia;
    private javax.swing.JButton proxima;
    private javax.swing.JButton teste;
    private javax.swing.JLabel traducao;
    // End of variables declaration//GEN-END:variables
}
