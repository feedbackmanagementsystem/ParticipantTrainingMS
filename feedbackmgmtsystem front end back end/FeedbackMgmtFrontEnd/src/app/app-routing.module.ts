import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


import { trainingprogramComponent } from './trainingprogram/trainingprogram.component';
import { enrollparticipantComponent } from './enrollparticipant/enrollparticipant.component';


const routes: Routes = [
  {path:"",redirectTo:"registerparticipant",pathMatch:"full"},
  {path:"registerparticipant",component:enrollparticipantComponent},
  {path:"trainingprogram",component:trainingprogramComponent},
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
