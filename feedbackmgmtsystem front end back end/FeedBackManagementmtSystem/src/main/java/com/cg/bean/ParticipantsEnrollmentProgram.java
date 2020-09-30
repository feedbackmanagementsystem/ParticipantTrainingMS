package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;




@Entity
@Table(name="PatricipantsEnrollProgram")
@DynamicInsert
@DynamicUpdate

public class ParticipantsEnrollmentProgram {
	
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int participantId;
	
	@Column(name="participantName")
	private String participantName;
	
	@Column(name="phoneNumber")
	private String participantsPhoneNumber;
	
	@Column(name="programCode")
	private String participantsTraingProgramCode;
	
	@Column(name="programName")
	private String participantsTraingProgramName;
	
	@Column(name="programDuration")
	private String traingProgramDuration;

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public String getParticipantsPhoneNumber() {
		return participantsPhoneNumber;
	}

	public void setParticipantsPhoneNumber(String participantsPhoneNumber) {
		this.participantsPhoneNumber = participantsPhoneNumber;
	}

	public String getParticipantsTraingProgramCode() {
		return participantsTraingProgramCode;
	}

	public void setParticipantsTraingProgramCode(String participantsTraingProgramCode) {
		this.participantsTraingProgramCode = participantsTraingProgramCode;
	}

	public String getParticipantsTraingProgramName() {
		return participantsTraingProgramName;
	}

	public void setParticipantsTraingProgramName(String participantsTraingProgramName) {
		this.participantsTraingProgramName = participantsTraingProgramName;
	}

	public String getTraingProgramDuration() {
		return traingProgramDuration;
	}

	public void setTraingProgramDuration(String traingProgramDuration) {
		this.traingProgramDuration = traingProgramDuration;
	}

	
	
	public ParticipantsEnrollmentProgram() {
		super();
	}

	public ParticipantsEnrollmentProgram(int participantId, String participantName, String participantsPhoneNumber,
			String participantsTraingProgramCode, String participantsTraingProgramName, String traingProgramDuration) {
		super();
		this.participantId = participantId;
		this.participantName = participantName;
		this.participantsPhoneNumber = participantsPhoneNumber;
		this.participantsTraingProgramCode = participantsTraingProgramCode;
		this.participantsTraingProgramName = participantsTraingProgramName;
		this.traingProgramDuration = traingProgramDuration;
	}

	@Override
	public String toString() {
		return "ParticipantsEnrollmentProgram [participantId=" + participantId + ", participantName=" + participantName
				+ ", participantsPhoneNumber=" + participantsPhoneNumber + ", participantsTraingProgramCode="
				+ participantsTraingProgramCode + ", participantsTraingProgramName=" + participantsTraingProgramName
				+ ", traingProgramDuration=" + traingProgramDuration + "]";
	}
	
	
	
	

}
