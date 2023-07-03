package com.maqant.springboot.demo.myfirstapp.dao;

import com.maqant.springboot.demo.myfirstapp.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Repository annotations is for component scanning and translation of JDBC exceptions
@Repository
@NoArgsConstructor
public class StudentDAOImpl implements StudentDAO{

    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    //Transactional Annotation is performing action in database like updating
    @Override
    @Transactional
    public void save(Student theStudent) {
        //How to increase Auto Increment ID number
        //ALTER TABLE student.tracker.student AUTO_INCREMENT=3000;

        //How to take it back
        //TRUNCATE student_tracker.student
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        //create query for all
        //TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);
        //create query for ordering asc - it is also possible for desc
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName asc", Student.class);
        //return query result
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        //query with parameter(:theData)
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);
        //set query parameter
        theQuery.setParameter("theData", theLastName);

        return theQuery.getResultList();
    }

    //We have an update/change on DB so we need to add @transactional tag
    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        //retrieve the student
        Student theStudent = entityManager.find(Student.class, id);
        System.out.println("Showed student will be deleted : " + theStudent);
        entityManager.remove(theStudent);

    }

    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numRowsDeleted;
    }
}
