/**
 * 
 */
package edu.cmpe275.jobboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author amayd
 *
 */
@Entity
@Table(name="jobseeker")
public class JobSeeker {
	
	private int jobseekerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private int workEx;
	private int highestEducation;
	private String skills;
	
	/**
	 * @return JobSeeker Id
	 */
	public int getJobseekerId() {
		return jobseekerId;
	}
	/**
	 * @param jobseekerId
	 */
	public void setJobseekerId(int jobseekerId) {
		this.jobseekerId = jobseekerId;
	}
	/**
	 * @return First Name
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return Last Name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return EmailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return Password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return Work Experience In Years
	 */
	public int getWorkEx() {
		return workEx;
	}
	/**
	 * @param workEx
	 */
	public void setWorkEx(int workEx) {
		this.workEx = workEx;
	}
	/**
	 * @return Highest Education
	 */
	public int getHighestEducation() {
		return highestEducation;
	}
	/**
	 * @param highestEducation
	 */
	public void setHighestEducation(int highestEducation) {
		this.highestEducation = highestEducation;
	}
	/**
	 * @return Skills
	 */
	public String getSkills() {
		return skills;
	}
	/**
	 * @param skills
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

}
