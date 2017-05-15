/**
 * 
 */
package edu.cmpe275.jobboard.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author amayd
 *
 */
@Entity
@Table(name = "jobapplication")
public class JobApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "appId", unique = true, nullable = false)
	private int appId;
	
	@ManyToOne
	@JoinColumn(name="jobId")
	private JobPosting jobposting;
	
	@ManyToOne
	@JoinColumn(name="jobSeekerId")
	private JobSeeker jobseeker;
	
	@Column(name="resume")
	private boolean resume;
	
	@Column(name="resumePath")
	private String resumePath;
	
	@Column(name="state")
	private int state;

	/**
	 * @return Application ID
	 */
	public int getAppId() {
		return appId;
	}

	/**
	 * @param appId
	 */
	public void setAppId(int appId) {
		this.appId = appId;
	}

	/**
	 * @return Job Posting
	 */
	public JobPosting getJobPosting() {
		return jobposting;
	}

	/**
	 * @param jobPosting
	 */
	public void setJobPosting(JobPosting jobPosting) {
		this.jobposting = jobPosting;
	}

	/**
	 * @return JobSeeker
	 */
	public JobSeeker getJobSeeker() {
		return jobseeker;
	}

	/**
	 * @param jobSeeker
	 */
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobseeker = jobSeeker;
	}

	/**
	 * @return True if applied through resume
	 */
	public boolean isResume() {
		return resume;
	}

	/**
	 * @param resume
	 */
	public void setResume(boolean resume) {
		this.resume = resume;
	}

	/**
	 * @return Resume path
	 */
	public String getResumePath() {
		return resumePath;
	}

	/**
	 * @param resumePath
	 */
	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}

	/**
	 * @return State of the application
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state
	 */
	public void setState(int state) {
		this.state = state;
	}

}
