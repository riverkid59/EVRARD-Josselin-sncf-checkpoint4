import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Carte } from '../models/carte';
import { Vendeur } from '../models/vendeur';
import { CarteService } from '../services/carte.service';

@Component({
  selector: 'app-liste-carte',
  templateUrl: './liste-carte.component.html',
  styleUrls: ['./liste-carte.component.scss']
})
export class ListeCarteComponent implements OnInit {

  constructor(private route: ActivatedRoute, private router: Router, private carteService: CarteService) { }

  id: number;
  cartes : Observable<Carte[]>;
  carte : Carte = new Carte();

  carteList: Carte[];
  

  vendeurs : Observable<Vendeur[]>
  vendeur : Vendeur = new Vendeur();

  vendeurList: any;

  ngOnInit(): void {
    this.refreshCarteList();
   }

  supprimerCarte(id): void {
    this.carteService.deleteCarteByID(id).subscribe(() => {
    this.refreshCarteList();},
    error => {
      console.log(error);
    });
  }

  refreshCarteList() {
    this.carteService.getCarteList("cartes").subscribe((data) => {
      console.log(data);
      this.carteList = data;
    });

  }
}
