package com.CosmeticosBelleza.demo.Controller;

import com.CosmeticosBelleza.demo.Model.ClienteModel;
import com.CosmeticosBelleza.demo.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping
    public ArrayList<ClienteModel> listarTodos(){
        return clienteService.getAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<ClienteModel>consultarPorId(@PathVariable("id") int ID){
        return clienteService.get(ID);
    }

    //@PostMapping(path = "/consultar")
    //public ArrayList<ClienteModel>
    @PostMapping()
    public ClienteModel registar(@RequestBody ClienteModel e){
        return clienteService.save(e);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Object>Eliminar(@PathVariable int ID){
        boolean res = clienteService.delete(ID);
        Map datos = new HashMap<>();
        datos.put("Mensaje","Informacion Eliminada");
        if(!res)
            datos.put("Respuesta", res);
        return new ResponseEntity<Object>(datos, HttpStatus.OK);
    }
}
