import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Carte } from '../models/carte';
import { FormBuilder, Validators } from '@angular/forms';
import { CarteService } from '../services/carte.service';

@Component({
  selector: 'app-modif-carte',
  templateUrl: './modif-carte.component.html',
  styleUrls: ['./modif-carte.component.scss']
})
export class ModifCarteComponent implements OnInit {

  constructor(private carteService : CarteService, private fb: FormBuilder) { }

  cartes : Observable<Carte[]>
  carte : Carte = new Carte();

  carteList: any;

  vendeur= this.fb.group({
    cp: ['', Validators.required],
    nomVendeur: ['', Validators.required],
  })
  
  modifierCarte = this.fb.group({
    nom: ['', Validators.required],
    prenom: ['', Validators.required],
    mail: ['', Validators.required],
    birthday: ['', Validators.required],
    telephone: ['', Validators.required],
    adresse: ['', Validators.required],
    debutValidite: ['', Validators.required],
    finValidite: ['', Validators.required],
  })

  ngOnInit(): void {

  this.carteService.getCarteList("cartes").subscribe((data) => {
    console.log(data);
    this.carteList = data;
  });
  }

  modifCarte() {
    this.carteService.modifCarte(this.carte).subscribe((data) => {
      console.log(data);
      this.carte = new Carte();
    });
  }
}
