package com.CosmeticosBelleza.demo.Controller;

import com.CosmeticosBelleza.demo.Model.ParametrosModel;
import com.CosmeticosBelleza.demo.Service.ParametroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/parametros")
public class ParametrosController {

    @Autowired
    ParametroService parametroService;
    @GetMapping()
    public ArrayList<ParametrosModel>listarParametros(){
        return parametroService.getAll();
    }

    @GetMapping(path = "/id")
        public Optional<ParametrosModel>consultarPorId(@PathVariable("id")int id) {
        return parametroService.get(id);
    }
    @PostMapping()
    public ParametrosModel registrar(@RequestBody ParametrosModel e){
        return parametroService.save(e);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> eliminar(@PathVariable int id){
        boolean res = parametroService.delete(id);
        Map datos = new HashMap<>();
        datos.put("mensaje","Parametro eliminado");
        if(!res){
            datos.put("Mensaje","Los parametros con id "+ id+" no existen");
        }
        datos.put("Respuesta: ", res);
        return new ResponseEntity<Object>(datos, HttpStatus.OK);
    }

}

