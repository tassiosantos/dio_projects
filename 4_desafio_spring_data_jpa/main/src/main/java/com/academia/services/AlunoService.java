import com.academia.models;
import com.academia.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Aluno findById(Long id) {
        return alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno update(Long id, Aluno aluno) {
        Aluno alunoExistente = findById(id);
        BeanUtils.copyProperties(aluno, alunoExistente, "id");
        return alunoRepository.save(alunoExistente);
    }

    public void delete(Long id) {
        alunoRepository.deleteById(id);
    }


}
