package ch.makery.lab4;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ch.makery.lab4.Person;

/**
 * Окно для изменения информации об адресате.
 *
 * @author Marco Jakob
 */
public class PersonEditDialogController {

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField science_rank;
    @FXML
    private TextField science_mark;
    @FXML
    private TextField rank;
    @FXML
    private TextField dicipline_name;
    @FXML
    private TextField dicipline_type;


    private Stage dialogStage;
    private Person person;
    private boolean okClicked = false;

    /**
     * Инициализирует класс-контроллер. Этот метод вызывается автоматически
     * после того, как fxml-файл будет загружен.
     */
    @FXML
    private void initialize() {
    }

    /**
     * Устанавливает сцену для этого окна.
     *
     * @param dialogStage
     */
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    /**
     * Задаёт адресата, информацию о котором будем менять.
     *
     * @param person
     */
    public void setPerson(Person person) {
        this.person = person;

        firstNameField.setText(person.getFirstName());
        lastNameField.setText(person.getLastName());
        science_rank.setText(person.getScienceRank());
        science_mark.setText(Integer.toString(person.getsciencemark()));
        rank.setText(person.getRank());
        dicipline_name.setText(person.getDicipline_name());
        dicipline_type.setText(person.getDicipline_type());
    }

    /**
     * Returns true, если пользователь кликнул OK, в другом случае false.
     *
     * @return
     */
    public boolean isOkClicked() {
        return okClicked;
    }

    /**
     * Вызывается, когда пользователь кликнул по кнопке OK.
     */
    @FXML
    private void handleOk() {
        if (isInputValid()) {
            person.setFirstName(firstNameField.getText());
            person.setLastName(lastNameField.getText());
            person.setSciencerank(science_rank.getText());
            person.setsciencemark(Integer.parseInt(science_mark.getText()));
            person.setRank(rank.getText());
            person.setDicipline_name(dicipline_name.getText());
            person.setDicipline_type(dicipline_type.getText());

            okClicked = true;
            dialogStage.close();
        }
    }

    /**
     * Вызывается, когда пользователь кликнул по кнопке Cancel.
     */
    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    /**
     * Проверяет пользовательский ввод в текстовых полях.
     *
     * @return true, если пользовательский ввод корректен
     */
    private boolean isInputValid() {
        String errorMessage = "";

        if (firstNameField.getText() == null || firstNameField.getText().length() == 0) {
            errorMessage += "No valid first name!\n";
        }
        if (lastNameField.getText() == null || lastNameField.getText().length() == 0) {
            errorMessage += "No valid last name!\n";
        }
        if (science_rank.getText() == null || science_rank.getText().length() == 0) {
            errorMessage += "No valid science rank!\n";
        }

        if (science_mark.getText() == null || science_mark.getText().length() == 0) {
            errorMessage += "No valid science mark!\n";
        } else {
            // пытаемся преобразовать почтовый код в int.
            try {
                Integer.parseInt(science_mark.getText());
            } catch (NumberFormatException e) {
                errorMessage += "No valid postal code (must be an integer)!\n";
            }
        }

        if (rank.getText() == null || rank.getText().length() == 0) {
            errorMessage += "No valid rank!\n";
        }

        if (dicipline_name.getText() == null || dicipline_name.getText().length() == 0) {
            errorMessage += "No valid dicipline name!\n";
        }
        if (dicipline_type.getText() == null || dicipline_type.getText().length() == 0) {
            errorMessage += "No valid dicipline type!\n";
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Показываем сообщение об ошибке.
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}