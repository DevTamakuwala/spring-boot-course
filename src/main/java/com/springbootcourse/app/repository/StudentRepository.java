package com.springbootcourse.app.repository;

import com.springbootcourse.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String sql = "insert into student(rollNo, name, marks) values(?,?,?)";
        int rows = jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println(rows + " effected");
    }

    public List<Student> findAll() {

        String sql = "select * from student";

        return jdbc.query(sql, (rs, rowNum) -> {

            Student s = new Student();

            s.setRollNo(rs.getInt("rollNo"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));

            return s;
        });
    }
}
