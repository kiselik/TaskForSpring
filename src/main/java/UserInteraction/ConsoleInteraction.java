package UserInteraction;

import BussinessLogic.ConsoleLogic;
import BussinessLogic.Logic;

import java.util.Scanner;

public class ConsoleInteraction implements Interaction {
    Logic logic;

    public ConsoleInteraction(ConsoleLogic logic) {
        this.logic = logic;
    }

    public int getIntParam() {

        Scanner reader = new Scanner(System.in);
        if (reader.hasNextInt()) {
            return reader.nextInt();
        } else {
            throw new IllegalArgumentException("Well, it isn't a number.Try again");
        }
    }

    public String getStringValue() {
        Scanner reader = new Scanner(System.in);
        return reader.next();
    }

    public void NullParam(int selection) {
        logic.startQuery(selection, 0);
    }

    public void OneIntParam(int selection) {
        logic.startQuery(selection, getIntParam());
    }
}
