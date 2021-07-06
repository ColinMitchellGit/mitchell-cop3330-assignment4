/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ucf.assignments;

import javafx.collections.ObservableList;

public class ToDoList {
    private String title;
    private ObservableList<ToDoListItem> items;

    //To-do list constructor
    public ToDoList(String title, ObservableList<ToDoListItem> items) {
        this.title = title;
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addItem(ToDoListItem item) {
        this.items.add(item);
    }

    //Getter which returns all items for TableView
    public ObservableList<ToDoListItem> getItems() {
        return items;
    }
}
