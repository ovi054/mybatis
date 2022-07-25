package com.mybatis.repository;

import com.mybatis.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmployeeRepository {
    //@Select("select * from employees")
    public List<Employee> findAll();

    //@Select("SELECT * FROM employees WHERE id = #{id}")
    public Employee findbyID(int id);

    /*
    @Insert("INSERT INTO employees(id, firstName, lastName,email) " +
            " VALUES (#{id}, #{firstName}, #{lastName}, #{email})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
     */
    public Integer save(Employee employee);
}
