package org.yarlithub.yschool.services.data;

import java.io.Serializable;
import org.yarlithub.yschool.factories.yschoolLite.*;
import org.yarlithub.yschool.model.obj.yschoolLite.Classroom;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassroomHasStaffHasRole;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassroomHasStaffHasRolePK;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassStudent;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassSubject;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassSubjectHasStaffHasRole;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassSubjectHasStaffHasRolePK;
import org.yarlithub.yschool.model.obj.yschoolLite.Exam;
import org.yarlithub.yschool.model.obj.yschoolLite.ExamType;
import org.yarlithub.yschool.model.obj.yschoolLite.Marks;
import org.yarlithub.yschool.model.obj.yschoolLite.Role;
import org.yarlithub.yschool.model.obj.yschoolLite.School;
import org.yarlithub.yschool.model.obj.yschoolLite.SchoolHasStaffHasRole;
import org.yarlithub.yschool.model.obj.yschoolLite.SchoolHasStaffHasRolePK;
import org.yarlithub.yschool.model.obj.yschoolLite.Section;
import org.yarlithub.yschool.model.obj.yschoolLite.SectionHasStaffHasRole;
import org.yarlithub.yschool.model.obj.yschoolLite.SectionHasStaffHasRolePK;
import org.yarlithub.yschool.model.obj.yschoolLite.Staff;
import org.yarlithub.yschool.model.obj.yschoolLite.StaffHasRole;
import org.yarlithub.yschool.model.obj.yschoolLite.Student;
import org.yarlithub.yschool.model.obj.yschoolLite.StudentClassSubject;
import org.yarlithub.yschool.model.obj.yschoolLite.Subject;
import org.yarlithub.yschool.model.obj.yschoolLite.User;
import org.yarlithub.yschool.model.obj.yschoolLite.UserRole;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import java.util.Collection;
import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.felees.hbnpojogen.persistence.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.hibernate.LockOptions;
import org.hibernate.SessionFactory;
import org.hibernate.proxy.HibernateProxy;
/** 
 * Data layer.
 * @author autogenerated
 */
@org.springframework.stereotype.Component
public class DataLayerYschoolLiteImpl implements DataLayerYschoolLite {
	/** Singleton reference to this class. */
	private static DataLayerYschoolLite instance;
	/** map lock. */
	private static Object daoMapLock = new Object();

	/** Internal handle. */
	private static Map<Class<?>, GenericDAO<?, ?>> daoMap = null; 
	
		/** Inner handle. */
	private static ApplicationContext context;
 /** Sessionfactory in use. Filled in by Spring. */ 
    private SessionFactory sessionFactory = null;
	
	/** Handle to get back ourselves and perform correct injection. 
	 * @param ctxt filled by spring
	 */
	@Autowired
	public void setApplicationContext(ApplicationContext ctxt) {
		DataLayerYschoolLiteImpl.context = ctxt;
	}
	
	
		
 	/**
     * Set session factory.
     * @param sessionFactory sessionfactory to use. 
     */
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    /** 
	* Returns a DAO instance of the given type.
	* @param <T> Type
	* @param persistentObject to get
	* @return GenericDAO<T, ?> object
     */
    @SuppressWarnings("unchecked")
    private <T> GenericDAO<T, ?> getDAO(final T persistentObject) {
		T persistent = persistentObject;

		synchronized (daoMapLock) {
    		if (daoMap == null) {
    			daoMap = new ConcurrentHashMap<Class<?>, GenericDAO<?, ?>>(); 
	 	   		daoMap.put(Classroom.class, HibernateYschoolLiteDaoFactory.getClassroomDao());
	 	   		daoMap.put(ClassroomHasStaffHasRole.class, HibernateYschoolLiteDaoFactory.getClassroomHasStaffHasRoleDao());
	 	   		daoMap.put(ClassStudent.class, HibernateYschoolLiteDaoFactory.getClassStudentDao());
	 	   		daoMap.put(ClassSubject.class, HibernateYschoolLiteDaoFactory.getClassSubjectDao());
	 	   		daoMap.put(ClassSubjectHasStaffHasRole.class, HibernateYschoolLiteDaoFactory.getClassSubjectHasStaffHasRoleDao());
	 	   		daoMap.put(Exam.class, HibernateYschoolLiteDaoFactory.getExamDao());
	 	   		daoMap.put(ExamType.class, HibernateYschoolLiteDaoFactory.getExamTypeDao());
	 	   		daoMap.put(Marks.class, HibernateYschoolLiteDaoFactory.getMarksDao());
	 	   		daoMap.put(Role.class, HibernateYschoolLiteDaoFactory.getRoleDao());
	 	   		daoMap.put(School.class, HibernateYschoolLiteDaoFactory.getSchoolDao());
	 	   		daoMap.put(SchoolHasStaffHasRole.class, HibernateYschoolLiteDaoFactory.getSchoolHasStaffHasRoleDao());
	 	   		daoMap.put(Section.class, HibernateYschoolLiteDaoFactory.getSectionDao());
	 	   		daoMap.put(SectionHasStaffHasRole.class, HibernateYschoolLiteDaoFactory.getSectionHasStaffHasRoleDao());
	 	   		daoMap.put(Staff.class, HibernateYschoolLiteDaoFactory.getStaffDao());
	 	   		daoMap.put(StaffHasRole.class, HibernateYschoolLiteDaoFactory.getStaffHasRoleDao());
	 	   		daoMap.put(Student.class, HibernateYschoolLiteDaoFactory.getStudentDao());
	 	   		daoMap.put(StudentClassSubject.class, HibernateYschoolLiteDaoFactory.getStudentClassSubjectDao());
	 	   		daoMap.put(Subject.class, HibernateYschoolLiteDaoFactory.getSubjectDao());
	 	   		daoMap.put(User.class, HibernateYschoolLiteDaoFactory.getUserDao());
	 	   		daoMap.put(UserRole.class, HibernateYschoolLiteDaoFactory.getUserRoleDao());
    		}
		 }
		if (persistentObject instanceof HibernateProxy) {
			persistent = (T) ((HibernateProxy) persistentObject).getHibernateLazyInitializer().getImplementation();
		} 
		
		GenericDAO<T, ?> result = (GenericDAO<T, ?>) daoMap.get(persistent.getClass());
		if (result == null) {
			throw new IllegalAccessError("The given object is of an incorrect type. ");
		}
		return result;
    }

    /**
     * Deletes the given object from disk.
     * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to delete
     */
    public <T> void delete(T persistentObject) {
    	    	getDAO(persistentObject).delete(persistentObject);
    }
    /**
     * Refresh the object $class.className from disk.
     * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to reload
     */
    public <T> void refresh(T persistentObject) {
	    	getDAO(persistentObject).refresh(persistentObject);
    }

    /**
     * Saves the given object to disk.
     * @param persistentObject Object to save
	 * @param <T> A DataLayerObject-derived type
     * @return Identifier of saved object 
     */
    public <T> Serializable save(T persistentObject) {
        return getDAO(persistentObject).save(persistentObject);
    }
    /**
     * Saves or updates the given $class.className object to disk.
	 * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to save 
     */
    public <T> void saveOrUpdate(T persistentObject) {
        getDAO(persistentObject).saveOrUpdate(persistentObject);
    }
    /**
     * Updates the given object to disk.
	 * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to update 
     */
    public <T> void update(T persistentObject) {
        getDAO(persistentObject).update(persistentObject);
    }


    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Classroom obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassroom(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getClassroomDao().delete(loadClassroom(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Classroom object
     */
    public Classroom loadClassroom(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getClassroomDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Classroom getClassroom(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getClassroomDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassroomHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassroomHasStaffHasRole(final ClassroomHasStaffHasRolePK id)  {
        HibernateYschoolLiteDaoFactory.getClassroomHasStaffHasRoleDao().delete(loadClassroomHasStaffHasRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassroomHasStaffHasRole object
     */
    public ClassroomHasStaffHasRole loadClassroomHasStaffHasRole(final ClassroomHasStaffHasRolePK id) {
        return HibernateYschoolLiteDaoFactory.getClassroomHasStaffHasRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ClassroomHasStaffHasRole getClassroomHasStaffHasRole(final ClassroomHasStaffHasRolePK id) {
        return HibernateYschoolLiteDaoFactory.getClassroomHasStaffHasRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassStudent obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassStudent(final String id)  {
        HibernateYschoolLiteDaoFactory.getClassStudentDao().delete(loadClassStudent(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassStudent object
     */
    public ClassStudent loadClassStudent(final String id) {
        return HibernateYschoolLiteDaoFactory.getClassStudentDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ClassStudent getClassStudent(final String id) {
        return HibernateYschoolLiteDaoFactory.getClassStudentDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassSubject obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassSubject(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getClassSubjectDao().delete(loadClassSubject(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassSubject object
     */
    public ClassSubject loadClassSubject(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getClassSubjectDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ClassSubject getClassSubject(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getClassSubjectDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassSubjectHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassSubjectHasStaffHasRole(final ClassSubjectHasStaffHasRolePK id)  {
        HibernateYschoolLiteDaoFactory.getClassSubjectHasStaffHasRoleDao().delete(loadClassSubjectHasStaffHasRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassSubjectHasStaffHasRole object
     */
    public ClassSubjectHasStaffHasRole loadClassSubjectHasStaffHasRole(final ClassSubjectHasStaffHasRolePK id) {
        return HibernateYschoolLiteDaoFactory.getClassSubjectHasStaffHasRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ClassSubjectHasStaffHasRole getClassSubjectHasStaffHasRole(final ClassSubjectHasStaffHasRolePK id) {
        return HibernateYschoolLiteDaoFactory.getClassSubjectHasStaffHasRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Exam obj) directly
     * @param id Identifier to delete
     */
    public void deleteExam(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getExamDao().delete(loadExam(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Exam object
     */
    public Exam loadExam(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getExamDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Exam getExam(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getExamDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ExamType obj) directly
     * @param id Identifier to delete
     */
    public void deleteExamType(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getExamTypeDao().delete(loadExamType(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ExamType object
     */
    public ExamType loadExamType(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getExamTypeDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ExamType getExamType(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getExamTypeDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Marks obj) directly
     * @param id Identifier to delete
     */
    public void deleteMarks(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getMarksDao().delete(loadMarks(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Marks object
     */
    public Marks loadMarks(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getMarksDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Marks getMarks(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getMarksDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Role obj) directly
     * @param id Identifier to delete
     */
    public void deleteRole(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getRoleDao().delete(loadRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Role object
     */
    public Role loadRole(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Role getRole(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (School obj) directly
     * @param id Identifier to delete
     */
    public void deleteSchool(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getSchoolDao().delete(loadSchool(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a School object
     */
    public School loadSchool(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getSchoolDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public School getSchool(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getSchoolDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (SchoolHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteSchoolHasStaffHasRole(final SchoolHasStaffHasRolePK id)  {
        HibernateYschoolLiteDaoFactory.getSchoolHasStaffHasRoleDao().delete(loadSchoolHasStaffHasRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a SchoolHasStaffHasRole object
     */
    public SchoolHasStaffHasRole loadSchoolHasStaffHasRole(final SchoolHasStaffHasRolePK id) {
        return HibernateYschoolLiteDaoFactory.getSchoolHasStaffHasRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public SchoolHasStaffHasRole getSchoolHasStaffHasRole(final SchoolHasStaffHasRolePK id) {
        return HibernateYschoolLiteDaoFactory.getSchoolHasStaffHasRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Section obj) directly
     * @param id Identifier to delete
     */
    public void deleteSection(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getSectionDao().delete(loadSection(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Section object
     */
    public Section loadSection(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getSectionDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Section getSection(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getSectionDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (SectionHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteSectionHasStaffHasRole(final SectionHasStaffHasRolePK id)  {
        HibernateYschoolLiteDaoFactory.getSectionHasStaffHasRoleDao().delete(loadSectionHasStaffHasRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a SectionHasStaffHasRole object
     */
    public SectionHasStaffHasRole loadSectionHasStaffHasRole(final SectionHasStaffHasRolePK id) {
        return HibernateYschoolLiteDaoFactory.getSectionHasStaffHasRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public SectionHasStaffHasRole getSectionHasStaffHasRole(final SectionHasStaffHasRolePK id) {
        return HibernateYschoolLiteDaoFactory.getSectionHasStaffHasRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Staff obj) directly
     * @param id Identifier to delete
     */
    public void deleteStaff(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getStaffDao().delete(loadStaff(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Staff object
     */
    public Staff loadStaff(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getStaffDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Staff getStaff(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getStaffDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (StaffHasRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteStaffHasRole(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getStaffHasRoleDao().delete(loadStaffHasRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a StaffHasRole object
     */
    public StaffHasRole loadStaffHasRole(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getStaffHasRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public StaffHasRole getStaffHasRole(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getStaffHasRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Student obj) directly
     * @param id Identifier to delete
     */
    public void deleteStudent(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getStudentDao().delete(loadStudent(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Student object
     */
    public Student loadStudent(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getStudentDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Student getStudent(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getStudentDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (StudentClassSubject obj) directly
     * @param id Identifier to delete
     */
    public void deleteStudentClassSubject(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getStudentClassSubjectDao().delete(loadStudentClassSubject(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a StudentClassSubject object
     */
    public StudentClassSubject loadStudentClassSubject(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getStudentClassSubjectDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public StudentClassSubject getStudentClassSubject(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getStudentClassSubjectDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Subject obj) directly
     * @param id Identifier to delete
     */
    public void deleteSubject(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getSubjectDao().delete(loadSubject(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Subject object
     */
    public Subject loadSubject(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getSubjectDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Subject getSubject(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getSubjectDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (User obj) directly
     * @param id Identifier to delete
     */
    public void deleteUser(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getUserDao().delete(loadUser(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a User object
     */
    public User loadUser(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getUserDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public User getUser(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getUserDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (UserRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteUserRole(final Integer id)  {
        HibernateYschoolLiteDaoFactory.getUserRoleDao().delete(loadUserRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a UserRole object
     */
    public UserRole loadUserRole(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getUserRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public UserRole getUserRole(final Integer id) {
        return HibernateYschoolLiteDaoFactory.getUserRoleDao().get(id);
    }  
    /** Returns a singleton instance of this class.
     * @return an singleton instance
     */
    public static synchronized DataLayerYschoolLite getInstance() {
        
        if (instance == null) {
        	if (context == null) {
        		throw new IllegalStateException("Context is null. Make sure Spring is initialized.");
        	}
     		instance = (DataLayerYschoolLite) context.getBean("dataLayerYschoolLiteImpl");
        }
        
        return instance; 
    }
    /** Returns a query handle.
     * @param query Query to use
     * @return A query instance
     */
     public Query createQuery(final String query) {
        return this.sessionFactory.getCurrentSession().createQuery(query);
    }
    /** Returns a criteria handle.
     * @param criteria Criteria to use
     * @return A criteria instance
     */
     public Criteria createCriteria(final String criteria) {
        return this.sessionFactory.getCurrentSession().createCriteria(criteria);
    }
    /** Returns a Query handle based on your package-level named query.
     * @param query Query to use
     * @return A query instance
     */
     public Query getNamedQuery(final String query) {
        return this.sessionFactory.getCurrentSession().getNamedQuery(query);
    }
    /** Create a new Criteria instance, for the given entity class, or a superclass of an entity class.
	* @param persistentObject a class, which is persistent, or has persistent subclasses 
	* @return Criteria instance
	*/
	@SuppressWarnings("rawtypes")
	public Criteria createCriteria(Class persistentObject) {
        return this.sessionFactory.getCurrentSession().createCriteria(persistentObject);
    }
    /** Flushes the currently open session.
	*/
	public void flushSession() {
        this.sessionFactory.getCurrentSession().flush();
    }
    /** Clears the currently open session.
	*/
	public void clearSession() {
        this.sessionFactory.getCurrentSession().clear();
    }
    /** Flushes and clears the currently open session.
	*/
	public void flushAndClearSession() {
		flushSession();
		clearSession();
    }
	/** Call currentSession.replicate.
	 * @param obj to replicate
	 * @param replicationMode mode
	 */ 
	public void replicate(Object obj, ReplicationMode replicationMode) {
		this.sessionFactory.getCurrentSession().replicate(obj, replicationMode);
	}
	/** Hibernate Merge. 
	 * @param obj to merge
	 * @return obj merged.
	 */
	public Object merge(Object obj) {
		return this.sessionFactory.getCurrentSession().merge(obj);
	}
	/** Returns the current session.
	 * @return the currently active session
	 */
	public Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	/** Returns a query handle.
     * @param query Query to use
     * @return A query instance
     */
     public SQLQuery createSQLQuery(final String query) {
        return this.sessionFactory.getCurrentSession().createSQLQuery(query);
    }
    /** Remove this instance from the session cache. 
	 * Changes to the instance will not be synchronized with the database
	 * @param obj object to evict
	 */
	public void evict(Object obj) {
        this.sessionFactory.getCurrentSession().evict(obj);
    }
    /**
     * Return the persistent instance of the given entity class with the given 
     * identifier, or null if there is no such persistent instance. 
     * (If the instance, or a proxy for the instance, is already 
     * associated with the session, return that instance or proxy)
     *
     * @param clazz a persistent class
     * @param id a valid identifier of an existing persistent instance of the class
     * @return a persistent instance or null
     * @throws HibernateException
     */
	public Object get(Class<?> clazz, Serializable id) throws HibernateException {
        return this.sessionFactory.getCurrentSession().get(clazz, id);
    }	


    /**
     * Return the persistent instance of the given entity class with the given identifier, assuming that the instance exists.
     *You should not use this method to determine if an instance exists (use get() instead). Use this only to retrieve an instance that you assume exists, where non-existence would be an actual error.
     *
     * @param clazz a persistent class
     * @param id a valid identifier of an existing persistent instance of the class
     * @return the persistent instance or proxy
     * @throws HibernateException
     */
	public Object load(Class<?> clazz, Serializable id) throws HibernateException {
        return this.sessionFactory.getCurrentSession().load(clazz, id);  
    }
	/**
	 * Reattaches the given entity to the current session using LockMode.NONE
	 *
	 * @param entity to reattach
	 */
	public void reattachEntityWithNoLock(IPojoGenEntity entity) {
		if (entity != null) {
            		this.sessionFactory.getCurrentSession().buildLockRequest(LockOptions.NONE).lock(entity);
    		}
	}
	/**
	 * Reattaches the given entities to the current session.
	 *
	 * @param entities to attach
	 */
	public void reattachEntitiesWithNoLock(Collection<? extends IPojoGenEntity> entities) {
   		if (entities != null) {
		       for (IPojoGenEntity entity : entities) {
            		this.sessionFactory.getCurrentSession().buildLockRequest(LockOptions.NONE).lock(entity);
        		 }
    		}
	}}

