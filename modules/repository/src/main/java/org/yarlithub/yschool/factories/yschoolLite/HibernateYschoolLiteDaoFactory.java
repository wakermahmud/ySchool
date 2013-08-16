package org.yarlithub.yschool.factories.yschoolLite;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.BeanNameAware;

import org.yarlithub.yschool.model.dao.yschoolLite.*;

/** 
 * DAO factory implementation.
 * @author autogenerated
 */
@Component
public class HibernateYschoolLiteDaoFactory implements ApplicationContextAware, BeanNameAware {
	/** Placeholder for an instance. */
	private static HibernateYschoolLiteDaoFactory instance;
	/** Internal state. */
	private static ApplicationContext context = null;
	/** Bean Name. */
	private static String beanName;

	/** Return an instance of this class.
	 * @return an instance of this class
	 */
	public static synchronized HibernateYschoolLiteDaoFactory getInstance() {
		if (instance == null) {
			instance = (HibernateYschoolLiteDaoFactory) context.getBean(beanName);
		}
		return instance;
	}

	/**
	 * Sets a Spring Application Context object.
  	 * @param ctxt ApplicationContext to set
	 * @throws BeansException on spring error
	 */
	@Autowired
	public void setApplicationContext(ApplicationContext ctxt)
			throws BeansException 
	{
		context = ctxt;
	}

	/**
	* 
	* {@inheritDoc}
	* 
	* @see org.springframework.beans.factory.BeanNameAware#setBeanName(java.lang.String)
	*/
	public void setBeanName(String name) {
		beanName = name;
	}

	/**
	 * Return the requested bean from the context, throwing a RuntimeException on error.
	 *
	 * @param beanName to return
	 * @return the bean requested.
	 */
	public static Object getBean(String beanName) {
		Object result = context.getBean(beanName);
		if (result == null) { 
			throw new IllegalStateException(String.format("Could not find bean '%s'. Did you set the right component scanning?", beanName));
		} 
		
		return result;
	}

	
	/**
	 * Returns a ClassStudentDao instance.
	 * 
	 * @return a ClassStudentDao instance
	 */
	public static ClassStudentDao getClassStudentDao() {
		return (ClassStudentDao) getBean("classStudentDaoImpl"); 
	}
	/**
	 * Returns a ClassSubjectDao instance.
	 * 
	 * @return a ClassSubjectDao instance
	 */
	public static ClassSubjectDao getClassSubjectDao() {
		return (ClassSubjectDao) getBean("classSubjectDaoImpl"); 
	}
	/**
	 * Returns a ClassSubjectHasStaffHasRoleDao instance.
	 * 
	 * @return a ClassSubjectHasStaffHasRoleDao instance
	 */
	public static ClassSubjectHasStaffHasRoleDao getClassSubjectHasStaffHasRoleDao() {
		return (ClassSubjectHasStaffHasRoleDao) getBean("classSubjectHasStaffHasRoleDaoImpl"); 
	}
	/**
	 * Returns a ClassroomDao instance.
	 * 
	 * @return a ClassroomDao instance
	 */
	public static ClassroomDao getClassroomDao() {
		return (ClassroomDao) getBean("classroomDaoImpl"); 
	}
	/**
	 * Returns a ClassroomHasStaffHasRoleDao instance.
	 * 
	 * @return a ClassroomHasStaffHasRoleDao instance
	 */
	public static ClassroomHasStaffHasRoleDao getClassroomHasStaffHasRoleDao() {
		return (ClassroomHasStaffHasRoleDao) getBean("classroomHasStaffHasRoleDaoImpl"); 
	}
	/**
	 * Returns a ExamDao instance.
	 * 
	 * @return a ExamDao instance
	 */
	public static ExamDao getExamDao() {
		return (ExamDao) getBean("examDaoImpl"); 
	}
	/**
	 * Returns a ExamTypeDao instance.
	 * 
	 * @return a ExamTypeDao instance
	 */
	public static ExamTypeDao getExamTypeDao() {
		return (ExamTypeDao) getBean("examTypeDaoImpl"); 
	}
	/**
	 * Returns a MarksDao instance.
	 * 
	 * @return a MarksDao instance
	 */
	public static MarksDao getMarksDao() {
		return (MarksDao) getBean("marksDaoImpl"); 
	}
	/**
	 * Returns a RoleDao instance.
	 * 
	 * @return a RoleDao instance
	 */
	public static RoleDao getRoleDao() {
		return (RoleDao) getBean("roleDaoImpl"); 
	}
	/**
	 * Returns a SchoolDao instance.
	 * 
	 * @return a SchoolDao instance
	 */
	public static SchoolDao getSchoolDao() {
		return (SchoolDao) getBean("schoolDaoImpl"); 
	}
	/**
	 * Returns a SchoolHasStaffHasRoleDao instance.
	 * 
	 * @return a SchoolHasStaffHasRoleDao instance
	 */
	public static SchoolHasStaffHasRoleDao getSchoolHasStaffHasRoleDao() {
		return (SchoolHasStaffHasRoleDao) getBean("schoolHasStaffHasRoleDaoImpl"); 
	}
	/**
	 * Returns a SectionDao instance.
	 * 
	 * @return a SectionDao instance
	 */
	public static SectionDao getSectionDao() {
		return (SectionDao) getBean("sectionDaoImpl"); 
	}
	/**
	 * Returns a SectionHasStaffHasRoleDao instance.
	 * 
	 * @return a SectionHasStaffHasRoleDao instance
	 */
	public static SectionHasStaffHasRoleDao getSectionHasStaffHasRoleDao() {
		return (SectionHasStaffHasRoleDao) getBean("sectionHasStaffHasRoleDaoImpl"); 
	}
	/**
	 * Returns a StaffDao instance.
	 * 
	 * @return a StaffDao instance
	 */
	public static StaffDao getStaffDao() {
		return (StaffDao) getBean("staffDaoImpl"); 
	}
	/**
	 * Returns a StaffHasRoleDao instance.
	 * 
	 * @return a StaffHasRoleDao instance
	 */
	public static StaffHasRoleDao getStaffHasRoleDao() {
		return (StaffHasRoleDao) getBean("staffHasRoleDaoImpl"); 
	}
	/**
	 * Returns a StudentDao instance.
	 * 
	 * @return a StudentDao instance
	 */
	public static StudentDao getStudentDao() {
		return (StudentDao) getBean("studentDaoImpl"); 
	}
	/**
	 * Returns a StudentClassSubjectDao instance.
	 * 
	 * @return a StudentClassSubjectDao instance
	 */
	public static StudentClassSubjectDao getStudentClassSubjectDao() {
		return (StudentClassSubjectDao) getBean("studentClassSubjectDaoImpl"); 
	}
	/**
	 * Returns a SubjectDao instance.
	 * 
	 * @return a SubjectDao instance
	 */
	public static SubjectDao getSubjectDao() {
		return (SubjectDao) getBean("subjectDaoImpl"); 
	}
	/**
	 * Returns a UserDao instance.
	 * 
	 * @return a UserDao instance
	 */
	public static UserDao getUserDao() {
		return (UserDao) getBean("userDaoImpl"); 
	}
	/**
	 * Returns a UserRoleDao instance.
	 * 
	 * @return a UserRoleDao instance
	 */
	public static UserRoleDao getUserRoleDao() {
		return (UserRoleDao) getBean("userRoleDaoImpl"); 
	}

}
