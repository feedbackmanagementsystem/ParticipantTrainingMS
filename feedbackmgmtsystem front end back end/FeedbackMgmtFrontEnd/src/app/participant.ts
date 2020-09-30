export class Participant{
   
    participantId:number;
    participantName:string;
    participantsPhoneNumber:string;
    participantsTraingProgramCode:string;
    participantsTraingProgramName:string;
    traingProgramDuration:string;
    
    
constructor(participantId:number,participantName:string, participantsPhoneNumber:string,participantsTraingProgramCode:string,participantsTraingProgramName:string,traingProgramDuration:string)
{
    this.participantId=participantId;
    this.participantName=participantName;
    this. participantsPhoneNumber= participantsPhoneNumber;
    this.participantsTraingProgramCode=participantsTraingProgramCode;
    this.participantsTraingProgramName=participantsTraingProgramName;
    this.traingProgramDuration=traingProgramDuration;
    

}
}
