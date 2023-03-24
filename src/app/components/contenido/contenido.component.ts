import { Component } from '@angular/core';
import { start } from '@popperjs/core';
import { Calendar } from 'fullcalendar'
import { __values } from 'tslib';

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
    let valores_eventos = [
      {title:'Yamaha', start: '2023-03-10T15:45:00', end: '2023-03-13T14:20:00'},
      {title:'Suzuki', start: '2023-03-14T15:46:00', end: '2023-03-17T09:20:00'},
      {title:'Yamaha', start: '2023-03-19T15:47:00', end: '2023-03-25T20:20:00'}
    ]
    /*console.log("usando valores estaticos: "+valores_eventos[0]['title'],' ',valores_eventos[1]['start']);*/
    /*valores_eventos.forEach((index) => {console.log("nombre del evento: " + index.title + ";" + index.start)})*/
    
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
      eventTimeFormat: {
        hour: 'numeric',
        minute: '2-digit',
        meridiem: 'short',
        hour12: true
      },
    })
    valores_eventos.forEach(event => calendar.addEvent(event))
    calendar.render()
  }
}