/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.fxml.FXML;

public class ToDoController {
    //Declare ObservableList to store all to-do lists
    //Declare a temporary ObservableList for new items

    //Main to-do list TableView to display all lists
    @FXML
    private TableView<ToDoList> tableView;
    @FXML
    private TableColumn<ToDoList, String> titleColumn;

    //New to-do list window fields
    @FXML
    private TextField titleField;
    @FXML
    private TextField descriptionField;
    @FXML
    private Text dateField;
    @FXML
    private TableColumn<ToDoListItem, String> newDescriptionColumn;
    @FXML
    private TableColumn<ToDoListItem, String> newDueDateColumn;



    //View to-do list window fields
    @FXML
    private TextField viewTitle;
    @FXML
    private TextField viewdescriptionField;

    //View to-do list TableView to display all items
    @FXML
    private TableView<ToDoListItem> viewItemTableView;
    @FXML
    private TableColumn<ToDoListItem, String> viewDescriptionColumn;
    @FXML
    private TableColumn<ToDoListItem, String> viewDueDateColumn;
    @FXML
    private TableColumn<ToDoListItem, String> viewCompleteColumn;

    @FXML
    public void openNewList(ActionEvent actionEvent) {
        //Close main to-do list window
        //Open new to-do list window
    }

    @FXML
    public void addItemToTempList(ActionEvent actionEvent) {
        //Get description and due date from textfield
        //Create new item using description and due date
        //Add to the temporary ObservableList
    }

    //For removing item from new to-do list screen
    @FXML
    public void removeSelectedItem(ActionEvent actionEvent) {
        //Get selected item from TableView on clicked event
        //Remove it
    }

    //For removing item from view to-do list screen
    @FXML
    public void removeSelectedItemView(ActionEvent actionEvent) {
        //Get selected item from TableView on clicked event
        //Remove it
    }

    @FXML
    public void markItemAsComplete(ActionEvent actionEvent) {
        //Get selected item from on clicked event
        //Set item as complete in item's ObservableList
    }

    @FXML
    public void exportCurrentList(ActionEvent actionEvent) {
        //Create list.json
        //Get title and items from current list
        //Use json library to convert to json object
        //Write object to list.json
    }

    @FXML
    public void exportAllLists(ActionEvent actionEvent) {
        //Create lists.json
        //For each to-do list in the ObservableList:
            //Get title and items from list
            //Use json library to convert to json object
            //Write object to list.json
    }

    @FXML
    public void loadList(ActionEvent actionEvent) {
        //Get list.json
        //Use json library to read in json objects
        //Convert json object to new to-do list
        //Add new to-do list to the main ObservableList
    }

    @FXML
    public void loadAllLists(ActionEvent actionEvent) {
        //Get lists.json
        //For each json object:
            //Use library to convert json object to new to-do list
            //Add new to-do list to the main ObservableList
    }


    @FXML
    public void saveCurrentList(ActionEvent actionEvent) {
        //Get current list in ObservableList
        //Get title and items from TextFields
        //Use setters in ToDoList class to set changes
    }

    @FXML
    public void saveNewList(ActionEvent actionEvent) {
        //Get title and items from temporary ObservableList
        //Create new ToDoList using those
        //Store new ToDoList in main ObservableList
        openMainWindow();
    }

    @FXML
    public void viewSelectedList(ActionEvent actionEvent) {
        //Get selected to-do list from tableView
        //Set scene to the view to-do list window
        //Display to-do list fields in appropriate textField
    }

    @FXML
    public void removeSelectedList(ActionEvent actionEvent) {
        //Get selected to-do list from tableView
        //Remove the to-do list from the ObservableList
    }

    @FXML
    public void goToMain(ActionEvent actionEvent) {
        openMainWindow();
    }

    public void openMainWindow() {
        //Set scene to the main to-do list window
    }
}
