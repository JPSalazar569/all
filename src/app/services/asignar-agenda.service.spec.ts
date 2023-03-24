import { TestBed } from '@angular/core/testing';

import { AsignarAgendaService } from './asignar-agenda.service';

describe('AsignarAgendaService', () => {
  let service: AsignarAgendaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AsignarAgendaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
