import { Component } from '@angular/core';
import { Calendar } from 'fullcalendar'

@Component({
  selector: 'app-contenido',
  templateUrl: './contenido.component.html',
  styleUrls: ['./contenido.component.css']
})
export class ContenidoComponent {
  /*document.addEventListener('DOMContentLoaded', function() {
  const calendarEl = document.getElementById('calendar')
  const calendar = new Calendar(calendarEl, {
    initialView: 'dayGridMonth'
  })
  calendar.render()
})*/
  
  ngOnInit(){

    let meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];

    const calendarE1:any = document.getElementById('calendar')
    const calendar = new Calendar(calendarE1, {
      initialView: 'dayGridMonth',
      height: 500,
      locale: 'Es',
      titleFormat:{
        month: 'long'

      },
      buttonText: {
        today: 'Hoy',
        month: 'Mes'
      },
      events: [
        {
          title: 'Moises',
          start: '2023-03-03T09:00:00'
        },
        {
          title: 'Arnulfo',
          start: '2023-03-03T14:40:00',
        }
      ],
      eventTimeFormat: {
        hour: 'numeric',
        minute: '2-digit',
        meridiem: 'short',
        hour12: true
      },
    })
    calendar.render()
  }
}
