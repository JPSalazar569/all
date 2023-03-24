package com.disegraf.agendamiento.repository;

//llamo la entidad respectiva
import com.disegraf.agendamiento.entity.Agendamiento;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Lau
 */

@Repository
public interface AgendamientoRepository extends JpaRepository<Agendamiento, Integer>{
    
    Optional<Agendamiento> findByNombres(String nombres);
    List<Agendamiento> findByFecha(String fechaCita);
    
    boolean existsByNombres(String nombres);
    boolean existsByFecha(String fecha);
    
    @Transactional
    //public void save(Agendamiento agendamiento);
    List<Agendamiento> save(List<Agendamiento> agendamiento);

    public void deleteById(int id);

    public boolean existsById(int id);

    public Optional<Agendamiento> findById(int id);
}
