package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.ParticipantsEnrollmentProgram;
import com.cg.dao.ParticipantsEnrollmentProgramDaoImpl;




@Service

public class ParticipantsEnrollmentProgramServiceImpl {
	
	@Autowired
	private ParticipantsEnrollmentProgramDaoImpl enrollparticipantsdao;
	
	public List<ParticipantsEnrollmentProgram> viewParticipantsEnrollmentProgram(int participantId) 
	{
		List<ParticipantsEnrollmentProgram>  enrollparticipants1= enrollparticipantsdao.getParticipantsEnrollmentProgram(participantId);
		if(enrollparticipants1!=null)
		{
			return enrollparticipantsdao.getParticipantsEnrollmentProgram(participantId);
		}
		else
		{
			System.out.println("No Data Found");
		}
		return enrollparticipants1;
		
	}
		
	
	public List<ParticipantsEnrollmentProgram> addParticipantsEnrollmentProgram(ParticipantsEnrollmentProgram enrollparticipants) {
		
		return enrollparticipantsdao.addParticipantsEnrollmentProgram(enrollparticipants);
	}
	
	public List<ParticipantsEnrollmentProgram> deleteParticipantsEnrollmentProgram(int participantId) {
		return enrollparticipantsdao.deleteParticipantsEnrollmentProgram(participantId);
	}
	
	public List<ParticipantsEnrollmentProgram> modifyParticipantsEnrollmentProgram(ParticipantsEnrollmentProgram enrollparticipants) {
		
		int participantId=enrollparticipants.getParticipantId();
		
		List<ParticipantsEnrollmentProgram> enrollparticipants1=viewParticipantsEnrollmentProgram(participantId);
		
		if(enrollparticipants1!=null)
		{
			return enrollparticipantsdao.modifyviewParticipantsEnrollmentProgram(enrollparticipants);
		}
		else
		{
			System.out.println("");
		}
		return enrollparticipants1;
		
		
	}

	public List<ParticipantsEnrollmentProgram> viewParticipantsEnrollmentProgram() {
		
		return enrollparticipantsdao.viewParticipantsEnrollmentProgram();
	}
	
	
	
}

