package cn.temptation.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.temptation.domain.Student;



public interface StudentMapper {
     
//	@Insert("insert into student(name, age) values(#{name}, #{age})")  
    public int insertStudent(Student student);  
     
 //   @Update("update student set name=#{name}, age=#{age} where id=#{id}")  
    public void updateStudent(Student student);  
     
 //   @Select("select * from student where id=#{id}")  
    public Student findById(int id);  
     
 //   @Delete("delete from student where id=#{id}")  
    public void deleteStudent(int id);  
	
	
}
