package a;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/getstudent-all")
    private List<Student>getAllStudents()
    {
        return studentService.getAllStudents();
    }
    @GetMapping("/student-get/{id}")
    private Student getStudent(@PathVariable("id") int id)
    {
        return studentService.getStudentById(id);
    }
    @DeleteMapping("/student-delete/{id}")
    private void deleteStudent(@PathVariable("id") int id)
    {
        studentService.delete(id);
    }
    @PostMapping("/student-post")
    private int saveStudents(@RequestBody Student st)
    {
        studentService.saveStudent(st);
        return st.getId();
    }
}
