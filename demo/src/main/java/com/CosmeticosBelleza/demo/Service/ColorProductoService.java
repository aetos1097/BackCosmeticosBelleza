package com.CosmeticosBelleza.demo.Service;

import com.CosmeticosBelleza.demo.Model.ColorProductoModel;
import com.CosmeticosBelleza.demo.Repository.ColorProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ColorProductoService {

    @Autowired
    ColorProductoRepositorio colorProductoRepository;

    //metodo getAll para obtener todos los colores
    public ArrayList<ColorProductoModel> getAll(){
        return (ArrayList<ColorProductoModel>) colorProductoRepository.findAll();
    }
    //metodo para obtener los colores por id
    public Optional<ColorProductoModel> get(int id){

        return colorProductoRepository.findById(id);
    }
    //guarda un nuevo color
    public ColorProductoModel save (ColorProductoModel e){

        return colorProductoRepository.save(e);
    }
    //Elimina un color
    public boolean delete(int id){
        try {
            colorProductoRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
