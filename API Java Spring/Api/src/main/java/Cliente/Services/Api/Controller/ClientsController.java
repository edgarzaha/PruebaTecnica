package Cliente.Services.Api.Controller;

import Cliente.Services.Api.Model.Clients;
import Cliente.Services.Api.Services.ClientServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/NutriNET/Cliente")
public class ClientsController {

    @Autowired
    private ClientServices clientServices;

    @GetMapping
    public ResponseEntity<List<Clients>> get(){
        HttpStatus status = null;
        List<Clients> clientsList = new ArrayList<>();
        try{
            clientsList = clientServices.findAll();
            if(clientsList.size()>0)
            {
                status = HttpStatus.OK;
            }else{
                status = HttpStatus.NO_CONTENT;
            }
        }catch(Exception e){
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return  new ResponseEntity<List<Clients>>(clientsList, status);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clients> getById(@PathVariable("id") int id){
        HttpStatus status = null;
        Clients clients = new Clients();
        try{
            clients = clientServices.findById(id);
            if(clients != null){
                status = HttpStatus.OK;
            }else {
                status = HttpStatus.NOT_FOUND;
            }
        }catch(Exception e){
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<Clients>(clients,status);
    }

    @PostMapping
    public ResponseEntity<Clients> post(@RequestBody Clients clients){
        HttpStatus status = null;
        Clients clientstmp = new Clients();
        try{
            clientstmp = clientServices.add(clients);
            status = HttpStatus.CREATED;
        }catch (Exception e){
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return ResponseEntity.status(status).body(clientstmp);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clients> put(@RequestBody Clients clients, @PathVariable("id") int id){
        HttpStatus status = null;
        Clients clientstmp = new Clients();
        try{
            clients.setCliente_ID(id);
            clientstmp = clientServices.update(clients);
            status = HttpStatus.CREATED;
        }catch (Exception e){
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return ResponseEntity.status(status).body(clientstmp);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Clients> delete(@PathVariable("id") int id){
        HttpStatus status = null;
        try{
            clientServices.deleteById(id);
            status = HttpStatus.OK;
        }catch (Exception e){
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<Clients>(status);
    }
}
