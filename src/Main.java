import model.User;
import ui.UI;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        User user = new User("Silver");

        user.appendHabit("sport");
        user.appendHabit("second");
        user.appendHabit("blue");

        ui.writeList(user.getName(), user.getHabits());
    }
}