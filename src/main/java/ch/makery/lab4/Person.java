package ch.makery.lab4;
import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty science_rank;
    private final IntegerProperty science_mark;
    private final StringProperty rank;
    private final StringProperty dicipline_name;
    private final StringProperty dicipline_type;

    public Person(){
        this(null, null, null, 0, null, null, null);
    }
    public Person(String firstName, String lastName, String science_rank, Integer science_mark, String rank, String dicipline_name, String dicipline_type){
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.science_rank = new SimpleStringProperty(science_rank);
        this.science_mark = new SimpleIntegerProperty(science_mark);
        this.rank = new SimpleStringProperty(rank);
        this.dicipline_name = new SimpleStringProperty(dicipline_name);
        this.dicipline_type = new SimpleStringProperty(dicipline_type);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }
    public String getScienceRank() {
        return science_rank.get();
    }

    public void setSciencerank(String street) {
        this.science_rank.set(street);
    }

    public StringProperty sciencerankProperty() {
        return science_rank;
    }

    public int getsciencemark() {
        return science_mark.get();
    }

    public void setsciencemark(int postalCode) {
        this.science_mark.set(postalCode);
    }

    public IntegerProperty sciencemarkProperty() {
        return science_mark;
    }

    public String getRank() {
        return rank.get();
    }

    public void setRank(String city) {
        this.rank.set(city);
    }

    public StringProperty rankProperty() {
        return rank;
    }

    public String getDicipline_name() {
        return dicipline_name.get();
    }

    public void setDicipline_name(String dicipline_name) {
        this.dicipline_name.set(dicipline_name);
    }

    public StringProperty dicipline_nameProperty() {
        return dicipline_name;
    }
    public String getDicipline_type() {
        return dicipline_type.get();
    }

    public void setDicipline_type(String dicipline_name) {
        this.dicipline_type.set(dicipline_name);
    }

    public StringProperty dicipline_typeProperty() {
        return dicipline_type;
    }
}
