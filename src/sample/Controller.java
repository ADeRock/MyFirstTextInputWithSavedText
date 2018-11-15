package sample;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;


public class Controller {
    public ListView<Label> NameListView;
    public ListView<Label> AgeListView;
    public ListView<Label> HobbyListView;
    public ListView<Label> SubjectListView;
    public ListView<Label> FoodListView;
    public ListView<Label> MonthListView;
    public TextField Month0;
    public TextField Age0;
    public TextField Name0;
    public TextField Food0;
    public TextField Subject0;
    public TextField Hobby0;

    private Model model;

    public void initialize() {
        System.out.println("Controller initialize");
        try {
            File savedText = new File(getClass().getResource("SavedText.txt").toURI());
            if (savedText.exists()) {
                BufferedReader input = new BufferedReader(new FileReader(savedText));
                model = new Model(input);
                input.close();
            } else {
                model = new Model();
            }
        } catch (Exception e) {
            System.out.println("Controller initialize EXCEPTION");
            model = new Model();
        }
        Month0.setText(model.Month0Text);
        Age0.setText(model.Age0Text);
        Name0.setText(model.Name0Text);
        Food0.setText(model.Food0Text);
        Subject0.setText(model.Subject0Text);
        Hobby0.setText(model.Hobby0Text);

        ArrayList NameListViewTexts = model.getNameListViewTexts();
        for (int i = 0; i < NameListViewTexts.size(); i++) {
            NameListView.getItems().add(new Label((String)NameListViewTexts.get(i)));
        }

        ArrayList AgeListViewTexts = model.getAgeListViewTexts();
        for (int i = 0; i < AgeListViewTexts.size(); i++) {
            AgeListView.getItems().add(new Label((String)AgeListViewTexts.get(i)));
        }

        ArrayList HobbyListViewTexts = model.getHobbyListViewTexts();
        for (int i = 0; i < HobbyListViewTexts.size(); i++) {
            HobbyListView.getItems().add(new Label((String)HobbyListViewTexts.get(i)));
        }

        ArrayList SubjectListViewTexts = model.getSubjectListViewTexts();
        for (int i = 0; i < SubjectListViewTexts.size(); i++) {
            SubjectListView.getItems().add(new Label((String)SubjectListViewTexts.get(i)));
        }

        ArrayList FoodListViewTexts = model.getFoodListViewTexts();
        for (int i = 0; i < FoodListViewTexts.size(); i++) {
            FoodListView.getItems().add(new Label((String)FoodListViewTexts.get(i)));
        }

        ArrayList MonthListViewTexts = model.getMonthListViewTexts();
        for (int i = 0; i < MonthListViewTexts.size(); i++) {
            MonthListView.getItems().add(new Label((String)MonthListViewTexts.get(i)));
        }
    }
    void save() {
        System.out.println("Controller save");

        int length = NameListView.getItems().size();
        model.getNameListViewTexts().clear();
        for (int i = 0; i < length; i++) {
            model.addToNameListViewTexts(NameListView.getItems().get(i).getText());
        }

        int length2 = AgeListView.getItems().size();
        model.getAgeListViewTexts().clear();
        for (int i = 0; i < length2; i++) {
            model.addToAgeListViewTexts(AgeListView.getItems().get(i).getText());
        }

        int length3 = HobbyListView.getItems().size();
        model.getHobbyListViewTexts().clear();
        for (int i = 0; i < length3; i++) {
            model.addToHobbyListViewTexts(HobbyListView.getItems().get(i).getText());
        }

        int length4 = SubjectListView.getItems().size();
        model.getSubjectListViewTexts().clear();
        for (int i = 0; i < length4; i++) {
            model.addToSubjectListViewTexts(SubjectListView.getItems().get(i).getText());
        }

        int length5 = MonthListView.getItems().size();
        model.getMonthListViewTexts().clear();
        for (int i = 0; i < length5; i++) {
            model.addToMonthListViewTexts(MonthListView.getItems().get(i).getText());
        }

        int length6 = FoodListView.getItems().size();
        model.getFoodListViewTexts().clear();
        for (int i = 0; i < length6; i++) {
            model.addToFoodListViewTexts(FoodListView.getItems().get(i).getText());
        }

        try {
            File savedText = new File(getClass().getResource("SavedText.txt").toURI());
            BufferedWriter writer = new BufferedWriter(new FileWriter(savedText));
            if (writer != null) {
                model.save(writer);
                writer.close();
            }
        } catch (Exception e) {
            System.out.println("Controller save EXCEPTION");
        }
    }

    public void onClicked() {
        System.out.println("onClicked was called");
    }

    public void MonthTextFieldReady() {
        System.out.println("MonthTextFieldReady was called");
        MonthListView.getItems().add(new Label(Month0.getText()));
        Month0.setText("");
    }

    public void AgeTextFieldReady() {
        System.out.println("AgeTextFieldReady was called");
        AgeListView.getItems().add(new Label(Age0.getText()));
        Age0.setText("");
    }

    public void NameTextFieldReady() {
        System.out.println("NameTextFieldReady was called");
        NameListView.getItems().add(new Label(Name0.getText()));
        Name0.setText("");
    }

    public void FoodTextFieldReady() {
        System.out.println("FoodTextFieldReady was called");
        FoodListView.getItems().add(new Label(Food0.getText()));
        Food0.setText("");
    }

    public void SubjectTextFieldReady() {
        System.out.println("SubjectTextFieldReady was called");
        SubjectListView.getItems().add(new Label(Subject0.getText()));
        Subject0.setText("");
    }

    public void HobbyTextFieldReady() {
        System.out.println("HobbyTextFieldReady was called");
        HobbyListView.getItems().add(new Label(Hobby0.getText()));
        Hobby0.setText("");
    }

}
