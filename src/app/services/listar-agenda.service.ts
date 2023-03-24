import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Clientes } from '../models/cliente';

@Injectable({
  providedIn: 'root'
})
export class ListarAgendaService {

  url = "http://localhost:8181/api/agenda/listarCitas";

  constructor(private http: HttpClient) { }

  getCitas():Observable<any>{
    return this.http.get<Clientes[]>(this.url);
  }
}
