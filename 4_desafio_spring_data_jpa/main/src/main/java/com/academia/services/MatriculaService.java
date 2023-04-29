import com.academia.models.Matricula;
import com.academia.repositories.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;

    public List<Matricula> findAll() {
        return matriculaRepository.findAll();
    }
    
    public Matricula findById(Long id) {
        return matriculaRepository.findById(id).orElseThrow(() -> new RuntimeException("Matrícula não encontrada"));
    }
    
    public Matricula save(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }
    
    public Matricula update(Long id, Matricula matricula) {
        Matricula matriculaExistente = findById(id);
        BeanUtils.copyProperties(matricula, matriculaExistente, "id");
        return matriculaRepository.save(matriculaExistente);
    }
    
    public void delete(Long id) {
        matriculaRepository.deleteById(id);
    }
}
