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
@Table(name = "jobapplication")
public class JobApplication {

	private int appId;
	private JobPosting jobPosting;
	private JobSeeker jobSeeker;
	private boolean resume;
	private String resumePath;
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
		return jobPosting;
	}

	/**
	 * @param jobPosting
	 */
	public void setJobPosting(JobPosting jobPosting) {
		this.jobPosting = jobPosting;
	}

	/**
	 * @return JobSeeker
	 */
	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

	/**
	 * @param jobSeeker
	 */
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
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
