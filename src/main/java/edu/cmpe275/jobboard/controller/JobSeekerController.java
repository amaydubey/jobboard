/**
 * 
 */
package edu.cmpe275.jobboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import edu.cmpe275.jobboard.dao.JobSeekerDao;

/**
 * @author amayd
 *
 */
@RestController
public class JobSeekerController {
	
	@Autowired
	JobSeekerDao jobSeekerDao;
	
}
