package DatabasePrimitive;

public interface DatabaseWork {
    String searchEmployee(int id);

    String searchEmployeeJob(String job);

    String searchEmployeeDept(String dept);

    void AddEmployee(Integer empno, String ename, String job, Integer mgr, String hiredate, Integer salary, String comm, Integer deptno);

    void DeleteEmployee(int id);
}
