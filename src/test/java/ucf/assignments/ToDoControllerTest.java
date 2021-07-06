package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoControllerTest {

    @Test
    void addNewList() {
        //Create title
        //Create a couple new ToDoListItems
        //Store new items in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //Create a null ObservableList
        //assertNotEquals the null ObservableList and the ObservableList with the ToDoList in it
    }

    @Test
    void removeList() {
        //Create title
        //Create a couple new ToDoListItems
        //Store new items in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //Store the same ToDoList in another ObservableList
        //Use the ObservableList method .remove() to remove the ToDoList from the first ObservableList
        //assertNotEquals the ObservableList with the list removed against the ObservableList with the list still in it
    }

    @Test
    void editTitle() {
        //Create title
        //Create a couple new ToDoListItems
        //Store new items in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //Use ToDoList method setTitle() to change the list's title in the ObservableList
        //assertNotEquals the original title variable with the getTitle() method of the list
    }

    @Test
    void addNewItem() {
        //Create title
        //Create a couple new ToDoListItems
        //Store new items in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //Create a new item
        //try catch using the ToDoList method addItem() with the new item
    }

    @Test
    void removeItem() {
        //Create title
        //Create a couple new ToDoListItems
        //Store new items in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //try catch using the ToDoList method removeItem()
    }

    @Test
    void editDescription() {
        //Create title
        //Create a couple new ToDoListItems
        //Store new items in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //Create new description
        //try catch using the ToDoListItem method setDescription() with the new description on one of the items
    }

    @Test
    void editDueDate() {
        //Create title
        //Create a couple new ToDoListItems
        //Store new items in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //Create new due date
        //try catch use the ToDoListItem method setDuedate() with the new due date on one of the items
    }

    @Test
    void markItemAsComplete() {
        //Create title
        //Create a new ToDoListItem
        //Store it in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //try catch use the ToDoListItem method setCompleted() the item in the ToDoList
    }

    @Test
    void displayAllItems() {
        //Create title
        //Create a couple new ToDoListItems
        //Store new items in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //try catch use the ObservableList method forEach() for the items in the ToDoList to print to console
    }

    @Test
    void displayIncompletedItems() {
        //Create a couple ToDoLists with some being set as completed
        //Store ToDoLists in ObservableList
        //Create a Comparator using the ToDoListItem getCompleted() method
        //try catch use the FXCollections sort() method using the ObservableList and the Comparator
    }

    @Test
    void displayCompleted() {
        //Create a couple ToDoLists with some being set as completed
        //Store ToDoLists in ObservableList
        //Create a Comparator using the ToDoListItem getCompleted() method
        //try catch use the FXCollections sort() method using the ObservableList and the !Comparator
    }

    @Test
    void saveSingleList() {
        //Create title
        //Create a couple new ToDoListItems
        //Store new items in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //Create new JSON file in directory
        //try catch use a json library to output the ToDoList into file as json
        //assertTrue using File method exists() to ensure that the file was created
    }

    @Test
    void saveAllLists() {
        //Create a couple ToDoLists
        //Store them in an ObservableList
        //Create new JSON file in directory
        //Create a JSON object arraylist
        //use forEach() Observable method:
            //try catch use a json library to convert each ToDoList to an object
            //Store the object in the json arraylist
        //use forEach() ArrayList method:
            //output each object to the json file
        //assertTrue using File method exists() to ensure that the file was created
    }

    @Test
    void loadSingleList() {
        //Create title
        //Create a couple new ToDoListItems
        //Store new items in ObservableList
        //Create new ToDoList using title and ObservableList
        //Store new ToDoList in ObservableList
        //Create new JSON file in directory
        //try catch use a json library to output the ToDoList into file as json
        //Use the json library to load them back into another ObservableList
        //assertEquals the first ObservableList against the ObservableList with the json loaded ToDoList
    }

    @Test
    void loadAllLists() {
        //Create a couple ToDoLists
        //Store them in an ObservableList
        //Create new JSON file in directory
        //Create a JSON object arraylist
        //use forEach() Observable method:
            //use a json library to convert each ToDoList to an object
            //Store the object in the json arraylist
        //use forEach() ArrayList method:
            //output each object to the json file
        //Use the same json library to read back each ToDoList object from the file into a new ObservableList
        //assertEquals the first ObservableList against the new ObservableList with the json loaded ToDoLists
    }
}