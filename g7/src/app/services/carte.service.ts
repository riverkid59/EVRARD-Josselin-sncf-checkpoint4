import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Carte } from '../models/carte'
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CarteService {

  url: string = "http://localhost:8080/";

  selectionCp: String = '';

  selectionVendeur: String = '';

  cartes : any = [];

  constructor(private http: HttpClient) { }


public ajouterCarte(data) {
  const options = {headers: {'Content-Type': 'application/json'}}
  return this.http.post(this.url + "cartes", data, options);
  }

public getCarteList(road : string): Observable<Carte[]> {
  const myUrl : string = this.url;
  return this.http.get<Carte[]>(myUrl + 'cartes');
}

public getCarteByID(id : string): Observable<Carte[]> {
  const myUrl : string = this.url + "cartes/" + id;
  return this.http.get<Carte[]>(myUrl);
}


public getVendeurs(road : string): Observable<any> {
  const myUrl : string = this.url + road;
  return this.http.get(myUrl);
}

public modifCarte(data) {
  const myUrl : string = this.url;
  const options = {headers: {'Content-Type': 'application/json'}}
  return this.http.put(myUrl + "cartes/", data, options);
}

}
