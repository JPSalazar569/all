import { TestBed } from '@angular/core/testing';

import { ListarAgendaService } from './listar-agenda.service';

describe('ListarAgendaService', () => {
  let service: ListarAgendaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListarAgendaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
