package projectfiles.components;

public class CDetailedCheckboxGroup extends CFieldGroup {

    String header;
    int headerPlacement;
    String detailsLabel;
    int detailsPlacement;
    int choicesOrientation;
    String[] choices;

    public CDetailedCheckboxGroup(String header, int headerPlacement,
    String detailsLabel, int detailsPlacement, int choicesOrientation,
    String ... choices) throws Exception {
        super();
        this.header = header;
        this.headerPlacement = headerPlacement;
        this.detailsLabel = detailsLabel;
        this.detailsPlacement = detailsPlacement;
        // this.choicesOrientation = choicesOrientation
    }
}
