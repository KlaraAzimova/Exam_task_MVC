package peaksoft.repository;

import peaksoft.entity.Instructor;

import java.util.List;


public interface InstructorRepository {

    void saveInstructor(Long id, Instructor instructor);

    void updateInstructor(Long id, Instructor instructor);

    List<Instructor> getAllInstructor(Long id);

    Instructor getInstructorById(Long id);

    void deleteInstructorById(Long id);

    void assignInstructorToCourse(Long instructorId, Long courseId);

}
