package cz.uhk.fim.todolist.gui;

import cz.uhk.fim.todolist.model.TodoItem;
import cz.uhk.fim.todolist.model.TodoList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTable table;
    private TodoTableModel model;
    private TodoList todoList;

    public MainFrame() {
        init();
    }

    private void init() {
        setTitle("TODO List App");
        setSize(640,480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        model = new TodoTableModel();
        todoList = new TodoList();
        model.setList(todoList);

        initControlPanel();
        initContentPanel();

    }

    private void initContentPanel() {
        table = new JTable();
        table.setModel(model);

        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    private void initControlPanel(){
        JPanel controlPanel = new JPanel(new BorderLayout());

        JLabel lblAddTodo = new JLabel("Zadej todo:");
        JTextField txtAddTodo = new JTextField();
        JButton btnAdd = new JButton("Přidat");

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtAddTodo.getText().trim().isEmpty()){
                    String st = "nesmis zadat praznou bunku, ale ani pouze mezery!!";
                    JOptionPane.showMessageDialog(new JFrame(), st, "Chyba",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                todoList.addItem(new TodoItem(txtAddTodo.getText()));
                txtAddTodo.setText("");
                model.setList(todoList);
            }
        });

        controlPanel.add(lblAddTodo, BorderLayout.WEST);
        controlPanel.add(txtAddTodo, BorderLayout.CENTER);
        controlPanel.add(btnAdd, BorderLayout.EAST);

        add(controlPanel, BorderLayout.NORTH);
    }
}
