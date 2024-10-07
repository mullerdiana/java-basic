package study.demo_web_api.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import study.demo_web_api.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de respositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de respositório");
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para exclusão"));
        System.out.println(id);
    }
    
    public List<Usuario> findAll() {
        System.out.println("List - listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Diana", "password"));
        usuarios.add(new Usuario("Gabriel", "passwordG"));
        return usuarios;
    }
    
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localização"));
        return new Usuario("Diana", "password");   
    }
    
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localização"));
        return new Usuario();   
    }

}
