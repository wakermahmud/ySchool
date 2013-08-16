package org.yarlithub.yschool.factories.yschoolLite;

import com.felees.hbnpojogen.randomlib.data.dataGeneration.*;
import org.springframework.stereotype.Component;
import org.yarlithub.yschool.factories.yschoolLite.YschoolLiteDataPoolFactory;
import org.yarlithub.yschool.model.obj.yschoolLite.*;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import com.felees.hbnpojogen.randomlib.data.dataGeneration.BasicDataGenerator;


/** 
 * DAO factory implementation.
 * @author autogenerated
 */
@Component
public class YschoolLiteDataPoolFactory {
	/** Table commit order. */
    private static final Multimap<String, String> tableDeps = ArrayListMultimap.create();
	/** DB commit order. */
	private static final String[] commitOrder = new String[]{"User", "StudentClassSubject", "SectionHasStaffHasRole", "SchoolHasStaffHasRole", "Marks", "ClassroomHasStaffHasRole", "ClassSubjectHasStaffHasRole", "ClassSubject", "ClassStudent", "UserRole", "Subject", "Student", "StaffHasRole", "Staff", "Section", "School", "Role", "ExamType", "Exam", "Classroom"};
	static{
		// Store table deps for possible use. 
 		tableDeps.put("ClassroomHasStaffHasRole", "Classroom");
 		tableDeps.put("ClassroomHasStaffHasRole", "StaffHasRole");
 		tableDeps.put("ClassStudent", "Classroom");
 		tableDeps.put("ClassStudent", "Student");
 		tableDeps.put("ClassSubject", "Classroom");
 		tableDeps.put("ClassSubject", "Subject");
 		tableDeps.put("ClassSubjectHasStaffHasRole", "ClassSubject");
 		tableDeps.put("ClassSubjectHasStaffHasRole", "StaffHasRole");
 		tableDeps.put("Marks", "Exam");
 		tableDeps.put("Marks", "Student");
 		tableDeps.put("SchoolHasStaffHasRole", "School");
 		tableDeps.put("SchoolHasStaffHasRole", "StaffHasRole");
 		tableDeps.put("SectionHasStaffHasRole", "Section");
 		tableDeps.put("SectionHasStaffHasRole", "StaffHasRole");
 		tableDeps.put("StaffHasRole", "Role");
 		tableDeps.put("StaffHasRole", "Staff");
 		tableDeps.put("StudentClassSubject", "ClassStudent");
 		tableDeps.put("StudentClassSubject", "ClassSubject");
 		tableDeps.put("User", "UserRole");
	}

    /**
     * Data pool factory for Classroom.
     * @return Classroom A Classroom object
     */
    public static Classroom getClassroom() {

        Classroom classroom =  getClassroom(
	        null);

		return classroom;
       
    }

     /**
     * Data pool factory for Classroom.
     * @param sectionIdsection A valid Section object
     * @return Classroom A Classroom object
     */
    public static Classroom getClassroom(Section sectionIdsection) {
        Classroom classroom = new Classroom();     
        classroom.setDivision(BasicDataGenerator.generateRandomString(45));
        classroom.setGrade(BasicDataGenerator.generateRandomInt());
		if (sectionIdsection != null) {
			sectionIdsection.addClassroom (classroom);
		}
        classroom.setYear(BasicDataGenerator.generateDate());

        return classroom;
    }

    /**
     * Data pool factory for ClassroomHasStaffHasRole.
     * @return ClassroomHasStaffHasRoleA ClassroomHasStaffHasRole object
     */
    public static ClassroomHasStaffHasRole getClassroomHasStaffHasRole() {

        ClassroomHasStaffHasRole classroomHasStaffHasRole = new ClassroomHasStaffHasRole();    
        
        classroomHasStaffHasRole.setId(getClassroomHasStaffHasRolePK());

        return classroomHasStaffHasRole;
    }

    /**
     * Data pool factory for ClassroomHasStaffHasRolePK.
     * @return ClassroomHasStaffHasRolePK A ClassroomHasStaffHasRolePK object
     */
    public static ClassroomHasStaffHasRolePK getClassroomHasStaffHasRolePK() {

        ClassroomHasStaffHasRolePK classroomHasStaffHasRolePK =  getClassroomHasStaffHasRolePK(
	        getClassroom(), getStaffHasRole());

		return classroomHasStaffHasRolePK;
       
    }

     /**
     * Data pool factory for ClassroomHasStaffHasRolePK.
     * @param classroomIdclass A valid Classroom object
     * @param staffHasRoleIdstaffHasRole A valid StaffHasRole object
     * @return ClassroomHasStaffHasRolePK A ClassroomHasStaffHasRolePK object
     */
    public static ClassroomHasStaffHasRolePK getClassroomHasStaffHasRolePK(Classroom classroomIdclass, StaffHasRole staffHasRoleIdstaffHasRole) {
        ClassroomHasStaffHasRolePK classroomHasStaffHasRolePK = new ClassroomHasStaffHasRolePK();     
        classroomHasStaffHasRolePK.setClassroomIdclass(classroomIdclass);
        classroomHasStaffHasRolePK.setStaffHasRoleIdstaffHasRole(staffHasRoleIdstaffHasRole);

        return classroomHasStaffHasRolePK;
    }

    /**
     * Data pool factory for ClassStudent.
     * @return ClassStudent A ClassStudent object
     */
    public static ClassStudent getClassStudent() {

        ClassStudent classStudent =  getClassStudent(
	        getClassroom(), getStudent());

		return classStudent;
       
    }

     /**
     * Data pool factory for ClassStudent.
     * @param classIdclass A valid Classroom object
     * @param studentIdstudent A valid Student object
     * @return ClassStudent A ClassStudent object
     */
    public static ClassStudent getClassStudent(Classroom classIdclass, Student studentIdstudent) {
        ClassStudent classStudent = new ClassStudent();     
		if (classIdclass != null) {
			classIdclass.addClassStudent (classStudent);
		}
        classStudent.setId(BasicDataGenerator.generateRandomString(45));
		if (studentIdstudent != null) {
			studentIdstudent.addClassStudent (classStudent);
		}

        return classStudent;
    }

    /**
     * Data pool factory for ClassSubject.
     * @return ClassSubject A ClassSubject object
     */
    public static ClassSubject getClassSubject() {

        ClassSubject classSubject =  getClassSubject(
	        getClassroom(), getSubject());

		return classSubject;
       
    }

     /**
     * Data pool factory for ClassSubject.
     * @param classIdclass A valid Classroom object
     * @param subjectIdsubject A valid Subject object
     * @return ClassSubject A ClassSubject object
     */
    public static ClassSubject getClassSubject(Classroom classIdclass, Subject subjectIdsubject) {
        ClassSubject classSubject = new ClassSubject();     
		if (classIdclass != null) {
			classIdclass.addClassSubject (classSubject);
		}
		if (subjectIdsubject != null) {
			subjectIdsubject.addClassSubject (classSubject);
		}

        return classSubject;
    }

    /**
     * Data pool factory for ClassSubjectHasStaffHasRole.
     * @return ClassSubjectHasStaffHasRoleA ClassSubjectHasStaffHasRole object
     */
    public static ClassSubjectHasStaffHasRole getClassSubjectHasStaffHasRole() {

        ClassSubjectHasStaffHasRole classSubjectHasStaffHasRole = new ClassSubjectHasStaffHasRole();    
        
        classSubjectHasStaffHasRole.setId(getClassSubjectHasStaffHasRolePK());

        return classSubjectHasStaffHasRole;
    }

    /**
     * Data pool factory for ClassSubjectHasStaffHasRolePK.
     * @return ClassSubjectHasStaffHasRolePK A ClassSubjectHasStaffHasRolePK object
     */
    public static ClassSubjectHasStaffHasRolePK getClassSubjectHasStaffHasRolePK() {

        ClassSubjectHasStaffHasRolePK classSubjectHasStaffHasRolePK =  getClassSubjectHasStaffHasRolePK(
	        getClassSubject(), getStaffHasRole());

		return classSubjectHasStaffHasRolePK;
       
    }

     /**
     * Data pool factory for ClassSubjectHasStaffHasRolePK.
     * @param classSubjectIdclassSubject A valid ClassSubject object
     * @param staffHasRoleIdstaffHasRole A valid StaffHasRole object
     * @return ClassSubjectHasStaffHasRolePK A ClassSubjectHasStaffHasRolePK object
     */
    public static ClassSubjectHasStaffHasRolePK getClassSubjectHasStaffHasRolePK(ClassSubject classSubjectIdclassSubject, StaffHasRole staffHasRoleIdstaffHasRole) {
        ClassSubjectHasStaffHasRolePK classSubjectHasStaffHasRolePK = new ClassSubjectHasStaffHasRolePK();     
        classSubjectHasStaffHasRolePK.setClassSubjectIdclassSubject(classSubjectIdclassSubject);
        classSubjectHasStaffHasRolePK.setStaffHasRoleIdstaffHasRole(staffHasRoleIdstaffHasRole);

        return classSubjectHasStaffHasRolePK;
    }

    /**
     * Data pool factory for Exam.
     * @return Exam A Exam object
     */
    public static Exam getExam() {

        Exam exam =  getExam(
	        null, null);

		return exam;
       
    }

     /**
     * Data pool factory for Exam.
     * @param classSubjectIdclassSubject A valid ClassSubject object
     * @param examTypeIdexamType A valid ExamType object
     * @return Exam A Exam object
     */
    public static Exam getExam(ClassSubject classSubjectIdclassSubject, ExamType examTypeIdexamType) {
        Exam exam = new Exam();     
		if (classSubjectIdclassSubject != null) {
			classSubjectIdclassSubject.addExam (exam);
		}
        exam.setDate(BasicDataGenerator.generateDate());
		if (examTypeIdexamType != null) {
			examTypeIdexamType.addExam (exam);
		}
        exam.setTerm(BasicDataGenerator.generateRandomInt());
        exam.setYear(BasicDataGenerator.generateDate());

        return exam;
    }

    /**
     * Data pool factory for ExamType.
     * @return ExamTypeA ExamType object
     */
    public static ExamType getExamType() {

        ExamType examType = new ExamType();    
        
        examType.setId(BasicDataGenerator.generateRandomInt());
        examType.setTypeName(BasicDataGenerator.generateRandomString(45));

        return examType;
    }

    /**
     * Data pool factory for Marks.
     * @return Marks A Marks object
     */
    public static Marks getMarks() {

        Marks marks =  getMarks(
	        getExam(), getStudent());

		return marks;
       
    }

     /**
     * Data pool factory for Marks.
     * @param examIdexam A valid Exam object
     * @param studentIdstudent A valid Student object
     * @return Marks A Marks object
     */
    public static Marks getMarks(Exam examIdexam, Student studentIdstudent) {
        Marks marks = new Marks();     
		if (examIdexam != null) {
			examIdexam.addMarks (marks);
		}
        marks.setMarks(BasicDataGenerator.generateRandomDouble());
		if (studentIdstudent != null) {
			studentIdstudent.addMarks (marks);
		}

        return marks;
    }

    /**
     * Data pool factory for Role.
     * @return RoleA Role object
     */
    public static Role getRole() {

        Role role = new Role();    
        
        role.setRoleName(BasicDataGenerator.generateRandomString(45));

        return role;
    }

    /**
     * Data pool factory for School.
     * @return SchoolA School object
     */
    public static School getSchool() {

        School school = new School();    
        
        school.setAddress(BasicDataGenerator.generateRandomString(45));
        school.setDistrict(BasicDataGenerator.generateRandomString(45));
        school.setName(BasicDataGenerator.generateRandomString(45));
        school.setProvince(BasicDataGenerator.generateRandomString(45));
        school.setZone(BasicDataGenerator.generateRandomString(45));

        return school;
    }

    /**
     * Data pool factory for SchoolHasStaffHasRole.
     * @return SchoolHasStaffHasRoleA SchoolHasStaffHasRole object
     */
    public static SchoolHasStaffHasRole getSchoolHasStaffHasRole() {

        SchoolHasStaffHasRole schoolHasStaffHasRole = new SchoolHasStaffHasRole();    
        
        schoolHasStaffHasRole.setId(getSchoolHasStaffHasRolePK());

        return schoolHasStaffHasRole;
    }

    /**
     * Data pool factory for SchoolHasStaffHasRolePK.
     * @return SchoolHasStaffHasRolePK A SchoolHasStaffHasRolePK object
     */
    public static SchoolHasStaffHasRolePK getSchoolHasStaffHasRolePK() {

        SchoolHasStaffHasRolePK schoolHasStaffHasRolePK =  getSchoolHasStaffHasRolePK(
	        getSchool(), getStaffHasRole());

		return schoolHasStaffHasRolePK;
       
    }

     /**
     * Data pool factory for SchoolHasStaffHasRolePK.
     * @param schoolIdschool A valid School object
     * @param staffHasRoleIdstaffHasRole A valid StaffHasRole object
     * @return SchoolHasStaffHasRolePK A SchoolHasStaffHasRolePK object
     */
    public static SchoolHasStaffHasRolePK getSchoolHasStaffHasRolePK(School schoolIdschool, StaffHasRole staffHasRoleIdstaffHasRole) {
        SchoolHasStaffHasRolePK schoolHasStaffHasRolePK = new SchoolHasStaffHasRolePK();     
        schoolHasStaffHasRolePK.setSchoolIdschool(schoolIdschool);
        schoolHasStaffHasRolePK.setStaffHasRoleIdstaffHasRole(staffHasRoleIdstaffHasRole);

        return schoolHasStaffHasRolePK;
    }

    /**
     * Data pool factory for Section.
     * @return SectionA Section object
     */
    public static Section getSection() {

        Section section = new Section();    
        
        section.setSectioncol(BasicDataGenerator.generateRandomString(45));
        section.setSectionName(BasicDataGenerator.generateRandomString(45));

        return section;
    }

    /**
     * Data pool factory for SectionHasStaffHasRole.
     * @return SectionHasStaffHasRoleA SectionHasStaffHasRole object
     */
    public static SectionHasStaffHasRole getSectionHasStaffHasRole() {

        SectionHasStaffHasRole sectionHasStaffHasRole = new SectionHasStaffHasRole();    
        
        sectionHasStaffHasRole.setId(getSectionHasStaffHasRolePK());

        return sectionHasStaffHasRole;
    }

    /**
     * Data pool factory for SectionHasStaffHasRolePK.
     * @return SectionHasStaffHasRolePK A SectionHasStaffHasRolePK object
     */
    public static SectionHasStaffHasRolePK getSectionHasStaffHasRolePK() {

        SectionHasStaffHasRolePK sectionHasStaffHasRolePK =  getSectionHasStaffHasRolePK(
	        getSection(), getStaffHasRole());

		return sectionHasStaffHasRolePK;
       
    }

     /**
     * Data pool factory for SectionHasStaffHasRolePK.
     * @param sectionIdsection A valid Section object
     * @param staffHasRoleIdstaffHasRole A valid StaffHasRole object
     * @return SectionHasStaffHasRolePK A SectionHasStaffHasRolePK object
     */
    public static SectionHasStaffHasRolePK getSectionHasStaffHasRolePK(Section sectionIdsection, StaffHasRole staffHasRoleIdstaffHasRole) {
        SectionHasStaffHasRolePK sectionHasStaffHasRolePK = new SectionHasStaffHasRolePK();     
        sectionHasStaffHasRolePK.setSectionIdsection(sectionIdsection);
        sectionHasStaffHasRolePK.setStaffHasRoleIdstaffHasRole(staffHasRoleIdstaffHasRole);

        return sectionHasStaffHasRolePK;
    }

    /**
     * Data pool factory for Staff.
     * @return StaffA Staff object
     */
    public static Staff getStaff() {

        Staff staff = new Staff();    
        
        staff.setFullname(BasicDataGenerator.generateRandomString(100));
        staff.setName(BasicDataGenerator.generateRandomString(45));
        staff.setPhoto(BasicDataGenerator.generateRandomBinary(65535));
        staff.setStaffid(BasicDataGenerator.generateRandomString(45));

        return staff;
    }

    /**
     * Data pool factory for StaffHasRole.
     * @return StaffHasRole A StaffHasRole object
     */
    public static StaffHasRole getStaffHasRole() {

        StaffHasRole staffHasRole =  getStaffHasRole(
	        getRole(), getStaff());

		return staffHasRole;
       
    }

     /**
     * Data pool factory for StaffHasRole.
     * @param roleIdrole A valid Role object
     * @param staffIdstaff A valid Staff object
     * @return StaffHasRole A StaffHasRole object
     */
    public static StaffHasRole getStaffHasRole(Role roleIdrole, Staff staffIdstaff) {
        StaffHasRole staffHasRole = new StaffHasRole();     
        staffHasRole.setEndDate(BasicDataGenerator.generateDate());
		if (roleIdrole != null) {
			roleIdrole.addStaffHasRole (staffHasRole);
		}
		if (staffIdstaff != null) {
			staffIdstaff.addStaffHasRole (staffHasRole);
		}
        staffHasRole.setStartDate(BasicDataGenerator.generateDate());

        return staffHasRole;
    }

    /**
     * Data pool factory for Student.
     * @return StudentA Student object
     */
    public static Student getStudent() {

        Student student = new Student();    
        
        student.setAddmisionNo(BasicDataGenerator.generateRandomString(45));
        student.setAddress(BasicDataGenerator.generateRandomString(400));
        student.setDob(BasicDataGenerator.generateDate());
        student.setFullName(BasicDataGenerator.generateRandomString(45));
        student.setGender(BasicDataGenerator.generateRandomString(10));
        student.setName(BasicDataGenerator.generateRandomString(45));
        student.setNameWtInitial(BasicDataGenerator.generateRandomString(45));
        student.setPhoto(BasicDataGenerator.generateRandomBinary(2147483647));

        return student;
    }

    /**
     * Data pool factory for StudentClassSubject.
     * @return StudentClassSubject A StudentClassSubject object
     */
    public static StudentClassSubject getStudentClassSubject() {

        StudentClassSubject studentClassSubject =  getStudentClassSubject(
	        getClassStudent(), getClassSubject());

		return studentClassSubject;
       
    }

     /**
     * Data pool factory for StudentClassSubject.
     * @param classStudentIdclassStudent A valid ClassStudent object
     * @param classSubjectIdclassSubject A valid ClassSubject object
     * @return StudentClassSubject A StudentClassSubject object
     */
    public static StudentClassSubject getStudentClassSubject(ClassStudent classStudentIdclassStudent, ClassSubject classSubjectIdclassSubject) {
        StudentClassSubject studentClassSubject = new StudentClassSubject();     
		if (classStudentIdclassStudent != null) {
			classStudentIdclassStudent.addStudentClassSubject (studentClassSubject);
		}
		if (classSubjectIdclassSubject != null) {
			classSubjectIdclassSubject.addStudentClassSubject (studentClassSubject);
		}

        return studentClassSubject;
    }

    /**
     * Data pool factory for Subject.
     * @return SubjectA Subject object
     */
    public static Subject getSubject() {

        Subject subject = new Subject();    
        
        subject.setIsoptional(BasicDataGenerator.generateRandomBoolean());
        subject.setName(BasicDataGenerator.generateRandomString(45));

        return subject;
    }

    /**
     * Data pool factory for User.
     * @return User A User object
     */
    public static User getUser() {

        User user =  getUser(
	        getUserRole());

		return user;
       
    }

     /**
     * Data pool factory for User.
     * @param userRoleIduserRole A valid UserRole object
     * @return User A User object
     */
    public static User getUser(UserRole userRoleIduserRole) {
        User user = new User();     
        user.setEmail(BasicDataGenerator.generateRandomString(45));
        user.setPassword(BasicDataGenerator.generateRandomString(45));
        user.setUserName(BasicDataGenerator.generateRandomString(45));
		if (userRoleIduserRole != null) {
			userRoleIduserRole.addUser (user);
		}

        return user;
    }

    /**
     * Data pool factory for UserRole.
     * @return UserRoleA UserRole object
     */
    public static UserRole getUserRole() {

        UserRole userRole = new UserRole();    
        
        userRole.setName(BasicDataGenerator.generateRandomString(45));

        return userRole;
    }
    /** Returns the commit order of this database. 
	 * Useful for iterating through the classes for deletion in the right order. 
	 * @return String[] list of classes
	 */
	public static String[] getDBCommitOrder() {
		return commitOrder;
	}
	
	/**
	 * @param className classname to return
	 * @return the tabledeps for the given class name
	 */
	public static Collection<String> getTabledeps(String className) {
		return tableDeps.get(className);
	}
	
}
