package org.yarlithub.yschool.model.obj.yschoolLite.iface;
import java.util.Set;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassSubject;


/** 
 * Object interface mapping for hibernate-handled table: subject.
 * @author autogenerated
 */

public interface ISubject {



    /**
     * Return the value associated with the column: classSubject.
	 * @return A Set&lt;ClassSubject&gt; object (this.classSubject)
	 */
	Set<ClassSubject> getClassSubjects();
	
	/**
	 * Adds a bi-directional link of type ClassSubject to the classSubjects set.
	 * @param classSubject item to add
	 */
	void addClassSubject(ClassSubject classSubject);

  
    /**  
     * Set the value related to the column: classSubject.
	 * @param classSubject the classSubject value you wish to set
	 */
	void setClassSubjects(final Set<ClassSubject> classSubject);

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
	Integer getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Integer id);

    /**
     * Return the value associated with the column: isoptional.
	 * @return A Boolean object (this.isoptional)
	 */
	Boolean isIsoptional();
	

  
    /**  
     * Set the value related to the column: isoptional.
	 * @param isoptional the isoptional value you wish to set
	 */
	void setIsoptional(final Boolean isoptional);

    /**
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	String getName();
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	void setName(final String name);

	// end of interface
}