package com.CosmeticosBelleza.demo.Controller;

import com.CosmeticosBelleza.demo.Model.DepartamentoModel;
import com.CosmeticosBelleza.demo.Service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping
    public ArrayList<DepartamentoModel> listar(){
        return departamentoService.getAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<DepartamentoModel>consultarPorId(@PathVariable("id")int id){
        return departamentoService.get(id);
    }
    @PostMapping()
    public DepartamentoModel registar(@RequestBody DepartamentoModel e){
      //return e;
        return departamentoService.save(e);
    }

    @DeleteMapping(path ="/{id}")
    public ResponseEntity<Object> eliminar(@PathVariable int id){
        boolean res =departamentoService.delete(id);
        Map datos = new HashMap<>();
        if(!res){
            datos.put("Mensaje","Departamento Eliminado");
        }
        datos.put("Mensaje","El dato con el id: "+ id+ " no existe");
        return new ResponseEntity<Object>(datos, HttpStatus.OK);
    }
}
