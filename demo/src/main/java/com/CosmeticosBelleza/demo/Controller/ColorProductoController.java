package com.CosmeticosBelleza.demo.Controller;

import com.CosmeticosBelleza.demo.Model.ColorProductoModel;
import com.CosmeticosBelleza.demo.Service.ColorProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/colorproducto")
public class ColorProductoController {
    @Autowired
    ColorProductoService colorProductoService;
    @GetMapping()
    public ArrayList<ColorProductoModel> listarColores(){
        return colorProductoService.getAll();
    }

    @GetMapping(path = "/id")
    public Optional<ColorProductoModel> consultarPorId(@PathVariable("id")int id){
        return colorProductoService.get(id);
    }
    @PostMapping()
    public ColorProductoModel registrar(@RequestBody ColorProductoModel e){
        return colorProductoService.save(e);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> eliminar(@PathVariable int id){
        boolean res = colorProductoService.delete(id);
        Map datos = new HashMap<>();
        datos.put("mensaje","Color eliminado");
        if(!res){
            datos.put("Mensaje","El color con id "+ id+" no existe");
        }
        datos.put("Respuesta: ", res);
        return new ResponseEntity<Object>(datos, HttpStatus.OK);
    }
}
