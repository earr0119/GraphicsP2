package graphics2;

import java.awt.Color;

public class Graphics extends javax.swing.JFrame {

    public Graphics() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    boolean flag = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLtitle = new javax.swing.JLabel();
        jLred = new javax.swing.JLabel();
        jLgreen = new javax.swing.JLabel();
        jLblue = new javax.swing.JLabel();
        txt_red = new javax.swing.JTextField();
        txt_green = new javax.swing.JTextField();
        txt_blue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLtitle.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLtitle.setText("Graphic");

        jLred.setText("Red:");

        jLgreen.setText("Green:");

        jLblue.setText("Blue:");

        txt_blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_blueActionPerformed(evt);
            }
        });

        jButton1.setText("Draw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLred, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_red, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_green))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_blue))
                    .addComponent(jLtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLred, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_red, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLgreen))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblue)
                    .addComponent(txt_blue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_blueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_blueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        flag = true;
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLblue;
    private javax.swing.JLabel jLgreen;
    private javax.swing.JLabel jLred;
    private javax.swing.JLabel jLtitle;
    private javax.swing.JTextField txt_blue;
    private javax.swing.JTextField txt_green;
    private javax.swing.JTextField txt_red;
    // End of variables declaration//GEN-END:variables

    public int maxValue(int red_value, int green_value, int blue_value) {
        if (red_value > green_value && red_value > blue_value) {
            return red_value;
        } else if (green_value > blue_value) {
            return green_value;
        } else {
            return blue_value;
        }
    }
    
    public void paint(java.awt.Graphics g){
        super.paint(g);
        if (flag == true){
            
            String string_red = txt_red.getText();
            String string_green = txt_green.getText();
            String string_blue = txt_blue.getText();
            
            int int_red = Integer.parseInt(string_red);
            int int_green = Integer.parseInt(string_green);
            int int_blue = Integer.parseInt(string_blue);
            
            int max_Value = maxValue(int_red, int_green, int_blue);
            
            int large_Red = int_red * 400 / max_Value;
            int large_Green = int_green * 400 / max_Value;
            int large_Blue = int_blue * 400 / max_Value;
            
            g.setColor(new Color(133, 0, 0));
            g.fillRect(100, 100, large_Red, 40);
            g.drawString("Red", 10, 125);
            
            g.setColor(new Color(0, 133, 0));
            g.fillRect(100, 150, large_Green, 40);
            g.drawString("Green", 10, 175);
            
            g.setColor(new Color(0, 0, 133));
            g.fillRect(100, 200, large_Blue, 40);
            g.drawString("Blue", 10, 225);
        }
    }
}
