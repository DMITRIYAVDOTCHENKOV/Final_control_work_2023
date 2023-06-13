package pets_program;

import java.util.ArrayList;

public class Pet {
    private final String name;
    private final String species;
    private final ArrayList<String> commands;

    public Pet(String name, String breed, String species) {
        this.name = name;
        this.species = species;
        this.commands = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void showCommands() {
        if (commands.isEmpty()) {
            System.out.println("Животное " + name + " не знает никаких команд.");
        } else {
            System.out.println("Животное " + name + " знает следующие команды:");
            for (int i = 0; i < commands.size(); i++) {
                System.out.println((i+1) + ". " + commands.get(i));
            }
        }
    }
}













