package cz.uhk.fim.todolist.model;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<TodoItem> itemList = new ArrayList<>(); // Toto je AGREGACE

    public void addItem(TodoItem item){
        itemList.add(item);
    }

    public TodoItem getItemByIndex(int index){
        return itemList.get(index);
    }

    public int getItemCount(){
        return itemList.size();
    }

    public void changeItemState(int index){
        TodoItem item = itemList.get(index);
        item.setComplete(!item.isComplete()); // zjisteni jaky boolean ma ten item a pomoci ! se zmeni na druhy
    }


}
