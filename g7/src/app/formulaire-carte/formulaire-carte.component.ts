import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { CarteService } from '../services/carte.service';

@Component({
  selector: 'app-formulaire-carte',
  templateUrl: './formulaire-carte.component.html',
  styleUrls: ['./formulaire-carte.component.scss']
})
export class FormulaireCarteComponent implements OnInit {

  constructor(private carteService: CarteService, private fb: FormBuilder) { }

vendeur= this.fb.group({
  cp: ['', Validators.required],
  nomVendeur: ['', Validators.required],
})

creationCarte = this.fb.group({
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
  }

  creerCarte() {
    this.carteService.ajouterCarte(this.creationCarte.value).subscribe({
      next: (data) => { },
      error: bug => console.log(bug)
    });
    console.log(this.creationCarte.value)
   }

}
