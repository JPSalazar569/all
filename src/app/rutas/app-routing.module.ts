import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContenidoComponent } from '../components/contenido/contenido.component';
import { CrearAgendaComponent } from '../components/crear-agenda/crear-agenda.component';
import { ListarComponent } from '../components/listar/listar.component';

const routes: Routes = [
  {'path': 'agendados', 'component': ContenidoComponent},
  {'path': 'asignar', 'component': CrearAgendaComponent},
  {'path': 'listar', 'component': ListarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
