package Cliente.Services.Api.Services;


import Cliente.Services.Api.Model.Clients;
import Cliente.Services.Api.Repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServices {

    private ClientRepository clientRepository;

    public List<Clients> findAll(){
        return clientRepository.findAll();
    }

    public Clients findById(int id){
        Clients client = null;
        Optional<Clients> result = clientRepository.findById(id);
        if(result.isPresent()){
            client = result.get();
        }
        return client;
    }

    public Clients add(Clients clients){
        String usuario = clients.getNombre_Usuario();
        int id = clients.getCliente_ID();
        if(usuario != null){
            clients.setNombre_Usuario(usuario.toUpperCase());
            clients.setCliente_ID(id);
        }
        return clientRepository.save(clients);
    }

    public Clients update(Clients clients){
        String Usuario = clients.getNombre_Usuario();
        if(Usuario != null){
            clients.setNombre_Usuario(Usuario.toUpperCase());
        }
        return clientRepository.save(clients);
    }

    public void deleteById(int id){
        clientRepository.deleteById(id);
    }
}
