package projectfiles.components;


import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class CMultipleChoiceGroup extends CFieldGroup {

    /**
     * The text string indicating the header of the multiple choices.
     */
    String prompt;

    /** 
     * The array of multiple choices.
     */
    String[] choices;

    /**
     * The component serving as the header of this multiple choice group.
     */
    JLabel promptComponent;

    /**
     * The component serving as the container of the radio buttons.
     */
    CFieldGroup choicesGroupComponent;

    /**
     * The button group containing the arbitrary number of radio buttons of this
     * multiple choice group.
     */
    ButtonGroup choicesGroup;

    /**
     * Creates a {@code}CMultipleChoiceGroup{@code} object with the specified
     * prompt header text and the multiple choices.
     * 
     * @param prompt - the text string indicating the header of the multiple
     * choices
     * @param choices - the array of multiple choices
     */
    public CMultipleChoiceGroup(String prompt, String ... choices) throws Exception {
        super();
        this.prompt = prompt;
        this.choices = choices;
        this.orientation = CFormField.VERTICAL;

        this.constructComponents();
    }

    @Override
    void constructComponents() throws Exception {
        this.promptComponent = new JLabel(this.prompt);
        this.choicesGroupComponent = new CFieldGroup(CFieldGroup.VERTICAL);
        this.choicesGroup = new ButtonGroup();

        for (String choice : this.choices) {
            CRadioButton choiceComponent = new CRadioButton(choice);
            this.choicesGroupComponent.add(choiceComponent);

            this.choicesGroup.add(choiceComponent);
        }

        this.add(this.promptComponent);
        this.add(this.choicesGroupComponent);
    }
}
