package org.yarlithub.yschool.model.obj.yschoolLite.iface;
import org.yarlithub.yschool.model.obj.yschoolLite.Classroom;
import org.yarlithub.yschool.model.obj.yschoolLite.StaffHasRole;


/** 
 * Object interface mapping for hibernate-handled table: classroom_has_staff_has_role.
 * @author autogenerated
 */

public interface IClassroomHasStaffHasRolePK {



    /**
     * Return the value associated with the column: classroomIdclass.
	 * @return A Classroom object (this.classroomIdclass)
	 */
	Classroom getClassroomIdclass();
	

  
    /**  
     * Set the value related to the column: classroomIdclass.
	 * @param classroomIdclass the classroomIdclass value you wish to set
	 */
	void setClassroomIdclass(final Classroom classroomIdclass);

    /**
     * Return the value associated with the column: staffHasRoleIdstaffHasRole.
	 * @return A StaffHasRole object (this.staffHasRoleIdstaffHasRole)
	 */
	StaffHasRole getStaffHasRoleIdstaffHasRole();
	

  
    /**  
     * Set the value related to the column: staffHasRoleIdstaffHasRole.
	 * @param staffHasRoleIdstaffHasRole the staffHasRoleIdstaffHasRole value you wish to set
	 */
	void setStaffHasRoleIdstaffHasRole(final StaffHasRole staffHasRoleIdstaffHasRole);

	// end of interface
}