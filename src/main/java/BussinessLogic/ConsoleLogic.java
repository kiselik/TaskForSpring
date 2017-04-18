package BussinessLogic;

import DatabasePrimitive.DatabaseWork;
import DatabasePrimitive.DatabaseWorkNet;

public class ConsoleLogic implements Logic {
    private DatabaseWork db;

    public ConsoleLogic(DatabaseWorkNet db) {
        this.db = db;
    }

    public DatabaseWork getDb() {
        return db;
    }

    public void setDb(DatabaseWork db) {
        this.db = db;
    }

    public void startQuery(int selection, int param) {
        switch (selection) {
            case 1:
                System.out.print("Count of rows is: ");
                System.out.println(db.getCountRows());
                break;
            case 2:
                System.out.println("Received information :");
                System.out.println("Name : " + db.searchNameEmployee(String.valueOf(param)));
                break;
            case 3:
                System.out.println("Received information :");
                System.out.println("Job : " + db.getJobEmployee(String.valueOf(param)));
                break;
            case 4:
                db.deleteEmployee(String.valueOf(param));
                System.out.println("1 row deleted");
        }
    }
}
