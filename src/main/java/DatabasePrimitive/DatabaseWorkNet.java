package DatabasePrimitive;

import org.springframework.jdbc.core.JdbcTemplate;


public class DatabaseWorkNet implements DatabaseWork {
    private JdbcTemplate jdbc;

    public DatabaseWorkNet(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public int getCountRows() {
        return jdbc.queryForObject("SELECT COUNT(*) FROM emp", Integer.class);
    }

    public String searchNameEmployee(String param) {
        return jdbc.queryForObject("SELECT e.ename FROM emp e WHERE e.empno = ?", String.class, param);
    }

    public String getJobEmployee(String param) {
       return jdbc.queryForObject("SELECT d.dname AS DEPART " +
                "FROM dept d,emp e " +
                " WHERE e.empno=? AND d.deptno=e.deptno", String.class, param);
    }

    public void deleteEmployee(String param) {
        jdbc.update("DELETE FROM emp e WHERE e.empno=?", String.class, param);
    }
}
