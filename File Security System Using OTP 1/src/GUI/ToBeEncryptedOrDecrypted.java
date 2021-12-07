package GUI;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ajeet
 */
public class ToBeEncryptedOrDecrypted extends javax.swing.JFrame
{

    private File[] listOfFilesAndFolders;
    private String encryptOrDecrypt;
    
    public ToBeEncryptedOrDecrypted(File[] listOfFilesAndFolders, String encryptOrDecrypt)
    {
        this.listOfFilesAndFolders = listOfFilesAndFolders;
        this.encryptOrDecrypt = encryptOrDecrypt;
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        initComponents();
        setResizable(false);
        listOfFilesAndFoldersTextField.setEditable(false);
        
        if(encryptOrDecrypt.equalsIgnoreCase("encrypt"))
        {
            encryptOrDecryptButton.setText("ENCRYPT");
            heading.setText("List of files/folders to be encrypted:");
        }
        else if(encryptOrDecrypt.equalsIgnoreCase("decrypt"))
        {
            encryptOrDecryptButton.setText("DECRYPT");
            heading.setText("List of files/folders to be decrypted:");
        }
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                JFrame frame = (JFrame)e.getSource();
                Toolkit.getDefaultToolkit().beep();
                int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?", "Exit Application", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION)
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        
        displayListOfFilesInTheTextField();
        getRootPane().setDefaultButton(encryptOrDecryptButton);
        
    }
    
    private void displayListOfFilesInTheTextField()
    {
        for(Integer i=0, j=1; i < listOfFilesAndFolders.length; i++, j++)
        {
            listOfFilesAndFoldersTextField.append(j.toString()+". "+listOfFilesAndFolders[i].getName()+"\n");
            listOfFilesAndFoldersTextField.append(listOfFilesAndFolders[i].getAbsolutePath()+"\n\n");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOfFilesAndFoldersTextField = new javax.swing.JTextArea();
        reSelectFilesButton = new javax.swing.JButton();
        addMoreFilesButton = new javax.swing.JButton();
        encryptOrDecryptButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        heading.setText("List of files/folders to be encrypted:");

        listOfFilesAndFoldersTextField.setColumns(20);
        listOfFilesAndFoldersTextField.setRows(5);
        jScrollPane1.setViewportView(listOfFilesAndFoldersTextField);

        reSelectFilesButton.setText("Forget This List & Re-Select Files");
        reSelectFilesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reSelectFilesButtonActionPerformed(evt);
            }
        });

        addMoreFilesButton.setText("Add More Files To Existing");
        addMoreFilesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoreFilesButtonActionPerformed(evt);
            }
        });

        encryptOrDecryptButton.setFont(new java.awt.Font("AR JULIAN", 1, 24)); // NOI18N
        encryptOrDecryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptOrDecryptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addMoreFilesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(encryptOrDecryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(reSelectFilesButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(heading)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMoreFilesButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reSelectFilesButton)
                        .addComponent(encryptOrDecryptButton)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMoreFilesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addMoreFilesButtonActionPerformed
    {//GEN-HEADEREND:event_addMoreFilesButtonActionPerformed
        
        for(File file:listOfFilesAndFolders)
        {
            System.out.println(file);
        }
        
        new FileChooser(encryptOrDecrypt, listOfFilesAndFolders).setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_addMoreFilesButtonActionPerformed

    private void encryptOrDecryptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_encryptOrDecryptButtonActionPerformed
    {//GEN-HEADEREND:event_encryptOrDecryptButtonActionPerformed
        setVisible(false);
        dispose();
        if(encryptOrDecrypt.equalsIgnoreCase("encrypt"))
        {
            new PasswordTakerForEncryption(listOfFilesAndFolders).setVisible(true);
        }
        else if(encryptOrDecrypt.equalsIgnoreCase("decrypt"))
        {
            new PasswordTakerForDecryption(listOfFilesAndFolders).setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_encryptOrDecryptButtonActionPerformed

    private void reSelectFilesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_reSelectFilesButtonActionPerformed
    {//GEN-HEADEREND:event_reSelectFilesButtonActionPerformed
        new FileChooser(encryptOrDecrypt).setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_reSelectFilesButtonActionPerformed
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMoreFilesButton;
    private javax.swing.JButton encryptOrDecryptButton;
    private javax.swing.JLabel heading;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listOfFilesAndFoldersTextField;
    private javax.swing.JButton reSelectFilesButton;
    // End of variables declaration//GEN-END:variables
}
