package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoControllerTest {

    @Test
    void saveNewList() {
        //Assuming the user has clicked the Save button
        //Assuming the user put input in the fields
        try {
            String title = "Grocery Shopping";
            ToDoListItem item1 = new ToDoListItem("Buy milk.", "2021-06,20");
            ToDoListItem item2 = new ToDoListItem("Buy cereal.", "2021-06,20");

            ObservableList<ToDoListItem> items = FXCollections.observableArrayList();

            items.add(item1);
            items.add(item2);

            ToDoList shopping = new ToDoList(title, items);

            System.out.println("Successfully created new list.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}