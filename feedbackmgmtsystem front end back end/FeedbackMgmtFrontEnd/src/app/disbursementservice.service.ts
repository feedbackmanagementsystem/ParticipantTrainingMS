import { Participant } from './participant';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DisbursementserviceService {
  constructor(private http:HttpClient) { }
  public doRegistration(participant:Participant):Observable<any>{

    alert(participant.participantId)
    return this.http.post("http://localhost:1717/enrollparticipants/add",participant,{responseType:'text' as 'json'});
  }

  getenrollparticipants():Observable<any>{
    return this.http.get("http://localhost:1717/enrollparticipants");
  }

  getenrollparticipantsByParticipantId(participantId:number):Observable<any>{
    alert(participantId)
    return this.http.get("http://localhost:1717/enrollparticipants/"+participantId);
  }

  
   public putenrollparticipants(enrollparticipant):Observable<any> {
    return this.http.put("http://localhost:1717/enrollparticipants/modify",enrollparticipant,{responseType:'text' as 'json'});
    
  }
  
  public deleteenrollparticipants(participantId:number):Observable<any> {
    alert(participantId)
    return this.http.delete("http://localhost:1717/enrollparticipants/delete/"+participantId);
  }
}

