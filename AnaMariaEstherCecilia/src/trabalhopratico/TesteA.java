/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public final class TesteA extends javax.swing.JFrame {

    /**
     * Creates new form Testes
     */
    private String nome;

    public TesteA() {
        initComponents();
        this.setLocationRelativeTo(null);
        mudar();
    }

    public void mudar() {

        //Carga das imagens do disco
        ImageIcon imagens[] = {new ImageIcon(getClass().getResource("images/testes/bed.jpg")), new ImageIcon(getClass().getResource("images/testes/bee.jpg")),
            new ImageIcon(getClass().getResource("images/testes/bunny.jpg")), new ImageIcon(getClass().getResource("images/testes/car.jpg")),
            new ImageIcon(getClass().getResource("images/testes/chair.jpg")), new ImageIcon(getClass().getResource("images/testes/couch.jpg")),
            new ImageIcon(getClass().getResource("images/testes/cow.jpg")), new ImageIcon(getClass().getResource("images/testes/dog.jpg")),
            new ImageIcon(getClass().getResource("images/testes/chicken.jpg")), new ImageIcon(getClass().getResource("images/testes/home.jpg")),
            new ImageIcon(getClass().getResource("images/testes/knife.jpg")), new ImageIcon(getClass().getResource("images/testes/lion.jpg")),
            new ImageIcon(getClass().getResource("images/testes/mouse.jpg")), new ImageIcon(getClass().getResource("images/testes/mouth.jpg")),
            new ImageIcon(getClass().getResource("images/testes/pan.jpg")), new ImageIcon(getClass().getResource("images/testes/panda.jpg")),
            new ImageIcon(getClass().getResource("images/testes/penguin.jpg")), new ImageIcon(getClass().getResource("images/testes/piano.jpg")),
            new ImageIcon(getClass().getResource("images/testes/robot.jpg")), new ImageIcon(getClass().getResource("images/testes/seal.jpg")),
            new ImageIcon(getClass().getResource("images/testes/sheep.jpg")), new ImageIcon(getClass().getResource("images/testes/shoe.jpg")),
            new ImageIcon(getClass().getResource("images/testes/straberry.jpg")), new ImageIcon(getClass().getResource("images/testes/telephone.jpg")),
            new ImageIcon(getClass().getResource("images/testes/foot.jpg"))};

//Lista com todas palavras
        Lista<String> lista = new Lista<>();
        lista.adicionar("bed");
        lista.adicionar("bee");
        lista.adicionar("bunny");
        lista.adicionar("car");
        lista.adicionar("chair");
        lista.adicionar("couch");
        lista.adicionar("cow");
        lista.adicionar("chicken");
        lista.adicionar("dog");
        lista.adicionar("home");
        lista.adicionar("knife");
        lista.adicionar("lion");
        lista.adicionar("panda");
        lista.adicionar("mouse");
        lista.adicionar("mouth");
        lista.adicionar("pan");
        lista.adicionar("penguin");
        lista.adicionar("piano");
        lista.adicionar("robot");
        lista.adicionar("seal");
        lista.adicionar("sheep");
        lista.adicionar("shoe");
        lista.adicionar("straberry");
        lista.adicionar("telephone");
        lista.adicionar("foot");

//Sorteia e coloca uma no JLabel
        Random r = new Random();
        int idx = r.nextInt(imagens.length);
        foto.setIcon(imagens[idx]);

        String linhaVetor[];
        String linha;
        linha = this.foto.getIcon().toString();
        linhaVetor = linha.split("/");

        String linhaVetorOk[];
        String linhaOk;
        int aux = linhaVetor.length - 1;
        linhaOk = linhaVetor[aux];
        linhaVetorOk = linhaOk.split(".j");
        nome = linhaVetorOk[0];

        int d1, d2, d3;
        do {
            d1 = r.nextInt(imagens.length);
            d2 = r.nextInt(imagens.length);
            d3 = r.nextInt(imagens.length);
        } while (lista.imprimir(d1).equals(lista.imprimir(d2)) || lista.imprimir(d2).equals(lista.imprimir(d3)) || lista.imprimir(d1).equals(lista.imprimir(d3)) || lista.imprimir(d1).equals(nome) || lista.imprimir(d2).equals(nome) || lista.imprimir(d3).equals(nome));

        String nomes[] = {lista.imprimir(d1), lista.imprimir(d2), lista.imprimir(d3), nome};

        Random gerador = new Random();
        int imagem = gerador.nextInt(3);

        switch (imagem) {

            case 0:

                jCheckBox2.setText(nomes[0]);
                jCheckBox3.setText(nomes[1]);
                jCheckBox4.setText(nomes[2]);
                jCheckBox5.setText(nomes[3]);
                break;
            case 1:
                jCheckBox2.setText(nomes[3]);
                jCheckBox3.setText(nomes[1]);
                jCheckBox4.setText(nomes[2]);
                jCheckBox5.setText(nomes[0]);
                break;
            case 2:
                jCheckBox2.setText(nomes[0]);
                jCheckBox3.setText(nomes[3]);
                jCheckBox4.setText(nomes[2]);
                jCheckBox5.setText(nomes[1]);
                break;

            case 3:
                jCheckBox2.setText(nomes[0]);
                jCheckBox3.setText(nomes[1]);
                jCheckBox4.setText(nomes[3]);
                jCheckBox5.setText(nomes[2]);
                break;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        confirmar = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        jCheckBox6.setText("jCheckBox6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        foto.setBackground(new java.awt.Color(153, 255, 255));
        foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jCheckBox2.setText("car");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("move");

        jCheckBox4.setText("bus");

        jCheckBox5.setText("tuesday");

        confirmar.setText("Confirmar Resposta");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(confirmar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu)
                .addGap(38, 38, 38)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox5))
                .addGap(20, 20, 20)
                .addComponent(confirmar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if (jCheckBox2.isSelected() && !jCheckBox3.isSelected() && !jCheckBox4.isSelected() && !jCheckBox5.isSelected()) {
            if (nome.equals(jCheckBox2.getText())) {
                JOptionPane.showMessageDialog(null, "Congratulations!");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            }
        }
        if (jCheckBox3.isSelected() && !jCheckBox2.isSelected() && !jCheckBox4.isSelected() && !jCheckBox5.isSelected()) {
            if (nome.equals(jCheckBox3.getText())) {
                JOptionPane.showMessageDialog(null, "Congratulations!");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            }
        }
        if (jCheckBox4.isSelected() && !jCheckBox3.isSelected() && !jCheckBox2.isSelected() && !jCheckBox5.isSelected()) {
            if (nome.equals(jCheckBox4.getText())) {
                JOptionPane.showMessageDialog(null, "Congratulations!");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            }
        }
        if (jCheckBox5.isSelected() && !jCheckBox3.isSelected() && !jCheckBox4.isSelected() && !jCheckBox2.isSelected()) {
            if (nome.equals(jCheckBox5.getText())) {
                JOptionPane.showMessageDialog(null, "Congratulations!");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            }
        }
        if (jCheckBox5.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && jCheckBox2.isSelected()) {
            
                JOptionPane.showMessageDialog(null, "Seleciona apena 1!");
        }
        if (!jCheckBox5.isSelected() && !jCheckBox3.isSelected() && !jCheckBox4.isSelected() && !jCheckBox2.isSelected()) {
            
                JOptionPane.showMessageDialog(null, "Seleciona pelo menos 1!");
        }
        if (jCheckBox5.isSelected() && jCheckBox3.isSelected() && !jCheckBox4.isSelected() && !jCheckBox2.isSelected()) {
            
                JOptionPane.showMessageDialog(null, "Seleciona apena 1!");
        }
        if (!jCheckBox5.isSelected() && !jCheckBox3.isSelected() && jCheckBox4.isSelected() && jCheckBox2.isSelected()) {
            
                JOptionPane.showMessageDialog(null, "Seleciona apena 1!");
        }
        if (jCheckBox5.isSelected() && !jCheckBox3.isSelected() && !jCheckBox4.isSelected() && jCheckBox2.isSelected()) {
            
                JOptionPane.showMessageDialog(null, "Seleciona apena 1!");
        }
        if (!jCheckBox5.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && !jCheckBox2.isSelected()) {
            
                JOptionPane.showMessageDialog(null, "Seleciona apena 1!");
        }
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        mudar();

    }//GEN-LAST:event_confirmarActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        new Menu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(TesteA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesteA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesteA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesteA.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel foto;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
