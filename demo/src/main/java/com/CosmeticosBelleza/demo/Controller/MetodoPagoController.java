package com.CosmeticosBelleza.demo.Controller;

import com.CosmeticosBelleza.demo.Model.MetodoPagoModel;
import com.CosmeticosBelleza.demo.Service.MetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/metodopago")
public class MetodoPagoController {
    @Autowired
    MetodoPagoService metodoPagoService;

    @GetMapping
    public ArrayList<MetodoPagoModel> listarTodos(){
        return metodoPagoService.getAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<MetodoPagoModel> consultarPorId(@PathVariable("id") int ID){
        return metodoPagoService.get(ID);
    }

    //@PostMapping(path = "/consultar")
    //public ArrayList<ClienteModel>
    @PostMapping()
    public MetodoPagoModel registar(@RequestBody MetodoPagoModel e){
        return metodoPagoService.save(e);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Object> Eliminar(@PathVariable int ID){
        boolean res = metodoPagoService.delete(ID);
        Map datos = new HashMap<>();
        datos.put("Mensaje","Informacion Eliminada");
        if(!res)
            datos.put("Respuesta", res);
        return new ResponseEntity<Object>(datos, HttpStatus.OK);
    }
}
