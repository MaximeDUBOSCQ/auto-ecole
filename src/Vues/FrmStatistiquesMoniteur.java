/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlGraphique;
import Controlers.CtrlUser;
import Entities.User;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import Controlers.CtrlLecon;
import Entities.ChiffreAffaireParCategorie;
import Vues.FrmInterfacePrincipale;
import static Vues.FrmStatistiquesEleve.unUser;
import java.awt.BorderLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author maxdb
 */
public class FrmStatistiquesMoniteur extends javax.swing.JFrame {
    
    SimpleDateFormat sdf;
    static User unUser;
    CtrlUser ctrlUser;
    private CtrlLecon ctrlLecon;
    private CtrlGraphique ctrlGraphique;
    
    /**
     * Creates new form FrmStatistiqueMoniteur
     */
    public FrmStatistiquesMoniteur(User unUser) {
        this.unUser = unUser;
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

        dcDebut = new com.toedter.calendar.JDateChooser();
        dcFin = new com.toedter.calendar.JDateChooser();
        lblDebut = new javax.swing.JLabel();
        lblFin = new javax.swing.JLabel();
        lblCA = new javax.swing.JLabel();
        lblNbrLecon = new javax.swing.JLabel();
        txtCA = new javax.swing.JTextField();
        txtNbLecon = new javax.swing.JTextField();
        lblRetour = new javax.swing.JLabel();
        lblTitre = new javax.swing.JLabel();
        lblLogoRetour = new javax.swing.JLabel();
        pnlGraphique = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto NMN");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblDebut.setText("Début de la période");

        lblFin.setText("Fin de la période");

        lblCA.setText("Chiffre d'affaire");

        lblNbrLecon.setText("Nombre de leçons");

        lblRetour.setForeground(new java.awt.Color(0, 51, 255));
        lblRetour.setText("Retour");
        lblRetour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRetourMouseClicked(evt);
            }
        });

        lblTitre.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Statistiques");

        lblLogoRetour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogoRetour.setPreferredSize(new java.awt.Dimension(25, 25));
        lblLogoRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoRetourMouseClicked(evt);
            }
        });

        pnlGraphique.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlGraphique.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGraphique, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCA)
                                .addGap(18, 18, 18)
                                .addComponent(txtCA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblNbrLecon)
                                .addGap(18, 18, 18)
                                .addComponent(txtNbLecon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDebut)
                                .addGap(18, 18, 18)
                                .addComponent(dcDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblFin)
                                .addGap(18, 18, 18)
                                .addComponent(dcFin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(15, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogoRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lblRetour))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(lblTitre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGraphique, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogoRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblRetour))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDebut))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFin)
                            .addComponent(dcFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCA)
                            .addComponent(txtCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNbrLecon)
                            .addComponent(txtNbLecon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrlLecon = new CtrlLecon();
        ctrlGraphique = new CtrlGraphique();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        dcDebut.setDateFormatString("dd/MM/yyyy");
        dcFin.setDateFormatString("dd/MM/yyyy");
        java.util.Date date = new java.util.Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -7);
        dcDebut.setDate(calendar.getTime());
        dcFin.setDate(date);
        
        txtCA.setEditable(false);
        txtNbLecon.setEditable(false);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/retour.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(lblLogoRetour.getWidth(), lblLogoRetour.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(img);
        lblLogoRetour.setIcon(ic);
        
        actualiserAffichage();
        
        
        
        dcDebut.getDateEditor().addPropertyChangeListener(
        e -> {
            actualiserAffichage();
        });
        
        dcFin.getDateEditor().addPropertyChangeListener(
        e -> {
            actualiserAffichage();
        });
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        retour();
    }//GEN-LAST:event_formWindowClosing

    private void lblRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetourMouseClicked
        retour();
    }//GEN-LAST:event_lblRetourMouseClicked

    private void lblLogoRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoRetourMouseClicked
        retour();
    }//GEN-LAST:event_lblLogoRetourMouseClicked

    
    private void actualiserAffichage() {
        if (dcDebut.getDate() != null && dcFin.getDate() != null) {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(dcDebut.getDate());
            String date2 = sdf.format(dcFin.getDate());
                       
            double CA = ctrlLecon.GetChiffreDAffaire(unUser.getCodeUser(), date1, date2);
            int TotalLecon = ctrlLecon.GetNbLeconTotalMoniteur(unUser.getCodeUser(), date1, date2);
            txtCA.setText(String.valueOf(CA)+" €");
            txtNbLecon.setText(String.valueOf(TotalLecon));
            
            DefaultCategoryDataset donnees = new DefaultCategoryDataset();
            ArrayList<ChiffreAffaireParCategorie> lesValeurs = new ArrayList<>();
            lesValeurs = ctrlGraphique.GetDatasGraphiqueMoniteur(unUser.getCodeUser(), date1, date2);
            for (ChiffreAffaireParCategorie uneValeur : lesValeurs) {
                donnees.setValue( uneValeur.getChiffreAffaire(), "", uneValeur.getLibelleCategorie());
            }
            JFreeChart chart1 = ChartFactory.createBarChart(
                      "Chiffre d'affaire par catégorie",
             "Nom de la catégorie",
               "Chiffre d'affaire",
                    donnees,
                 PlotOrientation.VERTICAL, false, true, false);
            ChartPanel graph = new ChartPanel(chart1);
            pnlGraphique.removeAll();
            pnlGraphique.add(graph, BorderLayout.CENTER);
            pnlGraphique.validate();
        }
    }
    
    private void retour() {
        FrmInterfacePrincipale frm = new FrmInterfacePrincipale(unUser);
        this.setVisible(false);
        frm.setVisible(true);
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
            java.util.logging.Logger.getLogger(FrmStatistiquesMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStatistiquesMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStatistiquesMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStatistiquesMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStatistiquesMoniteur(unUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dcDebut;
    private com.toedter.calendar.JDateChooser dcFin;
    private javax.swing.JLabel lblCA;
    private javax.swing.JLabel lblDebut;
    private javax.swing.JLabel lblFin;
    private javax.swing.JLabel lblLogoRetour;
    private javax.swing.JLabel lblNbrLecon;
    private javax.swing.JLabel lblRetour;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JPanel pnlGraphique;
    private javax.swing.JTextField txtCA;
    private javax.swing.JTextField txtNbLecon;
    // End of variables declaration//GEN-END:variables
}
