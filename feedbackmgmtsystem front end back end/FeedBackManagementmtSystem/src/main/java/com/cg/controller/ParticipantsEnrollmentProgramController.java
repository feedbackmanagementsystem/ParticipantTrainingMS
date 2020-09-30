package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.ParticipantsEnrollmentProgram;
import com.cg.service.ParticipantsEnrollmentProgramServiceImpl;



@RestController
@CrossOrigin("*")

public class ParticipantsEnrollmentProgramController {
	
	//@Autowire is internally uses setter or constructor injection
		@Autowired
		
		ParticipantsEnrollmentProgramServiceImpl participantsenrollmentservice;
		//Autowiring the LoanServiceImpl class by using the annotation @Autowired.

		

			@GetMapping("/enrollparticipants")
			public List<ParticipantsEnrollmentProgram> viewParticipantsEnrollmentProgram()
			{
				return participantsenrollmentservice.viewParticipantsEnrollmentProgram();
			}
			
			//search the loanRequest using participantId
			@GetMapping(value="/enrollparticipants/{participantId}",produces= {"application/json"})
			public List<ParticipantsEnrollmentProgram> viewParticipantsEnrollmentProgram(@PathVariable int participantId){
				
				return participantsenrollmentservice.viewParticipantsEnrollmentProgram(participantId);
			}
			
			//@RequestBody annotation maps the HttpRequest body to a transfer or domain object
			//posting the data in   ParticipantsEnrollmentProgram
			@PostMapping(value="/enrollparticipants/add",consumes = {"application/json"})
			public List<ParticipantsEnrollmentProgram> addParticipantsEnrollmentProgram(@RequestBody ParticipantsEnrollmentProgram enrollparticipants){
				return participantsenrollmentservice.addParticipantsEnrollmentProgram(enrollparticipants);
			}
			
			//deleting the whole row data of ParticipantsEnrollmentProgram
			@DeleteMapping("/enrollparticipants/delete/{participantId}")
			public List<ParticipantsEnrollmentProgram> deleteParticipantsEnrollmentProgram(@PathVariable int participantId){
				return participantsenrollmentservice.deleteParticipantsEnrollmentProgram(participantId);
			}
			
			
			//updating the data of ParticipantsEnrollmentProgram
			@PutMapping(value="/enrollparticipants/modify",consumes= {"application/json"})
			public List<ParticipantsEnrollmentProgram> modifyParticipantsEnrollmentProgram(@RequestBody ParticipantsEnrollmentProgram enrollparticipants) {
				return participantsenrollmentservice.modifyParticipantsEnrollmentProgram(enrollparticipants);
			}


}
