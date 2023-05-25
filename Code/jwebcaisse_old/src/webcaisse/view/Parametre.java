package webcaisse.view;

import webcaisse.model.Configuration;
import webcaisse.DAO.ConfigDAO;
import webcaisse.model.Utilisateur;

public class Parametre extends javax.swing.JDialog {

   private final Configuration config;
   private final Utilisateur utConnect;
    /**
     * Creates new form Parametre
     */
    public Parametre(Utilisateur utilisateur) {
        this.utConnect = utilisateur;
        this.config = ConfigDAO.getConfiguration();
        initComponents();
        uiMailProtocol.setText(config.getMailProtocol());
        uiMailHost.setText(config.getMailHost());
        uiMailPort.setText(config.getMailPort());
        uiMailUser.setText(config.getMailUser());
        uiMailMP.setText(config.getMailPass());
        uiSgbdSys.setSelectedItem(config.getSgbdSys());
        uiSgbdDB.setText(config.getSgbdDb());
        uiSgbdHost.setText(config.getSgbdHost());
        uiSgbdPort.setText(config.getSgbdPort());
        uiSgbdUser.setText(config.getSgbdUser());
        uiSgbdMP.setText(config.getSgbdPass());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Entete = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uiMailProtocol = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        uiMailHost = new javax.swing.JTextField();
        uiMailPort = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        uiMailUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        uiMailMP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        uiSgbdMP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        uiSgbdUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        uiSgbdPort = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        uiSgbdHost = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        uiSgbdDB = new javax.swing.JTextField();
        uiLabelSys = new javax.swing.JLabel();
        uiSgbdSys = new javax.swing.JComboBox<>();
        Abandonner = new javax.swing.JButton();
        Valider = new javax.swing.JButton();
        uiBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("view.Parametre");
        setMinimumSize(new java.awt.Dimension(700, 470));
        setModal(true);
        setName("Form"); // NOI18N
        getContentPane().setLayout(null);

        Entete.setBackground(new java.awt.Color(255,255,255,120));
        Entete.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Entete.setForeground(new java.awt.Color(255, 0, 0));
        Entete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/java_64.png"))); // NOI18N
        Entete.setText("Paramètres de l'application");
        Entete.setName("Entete"); // NOI18N
        Entete.setOpaque(true);
        getContentPane().add(Entete);
        Entete.setBounds(0, 0, 700, 79);

        jTabbedPane1.setBackground(new java.awt.Color(238,238,238,10));
        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255,255,255,120));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serveur SMTP :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 220, 49));
        jLabel1.setText("Protocole :");
        jLabel1.setName("jLabel1"); // NOI18N

        uiMailProtocol.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uiMailProtocol.setText("smtp");
        uiMailProtocol.setName("uiMailProtocol"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 220, 49));
        jLabel2.setText("Hôte :");
        jLabel2.setName("jLabel2"); // NOI18N

        uiMailHost.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uiMailHost.setText("smtp");
        uiMailHost.setName("uiMailHost"); // NOI18N

        uiMailPort.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uiMailPort.setText("smtp");
        uiMailPort.setName("uiMailPort"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 220, 49));
        jLabel3.setText("Port :");
        jLabel3.setName("jLabel3"); // NOI18N

        uiMailUser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uiMailUser.setText("smtp");
        uiMailUser.setName("uiMailUser"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(252, 220, 49));
        jLabel4.setText("Utilisateur :");
        jLabel4.setName("jLabel4"); // NOI18N

        uiMailMP.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uiMailMP.setText("smtp");
        uiMailMP.setName("uiMailMP"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(252, 220, 49));
        jLabel5.setText("Mot de passe :");
        jLabel5.setName("jLabel5"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uiMailMP, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiMailUser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiMailProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiMailPort, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiMailHost, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uiMailProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uiMailHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(uiMailPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(uiMailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(uiMailMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><p style=\"font-size:12\">Serveur de messagerie</p></html>", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255,255,255,120));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serveur MySQL :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(252, 220, 49));
        jLabel6.setText("Mot de passe :");
        jLabel6.setName("jLabel6"); // NOI18N

        uiSgbdMP.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uiSgbdMP.setText("smtp");
        uiSgbdMP.setName("uiSgbdMP"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(252, 220, 49));
        jLabel7.setText("Utilisateur :");
        jLabel7.setName("jLabel7"); // NOI18N

        uiSgbdUser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uiSgbdUser.setText("smtp");
        uiSgbdUser.setName("uiSgbdUser"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(252, 220, 49));
        jLabel8.setText("Port :");
        jLabel8.setName("jLabel8"); // NOI18N

        uiSgbdPort.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uiSgbdPort.setText("smtp");
        uiSgbdPort.setName("uiSgbdPort"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(252, 220, 49));
        jLabel9.setText("Hôte :");
        jLabel9.setName("jLabel9"); // NOI18N

        uiSgbdHost.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uiSgbdHost.setText("smtp");
        uiSgbdHost.setName("uiSgbdHost"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(252, 220, 49));
        jLabel10.setText("Base de données :");
        jLabel10.setName("jLabel10"); // NOI18N

        uiSgbdDB.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uiSgbdDB.setText("smtp");
        uiSgbdDB.setName("uiSgbdDB"); // NOI18N

        uiLabelSys.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        uiLabelSys.setForeground(new java.awt.Color(252, 220, 49));
        uiLabelSys.setText("S. G. B. D. R.");
        uiLabelSys.setName("uiLabelSys"); // NOI18N

        uiSgbdSys.setMaximumRowCount(2);
        uiSgbdSys.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mysql", "postgresql" }));
        uiSgbdSys.setName("uiSgbdSys"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uiSgbdMP, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uiSgbdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uiSgbdDB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uiSgbdPort, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uiSgbdHost, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(uiLabelSys)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uiSgbdSys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uiSgbdSys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiLabelSys, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(uiSgbdDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(uiSgbdHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(uiSgbdPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(uiSgbdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(uiSgbdMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><p style=\"font-size:12\">Base de données</p></html>", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("Serveur SGBD :");

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 85, 680, 280);

        Abandonner.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Abandonner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/escape_20.png"))); // NOI18N
        Abandonner.setText("Abandonner");
        Abandonner.setToolTipText("Sortir de la fenétre d'envoi");
        Abandonner.setName("Abandonner"); // NOI18N
        Abandonner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbandonnerMouseClicked(evt);
            }
        });
        getContentPane().add(Abandonner);
        Abandonner.setBounds(542, 390, 132, 30);

        Valider.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Valider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/valid_20.png"))); // NOI18N
        Valider.setText("Valider");
        Valider.setToolTipText("Envoyer le mail à son destinataire");
        Valider.setName("Valider"); // NOI18N
        Valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValiderMouseClicked(evt);
            }
        });
        getContentPane().add(Valider);
        Valider.setBounds(12, 390, 101, 30);

        uiBackground.setBackground(new java.awt.Color(255,255,255,70));
        uiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/fec_dark.jpg"))); // NOI18N
        uiBackground.setMaximumSize(new java.awt.Dimension(700, 430));
        uiBackground.setMinimumSize(new java.awt.Dimension(700, 430));
        uiBackground.setName("uiBackground"); // NOI18N
        uiBackground.setPreferredSize(new java.awt.Dimension(700, 430));
        getContentPane().add(uiBackground);
        uiBackground.setBounds(0, 0, 700, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AbandonnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbandonnerMouseClicked
        this.dispose();
    }//GEN-LAST:event_AbandonnerMouseClicked

    private void ValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValiderMouseClicked
        // TODO add your handling code here:
        config.setMailProtocol(uiMailProtocol.getText().trim());
        config.setMailHost(uiMailHost.getText().trim());
        config.setMailPort(uiMailPort.getText().trim());
        config.setMailUser(uiMailUser.getText().trim());
        config.setMailPass(uiMailMP.getText().trim());
        config.setSgbdSys(uiSgbdSys.getSelectedItem().toString());
        config.setSgbdDb(uiSgbdDB.getText().trim());
        config.setSgbdHost(uiSgbdHost.getText().trim());
        config.setSgbdPort(uiSgbdPort.getText().trim());
        config.setSgbdUser(uiSgbdUser.getText().trim());
        config.setSgbdPass(uiSgbdMP.getText().trim());
        ConfigDAO.saveXMLFile(config);
    }//GEN-LAST:event_ValiderMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abandonner;
    private javax.swing.JLabel Entete;
    private javax.swing.JButton Valider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel uiBackground;
    private javax.swing.JLabel uiLabelSys;
    private javax.swing.JTextField uiMailHost;
    private javax.swing.JTextField uiMailMP;
    private javax.swing.JTextField uiMailPort;
    private javax.swing.JTextField uiMailProtocol;
    private javax.swing.JTextField uiMailUser;
    private javax.swing.JTextField uiSgbdDB;
    private javax.swing.JTextField uiSgbdHost;
    private javax.swing.JTextField uiSgbdMP;
    private javax.swing.JTextField uiSgbdPort;
    private javax.swing.JComboBox<String> uiSgbdSys;
    private javax.swing.JTextField uiSgbdUser;
    // End of variables declaration//GEN-END:variables
}
