package edu.cmpe275.jobboard.dao;

import edu.cmpe275.jobboard.entity.JobPosting;


public interface JobPostingDao {
	
	/**
	 * @param Job
	 * @return New JobPosting
	 * @throws Exception 
	 */
	JobPosting createJobPosting(JobPosting job) throws Exception;
	
	/**
	 * @param id
	 * @return Requested JobPosting
	 */
	JobPosting getJobPosting(String id);

	/**
	 * @param id
	 * @return True if JobPosting is Deleted
	 */
	boolean deleteJobPosting(String id);

	/**
	 * @param job
	 * @return Updated Job Posting
	 */
	JobPosting updateJobPosting(JobPosting j);

}