/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtering;

import static filtering.Timer.state;
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author mariscalyu_SD2082
 */
public class Quadrant extends javax.swing.JFrame {

    static int secondsCountDown = 10;
    static int secondsCountUp = 0;
    static int mscnd = 0;
    static int scnd = 0;
    static int mint = 0;
    static int hours = 0;

    static boolean state = true;

    /**
     * Creates new form Quadrant
     */
    public Quadrant() {
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
        jLabel1 = new javax.swing.JLabel();
        hr = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        milsec = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        currentTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CountDown = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        down = new javax.swing.JLabel();
        star = new javax.swing.JButton();
        downStop = new javax.swing.JButton();
        downReset = new javax.swing.JButton();
        CountUp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        up = new javax.swing.JLabel();
        upStart = new javax.swing.JButton();
        upStop = new javax.swing.JButton();
        upReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 160, 122));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("Stopwatch");

        hr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hr.setText("00 :");

        min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        min.setText("00 :");

        sec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sec.setText("00 :");

        milsec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        milsec.setText("000 ");

        start.setText("start");
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        stop.setText("stop");
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopMouseClicked(evt);
            }
        });

        reset.setText("reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(hr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(stop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(min)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sec))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(milsec)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hr, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(milsec))
                .addGap(18, 18, 18)
                .addComponent(start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 192, 203));

        currentTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentTimeActionPerformed(evt);
            }
        });
        currentTime.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                currentTimePropertyChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setText("Current Time");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(currentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(61, 61, 61)
                .addComponent(currentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CountDown.setBackground(new java.awt.Color(245, 222, 179));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("Count Down");

        down.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        down.setText(" 10");

        star.setText("start");
        star.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                starMouseClicked(evt);
            }
        });

        downStop.setText("stop");
        downStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downStopMouseClicked(evt);
            }
        });

        downReset.setText("reset");
        downReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CountDownLayout = new javax.swing.GroupLayout(CountDown);
        CountDown.setLayout(CountDownLayout);
        CountDownLayout.setHorizontalGroup(
            CountDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountDownLayout.createSequentialGroup()
                .addGroup(CountDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CountDownLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2))
                    .addGroup(CountDownLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(CountDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(star, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(downStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(downReset, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                    .addGroup(CountDownLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CountDownLayout.setVerticalGroup(
            CountDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountDownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(star)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downStop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downReset)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        CountUp.setBackground(new java.awt.Color(221, 160, 221));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setText("Count Up");

        up.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        up.setText("0");

        upStart.setText("start");
        upStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upStartMouseClicked(evt);
            }
        });

        upStop.setText("stop");
        upStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upStopMouseClicked(evt);
            }
        });
        upStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upStopActionPerformed(evt);
            }
        });

        upReset.setText("reset");
        upReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CountUpLayout = new javax.swing.GroupLayout(CountUp);
        CountUp.setLayout(CountUpLayout);
        CountUpLayout.setHorizontalGroup(
            CountUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountUpLayout.createSequentialGroup()
                .addGroup(CountUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CountUpLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3))
                    .addGroup(CountUpLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(CountUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upStop, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upStart, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upReset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CountUpLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CountUpLayout.setVerticalGroup(
            CountUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(upStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upStop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CountDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CountUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CountDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CountUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    private void currentTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentTimeActionPerformed

    private void currentTimePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_currentTimePropertyChange
        // TODO add your handling code here:
        Thread th = new Thread() {
            public void run() {
                try {
                    for (;;) {
                        Calendar c = new GregorianCalendar();
                        int day = c.get(Calendar.DAY_OF_MONTH);
                        int month = c.get(Calendar.MONTH);
                        int year = c.get(Calendar.YEAR);

                        int second = c.get(Calendar.SECOND);
                        int min = c.get(Calendar.MINUTE);
                        int hour = c.get(Calendar.HOUR);
                        int am_pm = c.get(Calendar.AM_PM);

                        String d_n = "";
                        if (am_pm == 1) {
                            d_n = "PM";
                        } else {
                            d_n = "AM";
                        }
                        currentTime.setText("               " + hour + ":" + min + ":" + second + " " + d_n);
                        sleep(1000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        th.start();

    }//GEN-LAST:event_currentTimePropertyChange

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        // TODO add your handling code here:
        state = true;

        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (state == true) {
                        try {
                            if (mscnd > 999) {
                                mscnd = 0;
                                scnd++;

                            }
                            if (scnd > 59) {
                                mscnd = 0;
                                scnd = 0;
                                mint++;
                            }
                            if (mint > 59) {
                                mscnd = 0;
                                scnd = 0;
                                mint = 0;
                                hours++;
                            }
                            milsec.setText(" : " + mscnd);
                            mscnd++;
                            sec.setText(" : " + scnd);
//                        scnd++;
                            min.setText(" : " + mint);
//                        mint++;
                            hr.setText("" + hours);
//                        hours++;

                            Thread.sleep(1);
                        } catch (Exception e) {

                        }
                    } else {
                        break;
                    }
                }
            }
        };
        t.start();
    }//GEN-LAST:event_startMouseClicked

    private void stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseClicked
        // TODO add your handling code here:
        state = false;
    }//GEN-LAST:event_stopMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:
        state = false;
        mscnd = 000;
        scnd = 00;
        mint = 00;
        hours = 00;

        hr.setText("" + hours);
        min.setText("" + hours);
        sec.setText("" + hours);
        milsec.setText("" + hours);


    }//GEN-LAST:event_resetMouseClicked

    private void starMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_starMouseClicked
        // TODO add your handling code here:
        state = true;

        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (state == true) {
                        try {
                            sleep(1000);
                            if (secondsCountDown != 0) {;
                                secondsCountDown--;
                            } else if (secondsCountDown == 0) {
                                CountDown.setBackground(new Color(221, 160, 221));
                            }
                            down.setText(" " + secondsCountDown);

                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        t.start();
    }//GEN-LAST:event_starMouseClicked

    private void downStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downStopMouseClicked
        // TODO add your handling code here:
        state = false;
    }//GEN-LAST:event_downStopMouseClicked

    private void downResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downResetMouseClicked
        // TODO add your handling code here:
        state = false;
        CountDown.setBackground(new Color(245, 222, 179));
        secondsCountDown = 10;
        down.setText(" " + secondsCountDown);
    }//GEN-LAST:event_downResetMouseClicked

    private void upStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upStopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upStopActionPerformed

    private void upStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upStartMouseClicked
        // TODO add your handling code here:
        state = true;

        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (state == true) {
                        try {
                            sleep(1000);
                            if (secondsCountUp != 10) {;
                                secondsCountUp++;
                            } else if (secondsCountUp == 10) {
                                CountUp.setBackground(new Color(245, 222, 179));
                            }
                            up.setText(" " + secondsCountUp);

                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        t.start();

    }//GEN-LAST:event_upStartMouseClicked

    private void upStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upStopMouseClicked
        // TODO add your handling code here:
        state = false;
    }//GEN-LAST:event_upStopMouseClicked

    private void upResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upResetMouseClicked
        // TODO add your handling code here:
        state = false;
        CountUp.setBackground(new Color(221, 160, 221));
        secondsCountUp = 0;
        up.setText(" " + secondsCountUp);
    }//GEN-LAST:event_upResetMouseClicked

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
            java.util.logging.Logger.getLogger(Quadrant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quadrant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quadrant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quadrant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quadrant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CountDown;
    private javax.swing.JPanel CountUp;
    private javax.swing.JTextField currentTime;
    private javax.swing.JLabel down;
    private javax.swing.JButton downReset;
    private javax.swing.JButton downStop;
    private javax.swing.JLabel hr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel milsec;
    private javax.swing.JLabel min;
    private javax.swing.JButton reset;
    private javax.swing.JLabel sec;
    private javax.swing.JButton star;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    private javax.swing.JLabel up;
    private javax.swing.JButton upReset;
    private javax.swing.JButton upStart;
    private javax.swing.JButton upStop;
    // End of variables declaration//GEN-END:variables
}
