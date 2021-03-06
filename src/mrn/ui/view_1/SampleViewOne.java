package mrn.ui.view_1;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import mrn.data.Model;
import mrn.ui.base.View;


public class SampleViewOne extends View<Model> {

    private GridPane layout;
    public Button btn;
    public Label label;


    public SampleViewOne(Model model) {
        this.setModel(model);
        this.setController(new ControllerOne(model, this));
    }

    public GridPane getRoot() {
        return this.layout;
    }

    @Override
    protected void init() {
        layout = new GridPane();
        btn = new Button("Click me");
        label = new Label("Value: ");

        layout.add(label, 0, 0);
        layout.add(btn, 0, 1);
    }

    public void update() {
        label.setText("Value: " + model.getValue());
    }
}
