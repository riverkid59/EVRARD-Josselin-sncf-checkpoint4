import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Carte } from '../models/carte';
import { CarteService } from '../services/carte.service';

@Component({
  selector: 'app-liste-carte',
  templateUrl: './liste-carte.component.html',
  styleUrls: ['./liste-carte.component.scss']
})
export class ListeCarteComponent implements OnInit {

  constructor(private carteService: CarteService) { }

  cartes : Observable<Carte[]>
  carte : Carte = new Carte();

  carteList: any;

  ngOnInit(): void {

  this.carteService.getCarteList("cartes").subscribe((data) => {
    console.log(data);
    this.carteList = data;
  });
  }
}
