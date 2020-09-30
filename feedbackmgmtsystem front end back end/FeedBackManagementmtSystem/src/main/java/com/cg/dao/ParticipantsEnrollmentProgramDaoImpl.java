package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.bean.ParticipantsEnrollmentProgram;


@Repository
@Transactional
public class ParticipantsEnrollmentProgramDaoImpl {
	
	
	//@PersistenceContext annotation use to inject an EntityManager in an client 
		@PersistenceContext
		
		EntityManager em;
		/*EntityManager API is used to create and remove persistent entity instances,
		to find entities by their primary key, and to query over entities.
		*/
		
		//Enroll New Participants
		public List<ParticipantsEnrollmentProgram> addParticipantsEnrollmentProgram(ParticipantsEnrollmentProgram enrollparticipants)
		{
			em.persist(enrollparticipants);
			return viewParticipantsEnrollmentProgram();
		}
		
		
		//view all Enroll Participants
		@SuppressWarnings("unchecked")
		public List<ParticipantsEnrollmentProgram> viewParticipantsEnrollmentProgram()
		{
			Query query=em.createQuery("select enrollparticipants from ParticipantsEnrollmentProgram enrollparticipants");
			return query.getResultList();
		}
		
		//view specific Enrollment
		public List<ParticipantsEnrollmentProgram> getParticipantsEnrollmentProgram(int participantId)
		{
			Query query=em.createQuery("select l from ParticipantsEnrollmentProgram l where l.participantId=:id");
			query.setParameter("id", participantId);
			@SuppressWarnings("unchecked")
			List<ParticipantsEnrollmentProgram> list=query.getResultList();
			
			return list;
		}
		
		//removing unwanted Enrollment
		public List<ParticipantsEnrollmentProgram> deleteParticipantsEnrollmentProgram(int participantId) {
			em.remove(getParticipantsEnrollmentProgram(participantId).get(0));
			return viewParticipantsEnrollmentProgram();
		}
		
		
		//modify Enrollment details
		public List<ParticipantsEnrollmentProgram> modifyviewParticipantsEnrollmentProgram(ParticipantsEnrollmentProgram enrollparticipants) {
			em.merge(enrollparticipants);
			return viewParticipantsEnrollmentProgram();
		}


		
	}

	//@SuppressWarnings annotation type allows Java programmers to disable compilation warnings for a certain part of a program

		


