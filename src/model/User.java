package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
private List<Habit> habits;

    public User(String name) {
        this.name = name;
        this.habits = new ArrayList<>();
    }

    public void appendHabit(String name) {
        habits.add(new Habit(name));
    }

    @Override
    public String toString() {
        StringBuilder habitsString = new StringBuilder();
        for(Habit habit : habits) {
            habitsString.append(habit.getName());
            habitsString.append("\n");
        }
        return habitsString.toString();
    }

    public List<Object> getHabits() {
        return new ArrayList<>(habits);
    }

    public String getName() {
        return  name;
    }
}
