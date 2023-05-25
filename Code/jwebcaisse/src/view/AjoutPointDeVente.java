/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.PointDeVenteDAO;
import javax.swing.JOptionPane;
import model.Client;
import model.PointDeVente;

/**
 *
 * @author c.denys
 */
public class AjoutPointDeVente extends javax.swing.JFrame {

    /**
     * Creates new form connection
     */
    private final Client client;

    public AjoutPointDeVente(Client client) {
        this.client = client;
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

        jPanel2 = new javax.swing.JPanel();
        Adresse = new javax.swing.JTextField();
        CodePostal = new javax.swing.JTextField();
        AjoutPointDeVente = new javax.swing.JButton();
        Ville = new javax.swing.JTextField();
        Nom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LogoRetour = new javax.swing.JLabel();
        LabelRetour = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        UserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Adresse.setText("Adresse");
        Adresse.setToolTipText("");
        Adresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdresseActionPerformed(evt);
            }
        });

        CodePostal.setText("Code postal");

        AjoutPointDeVente.setText("Ajouter le point de vente");
        AjoutPointDeVente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutPointDeVenteActionPerformed(evt);
            }
        });

        Ville.setText("Ville");
        Ville.setToolTipText("");
        Ville.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VilleActionPerformed(evt);
            }
        });

        Nom.setText("Nom");
        Nom.setToolTipText("");
        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Point de vente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ville, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nom)
                            .addComponent(CodePostal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                            .addComponent(Adresse)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(AjoutPointDeVente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(AjoutPointDeVente)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 40, 670, 480);

        LogoRetour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/escape_20.png"))); // NOI18N
        LogoRetour.setMaximumSize(new java.awt.Dimension(20, 22));
        LogoRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoRetourMouseClicked(evt);
            }
        });
        getContentPane().add(LogoRetour);
        LogoRetour.setBounds(10, 10, 20, 20);

        LabelRetour.setText("Retour");
        getContentPane().add(LabelRetour);
        LabelRetour.setBounds(40, 10, 37, 16);

        Logout.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Logout.setText("Se déconnecter");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout);
        Logout.setBounds(570, 10, 110, 20);

        UserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserName.setText(client.getNom() + " " + client.getPrenom());
        getContentPane().add(UserName);
        UserName.setBounds(460, 10, 110, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdresseActionPerformed

    private void VilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VilleActionPerformed

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed

    private void LogoRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoRetourMouseClicked
        Accueil accueil = new Accueil();
        accueil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoRetourMouseClicked

    private void AjoutPointDeVenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutPointDeVenteActionPerformed
        // Récupération des données du formulaire
        String adresse = Adresse.getText();
        int codePostal = Integer.parseInt(CodePostal.getText());
        String ville = Ville.getText();
        String nom = Nom.getText();

        // Création d'un objet PointDeVente
        PointDeVente pointDeVente = new PointDeVente(0, 0, client.getIdClient(), adresse, codePostal, ville, nom);

        // Insertion du point de vente dans la base de données
        try {
            PointDeVenteDAO pointDeVenteDAO = new PointDeVenteDAO();
            pointDeVenteDAO.create(pointDeVente);

            // Fermeture de la fenêtre AjoutPointDeVente et ouverture de la fenêtre AccueilPostLogin
            AccueilPostLogin accueilPostLogin = new AccueilPostLogin(client);
            accueilPostLogin.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            // Affichage d'une popup en cas d'erreur d'ajout du point de vente
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout du point de vente : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AjoutPointDeVenteActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Accueil accueil = new Accueil();
        accueil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutPointDeVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutPointDeVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutPointDeVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutPointDeVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Client client) {
                new AjoutPointDeVente(client).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adresse;
    private javax.swing.JButton AjoutPointDeVente;
    private javax.swing.JTextField CodePostal;
    private javax.swing.JLabel LabelRetour;
    private javax.swing.JLabel LogoRetour;
    private javax.swing.JButton Logout;
    private javax.swing.JTextField Nom;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField Ville;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
