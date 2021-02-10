import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Carte } from '../models/carte';
import { FormBuilder, Validators } from '@angular/forms';
import { CarteService } from '../services/carte.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-modif-carte',
  templateUrl: './modif-carte.component.html',
  styleUrls: ['./modif-carte.component.scss']
})
export class ModifCarteComponent implements OnInit {


  constructor(private carteService : CarteService, private route: ActivatedRoute, private router: Router, private fb: FormBuilder) { }

  cartes : Observable<Carte[]>
  carte : Carte = new Carte();

  carteList: any;
  currentCarte: null;
  message = " ";

  vendeur= this.fb.group({
    cp: ['', Validators.required],
    nomVendeur: ['', Validators.required],
  })
  
  carteForm = this.fb.group({
    id: ['', Validators.required],
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

    this.getCarte(this.route.snapshot.paramMap.get('id'));
  }

  getCarte(id): void {
    this.carteService.getCarteByID(id).subscribe(data => {
      this.currentCarte = data;
      this.carteForm.setValue(data)
      console.log(id);
    },
    error => {
      console.log(id);
    });
  }

  // this.carteService.getCarteList("cartes").subscribe((data) => {
  //   console.log(data);
  //   this.carteList = data;
  // });


  modifCarte(): void {
  this.carteService.modifCarte(this.carteForm.get('id').value, this.currentCarte).subscribe(response => {
    console.log(response);
    this.message = "La carte à bien été modifiée !";
  },
  error => {
    console.log(error);
  });

  //     console.log(data);
  //     this.carte = new Carte();
  //   });
  // }
}
}
