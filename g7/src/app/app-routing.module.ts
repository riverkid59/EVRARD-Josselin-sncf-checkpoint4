import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccueilComponent } from './accueil/accueil.component';
import { FormulaireCarteComponent } from './formulaire-carte/formulaire-carte.component';
import { ListeCarteComponent } from './liste-carte/liste-carte.component';
import { ModifCarteComponent } from './modif-carte/modif-carte.component';


const routes: Routes = [
  {
    path: '', component: AccueilComponent
  },
  {
    path: 'vendre' , component: FormulaireCarteComponent
  },
  {
    path: 'modifier/:id' , component: ModifCarteComponent
  },
  {
    path: 'liste' , component: ListeCarteComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
