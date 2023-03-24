import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { ListarAgendaService } from 'src/app/services/listar-agenda.service';
import { Clientes } from 'src/app/models/cliente';
import { Calendar } from 'fullcalendar'

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  clientes: Clientes[];
  @Output() hora_seleccionada = new EventEmitter<String>();

  constructor(private listarAgenda: ListarAgendaService, private router: Router) {
    this.clientes = [];
  }

  ngOnInit(): void {

    this.listarAgenda.getCitas().subscribe(
      data => {
        const calendarE1: any = document.getElementById('calendar')
        const calendar = new Calendar(calendarE1, {
          initialView: 'dayGridMonth',
          height: 500,
          locale: 'Es',
          titleFormat: {
            month: 'long'

          },
          buttonText: {
            today: 'Hoy',
            month: 'Mes'
          },
          eventTimeFormat: {
            hour: 'numeric',
            minute: '2-digit',
            meridiem: 'short',
            hour12: true
          },
        })

        let valores_eventos = []
        this.clientes = data
        for (let i = 0; i < this.clientes.length; i++) {
          valores_eventos.push({ title: '' + this.clientes[i].nombres, start: '' + this.clientes[i].fecha + "T" + this.clientes[i].hora });
          //console.log(valores_eventos)
        }
        //valores_eventos = [{title:'Yamaha', start: '2023-03-10T15:45:00'}]
        valores_eventos.forEach(event => calendar.addEvent(event))
        valores_eventos.forEach(datas => console.log(datas))

        calendar.render()
      }
    )

  }

}
