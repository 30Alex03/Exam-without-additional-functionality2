package com.mycompany.examwork;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author ivahn
 */
public class GUI extends javax.swing.JFrame {
    
    DefaultTreeModel model;
    DefaultMutableTreeNode routers = new DefaultMutableTreeNode();
    TreePath b1;
    TreePath b2;
    boolean x;
    Node node;
    
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        routerTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkTree = new javax.swing.JTree();
        mask = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        firstTextArea = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        secondTextArea = new javax.swing.JTextArea();
        info1Button = new javax.swing.JButton();
        info2Button = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        routerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routerTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Количество маршрутизаторов");

        jButton1.setText("Создать маршрутизаторы");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        networkTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                networkTreeMouseClicked(evt);
            }
        });
        networkTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                networkTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(networkTree);

        mask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maskActionPerformed(evt);
            }
        });

        jButton2.setText("Добавить маску ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        firstTextArea.setColumns(20);
        firstTextArea.setRows(5);
        jScrollPane2.setViewportView(firstTextArea);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        secondTextArea.setColumns(20);
        secondTextArea.setRows(5);
        jScrollPane3.setViewportView(secondTextArea);

        info1Button.setText("отобразить 1 узел");
        info1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info1ButtonActionPerformed(evt);
            }
        });

        info2Button.setText("отобразить 2 узел");
        info2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info2ButtonActionPerformed(evt);
            }
        });

        resultButton.setText("Отобразить результат");
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(routerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mask, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(resultButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info1Button)
                    .addComponent(info2Button))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(routerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(mask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(exitButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(resultButton))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(info1Button)
                        .addGap(58, 58, 58)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(info2Button)
                        .addGap(44, 44, 44))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void routerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routerTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NetworkGenerator networkGenerator = new NetworkGenerator();
        int numRouters = Integer.parseInt(routerTextField.getText());
        for (int i = 1; i < (numRouters+1); i++) {
            DefaultMutableTreeNode router = new DefaultMutableTreeNode(networkGenerator.createRouter(i));
            routers.add(router);
        }
        
        model = (DefaultTreeModel) networkTree.getModel();
        model.setRoot(routers);
        networkTree.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void networkTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_networkTreeMouseClicked
        
//DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) networkTree.getCellRenderer();
        //renderer.setTextSelectionColor(Color.red);
        //renderer.setBackgroundSelectionColor(Color.blue);
        //renderer.setBorderSelectionColor(Color.red);
        //renderer.setForeground();
        /*
        networkTree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                TreePath path = e.getNewLeadSelectionPath();
                if (path != null) {
                    // Получаем информацию о первом узле
                    DefaultMutableTreeNode firstNode = (DefaultMutableTreeNode) path.getPathComponent(0);
                    String firstNodeInfo = firstNode.toString();

                    // Выводим информацию о двух узлах в текстовые области
                    // Предполагается, что у вас есть две текстовые области, которые вы хотите заполнить
                    // Например, JTextArea firstTextArea и JTextArea secondTextArea
                    firstTextArea.setText(firstNodeInfo);
                    
                }
            }
        });*/
    }//GEN-LAST:event_networkTreeMouseClicked

    private void maskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maskActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NetworkGenerator networkGenerator = new NetworkGenerator();
        int num = Integer.parseInt(mask.getText());
        int p = num-23;
        int t = getRandomPort();
        int u = t/28 + 1;
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) networkTree.getSelectionPath().getLastPathComponent();
        for (int i = 1; i < (p+1); i++) {
            DefaultMutableTreeNode newSubnet = new DefaultMutableTreeNode(networkGenerator.createSubnet(i, num));
                for (int j = 1; j < (u + 1); j++) {
                    DefaultMutableTreeNode newCommutator = new DefaultMutableTreeNode(networkGenerator.createCommutator(j));
                        for (int k = 1; k < 29; k++) {
                            boolean v = getisSleepMode();
                            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(networkGenerator.createNode(k, num, v));
                            
                            newCommutator.add(newNode);
                            t--;
                            if (t == 0) break;
                    }
                    newSubnet.add(newCommutator);
            }
            selectedNode.add(newSubnet);
        }
        DefaultTreeModel model = (DefaultTreeModel) networkTree.getModel();
        model.reload();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void networkTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_networkTreeValueChanged
        
    }//GEN-LAST:event_networkTreeValueChanged

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void info1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info1ButtonActionPerformed
        /*if (node.isSleepMode() == true){
            
        }*/
        Object[] array = networkTree.getSelectionPath().getPath();
        String p = "";
        for (int i = 1; i < array.length; i++) {
            p += array[i].toString() + " ";
        }
        firstTextArea.setText(p);
        if (array.length == 5){
            b1 = networkTree.getSelectionPath();
            
        } else x = true;
        
    }//GEN-LAST:event_info1ButtonActionPerformed

    private void info2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info2ButtonActionPerformed
        Object[] array = networkTree.getSelectionPath().getPath();
        String p = "";
        for (int i = 1; i < array.length; i++) {
            p += array[i].toString() + " ";
        }
        secondTextArea.setText(p);
        if (array.length == 5){
            b2 = networkTree.getSelectionPath();
        }  else x = true;
    }//GEN-LAST:event_info2ButtonActionPerformed

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        if (b1 == null || b2 == null){
            System.out.println("Выберете что-то из дерева");
        } else if (x){
            System.out.println("выбран не узел");
            x = false;
        } else if (b1.getPathComponent( 3) == b2.getPathComponent(3)){
            System.out.println("связаны");
        } else System.out.println("не связаны");
    }//GEN-LAST:event_resultButtonActionPerformed
        
    
    public int getRandomNodes(int min, int max) {        
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public int getRandomPort() {
        Random random = new Random();
        return 1 + random.nextInt(255);
    }
    
    public boolean getisSleepMode() {        
        Random random = new Random();
        boolean isSleepMode = random.nextBoolean();
        return isSleepMode;
    } 
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JTextArea firstTextArea;
    private javax.swing.JButton info1Button;
    private javax.swing.JButton info2Button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField mask;
    private javax.swing.JTree networkTree;
    private javax.swing.JButton resultButton;
    private javax.swing.JTextField routerTextField;
    private javax.swing.JTextArea secondTextArea;
    // End of variables declaration//GEN-END:variables
}
