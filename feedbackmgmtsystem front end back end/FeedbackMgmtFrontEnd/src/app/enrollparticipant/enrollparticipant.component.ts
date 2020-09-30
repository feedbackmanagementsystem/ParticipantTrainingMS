import { Component, OnInit } from '@angular/core';
import { from } from 'rxjs';
import { DisbursementserviceService } from '../disbursementservice.service';
import { Participant} from '../participant'


@Component({
  selector: 'app-enrollparticipant',
  templateUrl: './enrollparticipant.component.html',
  styleUrls: ['./enrollparticipant.component.css']
})
export class enrollparticipantComponent implements OnInit {

  message:any;
  participant:Participant=new Participant(0,'','','','','',);
 
  constructor(private service:DisbursementserviceService) { }

  

  ngOnInit(): void {
    
  }

  public registerNow(){
    let resp=this.service.doRegistration(this.participant);
    resp.subscribe((data)=>this.message=data);
  }

}