package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class Model {
    public String Month0Text;
    public String Age0Text;
    public String Name0Text;
    public String Food0Text;
    public String Subject0Text;
    public String Hobby0Text;
    public ArrayList<String> NameListViewTexts;
    public ArrayList<String> AgeListViewTexts;
    public ArrayList<String> HobbyListViewTexts;
    public ArrayList<String> SubjectListViewTexts;
    public ArrayList<String> FoodListViewTexts;
    public ArrayList<String> MonthListViewTexts;

    Model() {
        System.out.println("Model()");
        Month0Text = "";
        Age0Text = "";
        Name0Text = "";
        Food0Text = "";
        Subject0Text = "";
        Hobby0Text = "";
        NameListViewTexts = new ArrayList();
        AgeListViewTexts = new ArrayList();
        HobbyListViewTexts = new ArrayList();
        SubjectListViewTexts = new ArrayList();
        FoodListViewTexts = new ArrayList();
        MonthListViewTexts = new ArrayList();
    }

    Model(BufferedReader input) {
        System.out.println("Model(BufferedReader input)");
        try {
            Name0Text = input.readLine();
            NameListViewTexts = new ArrayList();
            int numberOfNames = Integer.valueOf(Name0Text);
            for (int i = 0; i < numberOfNames; i++) {
                String newNameListText = input.readLine();
                NameListViewTexts.add(newNameListText);
            }

            Age0Text = input.readLine();
            AgeListViewTexts = new ArrayList();
            int numberOfAges = Integer.valueOf(Age0Text);
            for (int i = 0; i < numberOfAges; i++) {
                String newAgeListText = input.readLine();
                AgeListViewTexts.add(newAgeListText);
            }

            Month0Text = input.readLine();
            MonthListViewTexts = new ArrayList();
            int numberOfMonths = Integer.valueOf(Month0Text);
            for (int i = 0; i < numberOfMonths; i++) {
                String newMonthListText = input.readLine();
                MonthListViewTexts.add(newMonthListText);
            }

            Hobby0Text = input.readLine();
            HobbyListViewTexts = new ArrayList();
            int numberOfHobbys = Integer.valueOf(Hobby0Text);
            for (int i = 0; i < numberOfHobbys; i++) {
                String newHobbyListText = input.readLine();
                HobbyListViewTexts.add(newHobbyListText);
            }

            Subject0Text = input.readLine();
            SubjectListViewTexts = new ArrayList();
            int numberOfSubjects = Integer.valueOf(Subject0Text);
            for (int i = 0; i < numberOfSubjects; i++) {
                String newSubjectListText = input.readLine();
                SubjectListViewTexts.add(newSubjectListText);
            }

            Food0Text = input.readLine();
            FoodListViewTexts = new ArrayList();
            int numberOfFoods = Integer.valueOf(Food0Text);
            for (int i = 0; i < numberOfFoods; i++) {
                String newFoodListText = input.readLine();
                FoodListViewTexts.add(newFoodListText);
            }

        } catch (Exception e) {
            System.out.println("Model(BufferedReader input) FAILED");
            e.printStackTrace();
        }
    }

    void save(BufferedWriter output) {
        try {
            output.newLine();
            if (Name0Text != null) {
                output.write(Name0Text);
            } else {
                output.write("");
            }

            output.newLine();
            if (Age0Text != null) {
                output.write(Age0Text);
            } else {
                output.write("");
            }

            output.newLine();
            if (Month0Text != null) {
                output.write(Month0Text);
            } else {
                output.write("");
            }

            output.newLine();
            if (Hobby0Text != null) {
                output.write(Hobby0Text);
            } else {
                output.write("");
            }

            output.newLine();
            if (Subject0Text != null) {
                output.write(Subject0Text);
            } else {
                output.write("");
            }

            output.newLine();
            if (Food0Text != null) {
                output.write(Food0Text);
            } else {
                output.write("");
            }

            output.newLine();
            int length = AgeListViewTexts.size();
            output.write(String.valueOf(length));
            if (length > 0) {
                for (int i = 0; i < length; i++) {
                    output.write(AgeListViewTexts.get(i));
                    output.newLine();
                }
            }

            output.newLine();
            int length2 = NameListViewTexts.size();
            output.write(String.valueOf(length2));
            if (length2 > 0) {
                for (int i = 0; i < length2; i++) {
                    output.write(NameListViewTexts.get(i));
                    output.newLine();
                }
            }

            output.newLine();
            int length3 = HobbyListViewTexts.size();
            output.write(String.valueOf(length3));
            if (length3 > 0) {
                for (int i = 0; i < length3; i++) {
                    output.write(HobbyListViewTexts.get(i));
                    output.newLine();
                }
            }

            output.newLine();
            int length4 = SubjectListViewTexts.size();
            output.write(String.valueOf(length4));
            if (length4 > 0) {
                for (int i = 0; i < length4; i++) {
                    output.write(SubjectListViewTexts.get(i));
                    output.newLine();
                }
            }

            output.newLine();
            int length5 = FoodListViewTexts.size();
            output.write(String.valueOf(length5));
            if (length5 > 0) {
                for (int i = 0; i < length5; i++) {
                    output.write(FoodListViewTexts.get(i));
                    output.newLine();
                }
            }

            output.newLine();
            int length6 = MonthListViewTexts.size();
            output.write(String.valueOf(length6));
            if (length6 > 0) {
                for (int i = 0; i < length6; i++) {
                    output.write(MonthListViewTexts.get(i));
                    output.newLine();
                }
            }
        } catch (Exception e) {

            System.out.println("Model writing failed!!!");
            e.printStackTrace();
        }
    }

    // getter and setter methods for all of the Model's fields
    ArrayList getNameListViewTexts() { return NameListViewTexts; }
    void addToNameListViewTexts(String updatedText) { NameListViewTexts.add(updatedText); }

    ArrayList getAgeListViewTexts() { return AgeListViewTexts; }
    void addToAgeListViewTexts(String updatedText) { AgeListViewTexts.add(updatedText); }

    ArrayList getHobbyListViewTexts() { return HobbyListViewTexts; }
    void addToHobbyListViewTexts(String updatedText) { HobbyListViewTexts.add(updatedText); }

    ArrayList getSubjectListViewTexts() { return SubjectListViewTexts; }
    void addToSubjectListViewTexts(String updatedText) { SubjectListViewTexts.add(updatedText); }

    ArrayList getFoodListViewTexts() { return FoodListViewTexts; }
    void addToFoodListViewTexts(String updatedText) { FoodListViewTexts.add(updatedText); }

    ArrayList getMonthListViewTexts() { return MonthListViewTexts; }
    void addToMonthListViewTexts(String updatedText) { MonthListViewTexts.add(updatedText); }
}


