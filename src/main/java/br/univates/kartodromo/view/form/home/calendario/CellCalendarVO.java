/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view.form.home.calendario;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Arthur
 */
public class CellCalendarVO extends JButton {

    private Date date;
    private boolean title;
    private boolean isToday;

    public CellCalendarVO() {
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                actPerformed(evt);
            }
        });
    }

    public void currentMonth(boolean act) {
        if (act) {
            setForeground(new Color(204, 204, 204));
        } else {
            setForeground(new Color(35, 40, 44));
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (title) {
            grphcs.setColor(new Color(255, 211, 0));
            grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        }

        if (isToday) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255, 211, 0));
            int x = getWidth() / 2 - 10;
            int y = getHeight() / 2 - 10;
            g2.fillRoundRect(x, y, 20, 20, 100, 100);
        }

        super.paintComponent(grphcs);
    }

    private void actPerformed(MouseEvent evt) {
        if (!title) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);

            new FormAgenda(cal, this.getLocationOnScreen()).setVisible(true);
        }
    }

    public void setAsToday() {
        isToday = true;
        setForeground(new Color(21, 25, 28));
    }

    public void asTitle() {
        title = true;
    }

    public boolean isTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
