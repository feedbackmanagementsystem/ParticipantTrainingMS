import { Component, OnInit } from '@angular/core';
import { DisbursementserviceService } from '../disbursementservice.service';
@Component({
  selector: 'app-trainingprogram',
  templateUrl: './trainingprogram.component.html',
  styleUrls: ['./trainingprogram.component.css']
})
export class trainingprogramComponent implements OnInit {
  enrollparticipants:any[]=[];
  participant:any;
  participantId:number;
  constructor(private service:DisbursementserviceService) { }

  public deleteenrollparticipant(participant){ 
    let resp= this.service.deleteenrollparticipants(participant.participantId)
    resp.subscribe((data)=>this.enrollparticipants=data);
   }
   
   public findenrollparticipantByparticipantId(){
     let resp= this.service.getenrollparticipantsByParticipantId(this.participantId);
     resp.subscribe((data)=>this.enrollparticipants=data);
    }

    public putenrollparticipant(){
      let resp= this.service.putenrollparticipants(this.participant);
      resp.subscribe((data)=>this.enrollparticipants=data);
     }

  ngOnInit(): void {
    let resp=this.service.getenrollparticipants();
    resp.subscribe((data)=>this.enrollparticipants=data);
  }

}
