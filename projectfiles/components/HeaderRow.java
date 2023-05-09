package projectfiles.components;

import javax.swing.JLabel;

public class HeaderRow extends CRow {

    JLabel headerLabel;
    String text;

    public HeaderRow(String text) {
        super();
        this.text = text;
        
        this.headerLabel = new HeaderLabel(this.text);
        this.add(this.headerLabel);
    }
}
