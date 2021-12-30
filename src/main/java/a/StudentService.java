package a;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public void saveStudent(Student st)
    {
        studentRepository.save(st);
    }
    public List<Student> getAllStudents()
    {
        List<Student>st=new ArrayList<Student>();
        studentRepository.findAll().forEach(x->st.add(x));
        return st;
    }
    public Student getStudentById(int id)
    {
        return studentRepository.findById(id).get();
    }
    public void delete(int id)
    {
        studentRepository.deleteById(id);
    }

}