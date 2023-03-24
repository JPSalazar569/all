import { Component } from '@angular/core';

@Component({
  selector: 'app-crear-agenda',
  templateUrl: './crear-agenda.component.html',
  styleUrls: ['./crear-agenda.component.css']
})
export class CrearAgendaComponent {

  validarData = () => {
    let nombre = (<HTMLInputElement>document.getElementById("nombres")).value;
    alert("el nombre es: " + nombre)
  }

  ngOnInit(): void {
  const labels = document.querySelectorAll('.form-control label')

  labels.forEach(label => {
    label.innerHTML = label.innerHTML
      .split('')
      .map((letter, idx) => `<span style="transition-delay:${idx * 50}ms">${letter}</span>`)
      .join('')
  })
}
  
}
