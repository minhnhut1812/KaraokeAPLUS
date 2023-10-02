package gui.swing;

import gui.event.EventMenu;
import gui.event.EventMenuSelect;
import gui.model.ModelMenu;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author HO MINH HAU
 */
public class MenuItem extends javax.swing.JPanel {



    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

  

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public EventMenuSelect getEventSelected() {
        return eventSelected;
    }

    public void setEventSelected(EventMenuSelect eventSelected) {
        this.eventSelected = eventSelected;
    }

    public int getIndex() {
        return index;
    }

    

    private float alpha;

    public void setMenu(ModelMenu menu) {
        this.menu = menu;
    }
    private ModelMenu menu;
    private boolean open;
    private EventMenuSelect eventSelected;
    private int index;

    public MenuItem(ModelMenu menu,EventMenu event, EventMenuSelect eventSelected, int index) {
        initComponents();
        this.menu = menu;
        this.eventSelected = eventSelected;
        this.index = index;
        setOpaque(false);
        setLayout(new MigLayout("wrap, fill, insets 0", "[fill]","[fill,40!]0[fill, 35!]"));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
