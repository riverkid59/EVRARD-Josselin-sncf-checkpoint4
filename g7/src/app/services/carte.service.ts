import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Carte } from '../models/carte'
import { Observable } from 'rxjs';
import { Vendeur } from '../models/vendeur';


@Injectable({
  providedIn: 'root'
})
export class CarteService {

  url: string = "http://localhost:8080/";

  selectionCp: String = '';

  selectionVendeur: String = '';

  cartes : any = [];
  vendeurs: any = [];

  constructor(private http: HttpClient) { }


public ajouterCarte(data) {
  const options = {headers: {'Content-Type': 'application/json'}}
  return this.http.post(this.url + "cartes", data, options);
  }

public getCarteList(road : string): Observable<Carte[]> {
  const myUrl : string = this.url;
  return this.http.get<Carte[]>(myUrl + 'cartes');
}

public getVendeurList(road : string): Observable<Vendeur[]> {
  const myUrl : string = this.url;
  return this.http.get<Vendeur[]>(myUrl + 'vendeurs');
}

public getCarteByID(id : string): Observable<any> {
  const myUrl : string = this.url + "cartes/" + id;
  return this.http.get(myUrl);
}


public getVendeurById(id : string): Observable<any> {
  const myUrl : string = this.url + "vendeurs/" + id;
  return this.http.get(myUrl);
}

public modifCarte(id: number, value: any): Observable<any> {
  const myUrl : string = this.url  + "cartes/" + id;
  const options = {headers: {'Content-Type': 'application/json'}}
  return this.http.put(myUrl, value, options);
}

public deleteCarteByID(id :number): Observable<any> {
  const myUrl : string = this.url + "cartes/" + id ;
  return this.http.delete(myUrl);
}

}
