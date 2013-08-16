package org.yarlithub.yschool.model.obj.yschoolLite;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassSubjectHasStaffHasRole;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassroomHasStaffHasRole;
import org.yarlithub.yschool.model.obj.yschoolLite.SchoolHasStaffHasRole;
import org.yarlithub.yschool.model.obj.yschoolLite.SectionHasStaffHasRole;
import org.yarlithub.yschool.model.obj.yschoolLite.iface.IStaffHasRole;


/** 
 * Object mapping for hibernate-handled table: staff_has_role.
 * @author autogenerated
 */

@Entity
@Table(name = "staff_has_role", schema = "yschool_lite")
public class StaffHasRole implements Cloneable, Serializable, IPojoGenEntity, IStaffHasRole {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559009378L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Set<ClassroomHasStaffHasRole> classroomHasStaffHasRoles = new HashSet<ClassroomHasStaffHasRole>();

	/** Field mapping. */
	private Set<ClassSubjectHasStaffHasRole> classSubjectHasStaffHasRoles = new HashSet<ClassSubjectHasStaffHasRole>();

	/** Field mapping. */
	private Date endDate;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Role roleIdrole;
	/** Field mapping. */
	private Set<SchoolHasStaffHasRole> schoolHasStaffHasRoles = new HashSet<SchoolHasStaffHasRole>();

	/** Field mapping. */
	private Set<SectionHasStaffHasRole> sectionHasStaffHasRoles = new HashSet<SectionHasStaffHasRole>();

	/** Field mapping. */
	private Staff staffIdstaff;
	/** Field mapping. */
	private Date startDate;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public StaffHasRole() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public StaffHasRole(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param id Integer object;
	 * @param roleIdrole Role object;
	 * @param staffIdstaff Staff object;
	 * @param startDate Date object;
	 */
	public StaffHasRole(Integer id, Role roleIdrole, Staff staffIdstaff, 					
			Date startDate) {

		this.id = id;
		this.roleIdrole = roleIdrole;
		this.staffIdstaff = staffIdstaff;
		this.startDate = startDate;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return StaffHasRole.class;
	}
 

    /**
     * Return the value associated with the column: classroomHasStaffHasRole.
	 * @return A Set&lt;ClassroomHasStaffHasRole&gt; object (this.classroomHasStaffHasRole)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.staffHasRoleIdstaffHasRole"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "idstaff_has_role", nullable = false  )
	public Set<ClassroomHasStaffHasRole> getClassroomHasStaffHasRoles() {
		return this.classroomHasStaffHasRoles;
		
	}
	
	/**
	 * Adds a bi-directional link of type ClassroomHasStaffHasRole to the classroomHasStaffHasRoles set.
	 * @param classroomHasStaffHasRole item to add
	 */
	public void addClassroomHasStaffHasRole(ClassroomHasStaffHasRole classroomHasStaffHasRole) {
		classroomHasStaffHasRole.getId().setStaffHasRoleIdstaffHasRole(this);
		this.classroomHasStaffHasRoles.add(classroomHasStaffHasRole);
	}

  
    /**  
     * Set the value related to the column: classroomHasStaffHasRole.
	 * @param classroomHasStaffHasRole the classroomHasStaffHasRole value you wish to set
	 */
	public void setClassroomHasStaffHasRoles(final Set<ClassroomHasStaffHasRole> classroomHasStaffHasRole) {
		this.classroomHasStaffHasRoles = classroomHasStaffHasRole;
	}

    /**
     * Return the value associated with the column: classSubjectHasStaffHasRole.
	 * @return A Set&lt;ClassSubjectHasStaffHasRole&gt; object (this.classSubjectHasStaffHasRole)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.staffHasRoleIdstaffHasRole"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "idstaff_has_role", nullable = false  )
	public Set<ClassSubjectHasStaffHasRole> getClassSubjectHasStaffHasRoles() {
		return this.classSubjectHasStaffHasRoles;
		
	}
	
	/**
	 * Adds a bi-directional link of type ClassSubjectHasStaffHasRole to the classSubjectHasStaffHasRoles set.
	 * @param classSubjectHasStaffHasRole item to add
	 */
	public void addClassSubjectHasStaffHasRole(ClassSubjectHasStaffHasRole classSubjectHasStaffHasRole) {
		classSubjectHasStaffHasRole.getId().setStaffHasRoleIdstaffHasRole(this);
		this.classSubjectHasStaffHasRoles.add(classSubjectHasStaffHasRole);
	}

  
    /**  
     * Set the value related to the column: classSubjectHasStaffHasRole.
	 * @param classSubjectHasStaffHasRole the classSubjectHasStaffHasRole value you wish to set
	 */
	public void setClassSubjectHasStaffHasRoles(final Set<ClassSubjectHasStaffHasRole> classSubjectHasStaffHasRole) {
		this.classSubjectHasStaffHasRoles = classSubjectHasStaffHasRole;
	}

    /**
     * Return the value associated with the column: endDate.
	 * @return A Date object (this.endDate)
	 */
	@Basic( optional = true )
	@Column( name = "end_date"  )
	public Date getEndDate() {
		return this.endDate;
		
	}
	

  
    /**  
     * Set the value related to the column: endDate.
	 * @param endDate the endDate value you wish to set
	 */
	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "idstaff_has_role", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: roleIdrole.
	 * @return A Role object (this.roleIdrole)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "Role_idRole", nullable = false )
	public Role getRoleIdrole() {
		return this.roleIdrole;
		
	}
	

  
    /**  
     * Set the value related to the column: roleIdrole.
	 * @param roleIdrole the roleIdrole value you wish to set
	 */
	public void setRoleIdrole(final Role roleIdrole) {
		this.roleIdrole = roleIdrole;
	}

    /**
     * Return the value associated with the column: schoolHasStaffHasRole.
	 * @return A Set&lt;SchoolHasStaffHasRole&gt; object (this.schoolHasStaffHasRole)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.staffHasRoleIdstaffHasRole"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "idstaff_has_role", nullable = false  )
	public Set<SchoolHasStaffHasRole> getSchoolHasStaffHasRoles() {
		return this.schoolHasStaffHasRoles;
		
	}
	
	/**
	 * Adds a bi-directional link of type SchoolHasStaffHasRole to the schoolHasStaffHasRoles set.
	 * @param schoolHasStaffHasRole item to add
	 */
	public void addSchoolHasStaffHasRole(SchoolHasStaffHasRole schoolHasStaffHasRole) {
		schoolHasStaffHasRole.getId().setStaffHasRoleIdstaffHasRole(this);
		this.schoolHasStaffHasRoles.add(schoolHasStaffHasRole);
	}

  
    /**  
     * Set the value related to the column: schoolHasStaffHasRole.
	 * @param schoolHasStaffHasRole the schoolHasStaffHasRole value you wish to set
	 */
	public void setSchoolHasStaffHasRoles(final Set<SchoolHasStaffHasRole> schoolHasStaffHasRole) {
		this.schoolHasStaffHasRoles = schoolHasStaffHasRole;
	}

    /**
     * Return the value associated with the column: sectionHasStaffHasRole.
	 * @return A Set&lt;SectionHasStaffHasRole&gt; object (this.sectionHasStaffHasRole)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.staffHasRoleIdstaffHasRole"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "idstaff_has_role", nullable = false  )
	public Set<SectionHasStaffHasRole> getSectionHasStaffHasRoles() {
		return this.sectionHasStaffHasRoles;
		
	}
	
	/**
	 * Adds a bi-directional link of type SectionHasStaffHasRole to the sectionHasStaffHasRoles set.
	 * @param sectionHasStaffHasRole item to add
	 */
	public void addSectionHasStaffHasRole(SectionHasStaffHasRole sectionHasStaffHasRole) {
		sectionHasStaffHasRole.getId().setStaffHasRoleIdstaffHasRole(this);
		this.sectionHasStaffHasRoles.add(sectionHasStaffHasRole);
	}

  
    /**  
     * Set the value related to the column: sectionHasStaffHasRole.
	 * @param sectionHasStaffHasRole the sectionHasStaffHasRole value you wish to set
	 */
	public void setSectionHasStaffHasRoles(final Set<SectionHasStaffHasRole> sectionHasStaffHasRole) {
		this.sectionHasStaffHasRoles = sectionHasStaffHasRole;
	}

    /**
     * Return the value associated with the column: staffIdstaff.
	 * @return A Staff object (this.staffIdstaff)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "Staff_idStaff", nullable = false )
	public Staff getStaffIdstaff() {
		return this.staffIdstaff;
		
	}
	

  
    /**  
     * Set the value related to the column: staffIdstaff.
	 * @param staffIdstaff the staffIdstaff value you wish to set
	 */
	public void setStaffIdstaff(final Staff staffIdstaff) {
		this.staffIdstaff = staffIdstaff;
	}

    /**
     * Return the value associated with the column: startDate.
	 * @return A Date object (this.startDate)
	 */
	@Basic( optional = false )
	@Column( name = "start_date", nullable = false  )
	public Date getStartDate() {
		return this.startDate;
		
	}
	

  
    /**  
     * Set the value related to the column: startDate.
	 * @param startDate the startDate value you wish to set
	 */
	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public StaffHasRole clone() throws CloneNotSupportedException {
		
        final StaffHasRole copy = (StaffHasRole)super.clone();

		if (this.getClassroomHasStaffHasRoles() != null) {
			copy.getClassroomHasStaffHasRoles().addAll(this.getClassroomHasStaffHasRoles());
		}
		if (this.getClassSubjectHasStaffHasRoles() != null) {
			copy.getClassSubjectHasStaffHasRoles().addAll(this.getClassSubjectHasStaffHasRoles());
		}
		copy.setEndDate(this.getEndDate());
		copy.setId(this.getId());
		copy.setRoleIdrole(this.getRoleIdrole());
		if (this.getSchoolHasStaffHasRoles() != null) {
			copy.getSchoolHasStaffHasRoles().addAll(this.getSchoolHasStaffHasRoles());
		}
		if (this.getSectionHasStaffHasRoles() != null) {
			copy.getSectionHasStaffHasRoles().addAll(this.getSectionHasStaffHasRoles());
		}
		copy.setStaffIdstaff(this.getStaffIdstaff());
		copy.setStartDate(this.getStartDate());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("endDate: " + this.getEndDate() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("startDate: " + this.getStartDate());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final StaffHasRole that; 
		try {
			that = (StaffHasRole) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getEndDate() == null) && (that.getEndDate() == null)) || (getEndDate() != null && getEndDate().equals(that.getEndDate())));
		result = result && (((getRoleIdrole() == null) && (that.getRoleIdrole() == null)) || (getRoleIdrole() != null && getRoleIdrole().getId().equals(that.getRoleIdrole().getId())));	
		result = result && (((getStaffIdstaff() == null) && (that.getStaffIdstaff() == null)) || (getStaffIdstaff() != null && getStaffIdstaff().getId().equals(that.getStaffIdstaff().getId())));	
		result = result && (((getStartDate() == null) && (that.getStartDate() == null)) || (getStartDate() != null && getStartDate().equals(that.getStartDate())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
