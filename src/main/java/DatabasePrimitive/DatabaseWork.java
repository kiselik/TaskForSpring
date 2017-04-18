package DatabasePrimitive;

public interface DatabaseWork {

    int getCountRows();

    String searchNameEmployee(String id);

    String getJobEmployee(String param);

    void deleteEmployee(String id);
}
