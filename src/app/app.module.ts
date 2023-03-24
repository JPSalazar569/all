import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './rutas/app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './components/menu/menu.component';
import { ContenidoComponent } from './components/contenido/contenido.component';
import { FooterComponent } from './components/footer/footer.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CrearAgendaComponent } from './components/crear-agenda/crear-agenda.component';
import { ListarComponent } from './components/listar/listar.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ListarAgendaService } from './services/listar-agenda.service';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    ContenidoComponent,
    FooterComponent,
    CrearAgendaComponent,
    ListarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ListarAgendaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
