import UserInterface.UI;
import UserInterface.ConsoleUI;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    UI ui;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
                "UserInterface.xml");
        ConsoleUI bWorker = (ConsoleUI) ctx.getBean("ConsoleUserInterface");
        bWorker.run();
    }

    public App(ConsoleUI ui) {
        this.ui = ui;
    }

    public UI getUI() {
        return ui;
    }

    public void setUI(UI ui) {
        this.ui = ui;
    }
}
