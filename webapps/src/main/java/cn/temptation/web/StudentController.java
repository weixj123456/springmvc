package cn.temptation.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.temptation.dao.StudentMapper;
import cn.temptation.domain.Student;


@Controller
public class StudentController {
      
	@Resource
    private StudentMapper studentDao;
	
	@RequestMapping("studentsave.do")
	public String add(Student student,HttpServletRequest request){
		try {			
//			user.setId(UUID.randomUUID().toString());
			System.out.println(student.getId() + ":::::" + student.getName() + ":::::" + student.getAge());
			int str = studentDao.insertStudent(student);
			System.out.println(str);
			request.setAttribute("InfoMessage", str);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("InfoMessage", "添加信息失败！具体异常信息：" + e.getMessage());
		} finally {
                return "result";
          }
	}
	
}
