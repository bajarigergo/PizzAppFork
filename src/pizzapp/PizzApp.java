package pizzapp;

public class PizzApp extends javax.swing.JFrame {
    int pizzaAlapAr = -1;
    int db = 1;
    int extrak;
    double vegsoAr;
    double meret;
    public PizzApp() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblValaszthato = new javax.swing.JLabel();
        cmbValaszthatoPizzak = new javax.swing.JComboBox<>();
        pnlMeret = new javax.swing.JPanel();
        rdbMeret25 = new javax.swing.JRadioButton();
        rdbMeret32 = new javax.swing.JRadioButton();
        pnlFizetendo = new javax.swing.JPanel();
        lblfizDb = new javax.swing.JLabel();
        lblFizFt = new javax.swing.JLabel();
        lblAr = new javax.swing.JLabel();
        numDb = new javax.swing.JSpinner();
        pnlExtrak = new javax.swing.JPanel();
        chbSajt = new javax.swing.JCheckBox();
        chbHagyma = new javax.swing.JCheckBox();
        chbAnanasz = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOsszesito = new javax.swing.JTextArea();
        btnRendel = new javax.swing.JButton();
        lblOsszesito = new javax.swing.JLabel();
        lblKep = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PizzApp");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblValaszthato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValaszthato.setText("Választható pizza:");

        cmbValaszthatoPizzak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Margherita", "Hawaii", "Songoku", "Diavola" }));
        cmbValaszthatoPizzak.setSelectedIndex(2);
        cmbValaszthatoPizzak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbValaszthatoPizzakActionPerformed(evt);
            }
        });

        pnlMeret.setBorder(javax.swing.BorderFactory.createTitledBorder("Méret"));

        buttonGroup1.add(rdbMeret25);
        rdbMeret25.setText("25 cm");
        rdbMeret25.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdbMeret25StateChanged(evt);
            }
        });

        buttonGroup1.add(rdbMeret32);
        rdbMeret32.setSelected(true);
        rdbMeret32.setText("32 cm");
        rdbMeret32.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdbMeret32StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlMeretLayout = new javax.swing.GroupLayout(pnlMeret);
        pnlMeret.setLayout(pnlMeretLayout);
        pnlMeretLayout.setHorizontalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbMeret25, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbMeret32, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMeretLayout.setVerticalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addComponent(rdbMeret25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbMeret32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFizetendo.setBorder(javax.swing.BorderFactory.createTitledBorder("Fizetendő"));

        lblfizDb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblfizDb.setText("db:");

        lblFizFt.setText("Ft");

        lblAr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        numDb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        numDb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numDbStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlFizetendoLayout = new javax.swing.GroupLayout(pnlFizetendo);
        pnlFizetendo.setLayout(pnlFizetendoLayout);
        pnlFizetendoLayout.setHorizontalGroup(
            pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFizetendoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFizetendoLayout.createSequentialGroup()
                        .addComponent(lblfizDb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numDb, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFizetendoLayout.createSequentialGroup()
                        .addComponent(lblAr, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFizFt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        pnlFizetendoLayout.setVerticalGroup(
            pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFizetendoLayout.createSequentialGroup()
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFizFt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfizDb))
                .addContainerGap())
        );

        pnlExtrak.setBorder(javax.swing.BorderFactory.createTitledBorder("Extrák"));

        chbSajt.setText("sajt");
        chbSajt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbSajtStateChanged(evt);
            }
        });

        chbHagyma.setText("hagyma");
        chbHagyma.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbHagymaStateChanged(evt);
            }
        });

        chbAnanasz.setText("ananász");
        chbAnanasz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbAnanaszStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlExtrakLayout = new javax.swing.GroupLayout(pnlExtrak);
        pnlExtrak.setLayout(pnlExtrakLayout);
        pnlExtrakLayout.setHorizontalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbSajt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbHagyma, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbAnanasz, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        pnlExtrakLayout.setVerticalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addComponent(chbSajt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbHagyma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbAnanasz)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txaOsszesito.setColumns(20);
        txaOsszesito.setRows(5);
        jScrollPane1.setViewportView(txaOsszesito);

        btnRendel.setText("Megrendelem");

        lblOsszesito.setText("Összestő:");

        lblKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/pizza.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValaszthato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbValaszthatoPizzak, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMeret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRendel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszesito, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRendel, cmbValaszthatoPizzak, pnlFizetendo, pnlMeret});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(lblOsszesito))
                            .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblValaszthato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbValaszthatoPizzak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlMeret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlFizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRendel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(6, 6, 6))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbValaszthatoPizzakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbValaszthatoPizzakActionPerformed
        osszesito();
        fizetendo();

    }//GEN-LAST:event_cmbValaszthatoPizzakActionPerformed

    private void rdbMeret25StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdbMeret25StateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_rdbMeret25StateChanged

    private void rdbMeret32StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdbMeret32StateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_rdbMeret32StateChanged

    private void chbSajtStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbSajtStateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_chbSajtStateChanged

    private void chbHagymaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbHagymaStateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_chbHagymaStateChanged

    private void chbAnanaszStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbAnanaszStateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_chbAnanaszStateChanged

    private void numDbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numDbStateChanged
        fizetendo();
        osszesito();
    }//GEN-LAST:event_numDbStateChanged

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
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRendel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbAnanasz;
    private javax.swing.JCheckBox chbHagyma;
    private javax.swing.JCheckBox chbSajt;
    private javax.swing.JComboBox<String> cmbValaszthatoPizzak;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAr;
    private javax.swing.JLabel lblFizFt;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLabel lblOsszesito;
    private javax.swing.JLabel lblValaszthato;
    private javax.swing.JLabel lblfizDb;
    private javax.swing.JSpinner numDb;
    private javax.swing.JPanel pnlExtrak;
    private javax.swing.JPanel pnlFizetendo;
    private javax.swing.JPanel pnlMeret;
    private javax.swing.JRadioButton rdbMeret25;
    private javax.swing.JRadioButton rdbMeret32;
    private javax.swing.JTextArea txaOsszesito;
    // End of variables declaration//GEN-END:variables

    private void fizetendo() {
        meret();
        extrak();
        pizzaAlapAr();
        darabszam();
                
        vegsoAr = pizzaAlapAr() * meret() + extrak();
        vegsoAr *= darabszam();
        
        lblAr.setText(String.format("%.0f", vegsoAr));
    }

    private int extrak() {
        int ar = 0;
        if (chbSajt.isSelected() == true){
        ar += 100;
        }
        if (chbAnanasz.isSelected()) {
            ar += 200;
        }
        if (chbHagyma.isSelected()) {
            ar += 150;
        }
        return ar;
    }

    private double meret() {
        double meretAr = 1;
        if (rdbMeret25.isSelected()) {
            meretAr *= 0.75;
        }
        return meretAr;
    }

    private int pizzaAlapAr() {
        int ar = 0;
        int pizzaIndex = cmbValaszthatoPizzak.getSelectedIndex();
        
        switch (pizzaIndex) {
            case 0:
                ar = 1590;
                break;
            case 1:
                ar = 1680;
                break;
            case 2:
                ar = 1750;
                break;
            case 3:
                ar = 2100;
                break;
            default:
                break;
        }
        return ar ;
    }

    private int darabszam() {
        int segitdb = 1;
        int darab = (int) numDb.getValue();
        return segitdb * darab;
    }

    private void osszesito() {
        String leiras = "";
        PizzaMeret();
        int darab = (int) numDb.getValue();
        ValasztottPizza();
        ValasztottFeltet();
        txaOsszesito.setText("");
        
        leiras += "A választott pizza: " + ValasztottPizza() + " ";
        leiras += "(" + darab + " db)\n";
        leiras += "mérete: " + PizzaMeret() + "\n";
        leiras += "feltétek:\n" + ValasztottFeltet();
        
        txaOsszesito.setText(leiras);
                
    }

    private String PizzaMeret() {
        String meret = "32 cm";
        if(rdbMeret25.isSelected()){
             meret = "25 cm";
        }
        return meret;
    }

    private String ValasztottPizza() {
        String pizza = "";
        int kivalasztottPizza = cmbValaszthatoPizzak.getSelectedIndex();
        switch (kivalasztottPizza) {
            case 0 :
                pizza = "Margherita";
                break;
            case 1 :
                pizza = "Hawaii";
                break;
            case 2 :
                pizza = "Songoku";
                break;
            case 3 :
                pizza = "Diavola";
                break;
    };
        return pizza;
}

    private String ValasztottFeltet() {
        String feltet = "";
        boolean ananaszKivalasztva = chbAnanasz.isSelected() == true;
        boolean sajtKivalasztva = chbSajt.isSelected() == true;
        boolean hagymaKivalasztva = chbHagyma.isSelected() == true;
        if (ananaszKivalasztva) {
            feltet += " - Ananász";
            if (sajtKivalasztva && hagymaKivalasztva) {
                feltet += "\n - Sajt\n - Hagyma";
            }
            else if (sajtKivalasztva) {
                feltet += "\n - Sajt";
            }
            else if (hagymaKivalasztva) {
                feltet += "\n - Hagyma";
            }
        }
        else if (sajtKivalasztva) {
            feltet += " - Sajt";
            if (hagymaKivalasztva) {
                feltet += "\n - Hagyma";
            }
        }
        else if (hagymaKivalasztva) {
            feltet += " - Hagyma";
        }
        return feltet;}
}
