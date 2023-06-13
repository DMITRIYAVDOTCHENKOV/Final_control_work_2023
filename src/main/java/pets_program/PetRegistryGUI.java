package pets_program;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class PetRegistryGUI extends JFrame implements ActionListener {
    private final ArrayList<Pet> petList;
    private final JTextField nameField;
    private final JTextField breedField;
    private final JTextField speciesField;
    private final JTextField commandField;
    private final JLabel outputLabel;
    private final JButton addButton;
    private final JButton classifyButton;
    private final JButton showButton;
    private final JButton teachButton;
    private final JButton listButton;
    private final JButton removeButton;
    public PetRegistryGUI() {


            petList = new ArrayList<>();

            // Создание панели для ввода данных
        JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

        JLabel nameLabel = new JLabel("Имя животного:");
            nameField = new JTextField();
        JLabel breedLabel = new JLabel("Порода животного:");
            breedField = new JTextField();
        JLabel speciesLabel = new JLabel("Вид животного:");
            speciesField = new JTextField();
        JLabel commandLabel = new JLabel("Команда:");
            commandField = new JTextField();
            addButton = new JButton("Добавить животное");
            addButton.addActionListener(this);
            classifyButton = new JButton("Классифицировать животное");
            classifyButton.addActionListener(this);
            showButton = new JButton("Список команд животного");
            showButton.addActionListener(this);
            teachButton = new JButton("Обучить животное");
            teachButton.addActionListener(this);
            removeButton = new JButton("Удалить животное");
            removeButton.addActionListener(this);
            listButton = new JButton("Список животных");
            listButton.addActionListener(this);

            // Добавление компонентов на панель ввода
            inputPanel.add(nameLabel);
            inputPanel.add(nameField);
            inputPanel.add(breedLabel);
            inputPanel.add(breedField);
            inputPanel.add(speciesLabel);
            inputPanel.add(speciesField);
            inputPanel.add(commandLabel);
            inputPanel.add(commandField);
            inputPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Добавляем отступ
            inputPanel.add(addButton);
            inputPanel.add(classifyButton);
            inputPanel.add(showButton);
            inputPanel.add(teachButton);
            inputPanel.add(removeButton);
            inputPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Добавляем отступ
            inputPanel.add(listButton);

            // Создание панели для вывода результатов
        JPanel outputPanel = new JPanel(new GridLayout(2, 1));
            outputLabel = new JLabel();
            outputPanel.add(outputLabel);

            // Настройка окна
            setTitle("Pet Registry");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
            add(inputPanel, BorderLayout.WEST);
            add(outputPanel, BorderLayout.EAST);
            pack();
            setSize(600,400);
            setVisible(true);
        }

    public static void main(String[] args) {
        new PetRegistryGUI();
    }
    public void actionPerformed(ActionEvent e) {
        // Добавление нового животного
        if (e.getSource() == addButton) {
            try {
                File petsFile = new File("pets.txt");
                FileWriter writer = new FileWriter(petsFile, true);
                String name = nameField.getText();
                String breed = breedField.getText();
                String species = speciesField.getText();
                petList.add(new Pet(name, breed, species));
                writer.write(name + ";" + breed + ";" + species + ";"  + "\n");
                writer.close();
                outputLabel.setText("Животное " + name + " добавлено.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            String name = nameField.getText();
            String breed = breedField.getText();
            String species = speciesField.getText();
            Pet pet = new Pet(name, breed, species);

            petList.add(pet);

            outputLabel.setText("Животное успешно добавлено в registry.");
        } else if (e.getSource() == classifyButton) {
            // Определение класса животного
            String name = nameField.getText();
            for (Pet pet : petList) {
                if (pet.getName().equals(name)) {
                    outputLabel.setText("Животное " + pet.getName() + " относится к классу " + pet.getSpecies());
                    return;
                }
            }
            outputLabel.setText("Животное с именем " + name + " не найдено.");
        } else if (e.getSource() == showButton) {
            // Вывод списка команд животного
            String name = nameField.getText();
            for (Pet pet : petList) {
                if (pet.getName().equals(name)) {
                    outputLabel.setText(pet.getName() + " может выполнить следующие команды: " + pet.getCommands());
                    return;
                }
            }
            outputLabel.setText("Животное с именем " + name + " не найдено.");
        } else if (e.getSource() == teachButton) {


// Обучение животного новой команде
            String name = nameField.getText();
            for (Pet pet : petList) {
                if (pet.getName().equals(name)) {
                    String command = commandField.getText();
                    pet.addCommand(command);
                    outputLabel.setText("Животное " + pet.getName() + " успешно обучено новой команде: " + command);
                    return;
                }
            }
            outputLabel.setText("Животное с именем " + name + " не найдено.");
        } else if (e.getSource() == listButton) {
            // Вывод списка всех животных
            StringBuilder list = new StringBuilder("<html><b>Список животных:</b><br>");
            for (Pet pet : petList) {
                list.append(pet.getName()).append(" (").append(pet.getCommands()).append(", ").append(pet.getSpecies()).append(")<br>");
            }
            list.append("</html>");
            outputLabel.setText(list.toString());
        }
        else if (e.getSource() == removeButton) {
            // Удаление животного
            String name = nameField.getText();
            for (Pet pet : petList) {
                if (pet.getName().equals(name)) {
                    petList.remove(pet);
                    outputLabel.setText("Животное " + pet.getName() + " успешно удалено из registry.");
                    return;
                }
            }
            outputLabel.setText("Животное с именем " + name + " не найдено.");
        }
    }

}
