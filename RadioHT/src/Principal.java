/**
 *@author Carlos Raxtum
 * @author Juan Marroquin
 */
public class Principal extends javax.swing.JFrame {
    /** 
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OnOff = new javax.swing.JButton();
        AmFm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Fav1 = new javax.swing.JButton();
        Fav2 = new javax.swing.JButton();
        Fav3 = new javax.swing.JButton();
        Fav4 = new javax.swing.JButton();
        Fav5 = new javax.swing.JButton();
        Fav6 = new javax.swing.JButton();
        Estacion = new javax.swing.JLabel();
        Fav7 = new javax.swing.JButton();
        Fav8 = new javax.swing.JButton();
        Fav9 = new javax.swing.JButton();
        Fav10 = new javax.swing.JButton();
        Fav11 = new javax.swing.JButton();
        Fav12 = new javax.swing.JButton();
        Avanzar = new javax.swing.JButton();
        Estado = new javax.swing.JLabel();
        GuardarEstacion = new javax.swing.JButton();
        BotonesFav = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        OnOff.setText("ON/OFF");
        OnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOffActionPerformed(evt);
            }
        });

        AmFm.setText("Am/Fm");
        AmFm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmFmActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Fav1.setText("1");
        Fav1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav1ActionPerformed(evt);
            }
        });

        Fav2.setText("2");
        Fav2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav2ActionPerformed(evt);
            }
        });

        Fav3.setText("3");
        Fav3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav3ActionPerformed(evt);
            }
        });

        Fav4.setText("4");
        Fav4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav4ActionPerformed(evt);
            }
        });

        Fav5.setText("5");
        Fav5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav5ActionPerformed(evt);
            }
        });

        Fav6.setText("6");
        Fav6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav6ActionPerformed(evt);
            }
        });

        Estacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Estacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Estacion.setText("   ");

        Fav7.setText("7");
        Fav7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav7ActionPerformed(evt);
            }
        });

        Fav8.setText("8");
        Fav8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav8ActionPerformed(evt);
            }
        });

        Fav9.setText("9");
        Fav9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav9ActionPerformed(evt);
            }
        });

        Fav10.setText("10");
        Fav10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav10ActionPerformed(evt);
            }
        });

        Fav11.setText("11");
        Fav11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav11ActionPerformed(evt);
            }
        });

        Fav12.setText("12");
        Fav12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fav12ActionPerformed(evt);
            }
        });

        Avanzar.setText(">");
        Avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Fav1)
                    .addComponent(Fav7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Fav8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fav9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fav10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fav11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fav12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Fav2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fav3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fav4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fav5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fav6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Estacion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(Avanzar)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Avanzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Fav1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fav2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Fav3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Fav4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Fav5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Fav6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(Estacion)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Fav8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fav7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fav9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fav10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fav11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fav12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );

        Estado.setText("On");

        GuardarEstacion.setText("Guardar");
        GuardarEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEstacionActionPerformed(evt);
            }
        });

        BotonesFav.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BotonesFav, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarEstacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AmFm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OnOff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Estado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AmFm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(GuardarEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonesFav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Fav3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav3ActionPerformed
       int Num=3;
       Radio.seleccionarEmisora(Num);
       Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav3ActionPerformed

    private void Fav7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav7ActionPerformed
        int Num=7;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav7ActionPerformed

    private void OnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnOffActionPerformed
        Fav1.setEnabled(Radio.estado());
        Fav2.setEnabled(Radio.estado());
        Fav3.setEnabled(Radio.estado());
        Fav4.setEnabled(Radio.estado());
        Fav5.setEnabled(Radio.estado());
        Fav6.setEnabled(Radio.estado());
        Fav7.setEnabled(Radio.estado());
        Fav8.setEnabled(Radio.estado());
        Fav9.setEnabled(Radio.estado());
        Fav10.setEnabled(Radio.estado());
        Fav11.setEnabled(Radio.estado());
        Fav12.setEnabled(Radio.estado());
        Avanzar.setEnabled(Radio.estado());
        GuardarEstacion.setEnabled(Radio.estado());
        BotonesFav.setEnabled(Radio.estado());
        AmFm.setEnabled(Radio.estado());
        if(Radio.estado()==true){
            Estado.setText("ON");
        }
        else if(Radio.estado()==false){
            Estado.setText("OFF");
        }
        Radio.onOff();
    }//GEN-LAST:event_OnOffActionPerformed

    private void AmFmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmFmActionPerformed
        Radio.cambiarFrecuencia();
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_AmFmActionPerformed

    private void AvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvanzarActionPerformed
        Radio.avanzar();
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_AvanzarActionPerformed

    private void GuardarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEstacionActionPerformed
        int Num;
        Num = Integer.parseInt(BotonesFav.getSelectedItem().toString());
        Radio.guardar(Num);
        
    }//GEN-LAST:event_GuardarEstacionActionPerformed

    private void Fav1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav1ActionPerformed
        int Num=1;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav1ActionPerformed

    private void Fav2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav2ActionPerformed
        int Num=2;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav2ActionPerformed

    private void Fav4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav4ActionPerformed
        int Num=4;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav4ActionPerformed

    private void Fav5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav5ActionPerformed
        int Num=5;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav5ActionPerformed

    private void Fav6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav6ActionPerformed
        int Num=6;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav6ActionPerformed

    private void Fav8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav8ActionPerformed
        int Num=8;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav8ActionPerformed

    private void Fav9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav9ActionPerformed
        int Num=9;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav9ActionPerformed

    private void Fav10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav10ActionPerformed
        int Num=10;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav10ActionPerformed

    private void Fav11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav11ActionPerformed
        int Num=11;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav11ActionPerformed

    private void Fav12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fav12ActionPerformed
        int Num=12;
        Radio.seleccionarEmisora(Num);
        Estacion.setText(Radio.estacionActual());
    }//GEN-LAST:event_Fav12ActionPerformed
    //Interfaz que deben de cambiar
    Funcionalidad Radio = new Radio();
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmFm;
    private javax.swing.JButton Avanzar;
    private javax.swing.JComboBox BotonesFav;
    private javax.swing.JLabel Estacion;
    private javax.swing.JLabel Estado;
    private javax.swing.JButton Fav1;
    private javax.swing.JButton Fav10;
    private javax.swing.JButton Fav11;
    private javax.swing.JButton Fav12;
    private javax.swing.JButton Fav2;
    private javax.swing.JButton Fav3;
    private javax.swing.JButton Fav4;
    private javax.swing.JButton Fav5;
    private javax.swing.JButton Fav6;
    private javax.swing.JButton Fav7;
    private javax.swing.JButton Fav8;
    private javax.swing.JButton Fav9;
    private javax.swing.JButton GuardarEstacion;
    private javax.swing.JButton OnOff;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
