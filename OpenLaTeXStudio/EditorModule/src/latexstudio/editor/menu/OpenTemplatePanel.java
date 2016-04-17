package latexstudio.editor.menu;

import java.awt.Desktop;
import java.awt.Window;
import java.io.IOException;
import java.net.URI;
import javax.swing.DefaultListModel;
import latexstudio.editor.EditorTopComponent;
import latexstudio.editor.TopComponentFactory;
import org.openide.util.Exceptions;

/**

 @author Maciej
 */
public class OpenTemplatePanel extends javax.swing.JPanel {

    private final EditorTopComponent etc = new TopComponentFactory<EditorTopComponent>()
            .getTopComponent(EditorTopComponent.class.getSimpleName());

    private Window parent;
    private DefaultListModel<Template> listModel;

    /**
     Creates new form OpenTemplatePanel
     */
    public OpenTemplatePanel(Window parent, DefaultListModel<Template> listModel) {
        this.parent = parent;
        this.listModel = listModel;
        initComponents();
    }

    /**
     This method is called from within the constructor to initialize the form.
     WARNING: Do NOT modify this code. The content of this method is always
     regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();
        sourceField = new javax.swing.JTextField();
        loadTemplateButton = new javax.swing.JButton();
        openSourcePageButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        templatesList = new javax.swing.JList<Template>();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(200);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(OpenTemplatePanel.class, "OpenTemplatePanel.descriptionArea.border.title"))); // NOI18N

        descriptionArea.setEditable(false);
        descriptionArea.setColumns(20);
        descriptionArea.setLineWrap(true);
        descriptionArea.setRows(5);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setBorder(null);
        jScrollPane2.setViewportView(descriptionArea);

        sourceField.setEditable(false);
        sourceField.setText(org.openide.util.NbBundle.getMessage(OpenTemplatePanel.class, "OpenTemplatePanel.sourceField.text")); // NOI18N
        sourceField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(OpenTemplatePanel.class, "OpenTemplatePanel.sourceField.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(loadTemplateButton, org.openide.util.NbBundle.getMessage(OpenTemplatePanel.class, "OpenTemplatePanel.loadTemplateButton.text")); // NOI18N
        loadTemplateButton.setMaximumSize(new java.awt.Dimension(134, 32));
        loadTemplateButton.setMinimumSize(new java.awt.Dimension(134, 32));
        loadTemplateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTemplateButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(openSourcePageButton, org.openide.util.NbBundle.getMessage(OpenTemplatePanel.class, "OpenTemplatePanel.openSourcePageButton.text")); // NOI18N
        openSourcePageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openSourcePageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(openSourcePageButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadTemplateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sourceField)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sourceField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(openSourcePageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(loadTemplateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );

        jSplitPane1.setRightComponent(jPanel2);

        templatesList.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(OpenTemplatePanel.class, "OpenTemplatePanel.templatesList.border.title"))); // NOI18N
        templatesList.setModel(listModel);
        templatesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        templatesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                templatesListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(templatesList);
        templatesList.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(OpenTemplatePanel.class, "OpenTemplatePanel.templatesList.AccessibleContext.accessibleDescription")); // NOI18N

        jSplitPane1.setLeftComponent(jScrollPane3);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void loadTemplateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTemplateButtonActionPerformed
        OpenFile.openFile(etc, getClass().getResourceAsStream(templatesList.getSelectedValue().getPath()));
        parent.dispose();
    }//GEN-LAST:event_loadTemplateButtonActionPerformed

    private void templatesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_templatesListValueChanged
        descriptionArea.setText(templatesList.getSelectedValue().getDescription());
        sourceField.setText(templatesList.getSelectedValue().getSource());
    }//GEN-LAST:event_templatesListValueChanged

    private void openSourcePageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openSourcePageButtonActionPerformed
        try {
            Desktop.getDesktop().browse(URI.create(templatesList.getSelectedValue().getSource()));
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_openSourcePageButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loadTemplateButton;
    private javax.swing.JButton openSourcePageButton;
    private javax.swing.JTextField sourceField;
    private javax.swing.JList<Template> templatesList;
    // End of variables declaration//GEN-END:variables
}
