/*                                             
 *Copyright 2007, 2011 CCLS Columbia University (USA), LIFO University of Orl��ans (France), BRGM (France)
 *
 *Authors: Cyril Nortet, Xiangrong Kong, Ansaf Salleb-Aouissi, Christel Vrain, Daniel Cassard
 *
 *This file is part of QuantMiner.
 *
 *QuantMiner is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or any later version.
 *
 *QuantMiner is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License along with QuantMiner.  If not, see <http://www.gnu.org/licenses/>.
 */
package src.interfaceGraphique;

import src.tools.*;


public class PanneauDefaut extends PanneauBase { //main window picture QuantMiner.png
    
    /** Creates new form PanneauDefaut */
    public PanneauDefaut() {
        initComponents();
        
        jLabelFond.setIcon(new javax.swing.ImageIcon( ENV.REPERTOIRE_RESSOURCES + "QuantMiner.png" )); 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jLabelFond = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jLabelFond.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabelFond, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFond;
    // End of variables declaration//GEN-END:variables
    
}
