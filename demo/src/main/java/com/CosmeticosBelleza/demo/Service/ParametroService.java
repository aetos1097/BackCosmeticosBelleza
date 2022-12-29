package com.CosmeticosBelleza.demo.Service;

import com.CosmeticosBelleza.demo.Model.ParametrosModel;
import com.CosmeticosBelleza.demo.Repository.ParametrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ParametroService {

    @Autowired
    ParametrosRepositorio parametrosRepository;

    //metodo getAll para obtener todos los parametros
    public ArrayList<ParametrosModel>getAll(){

        return (ArrayList<ParametrosModel>) parametrosRepository.findAll();
    }
    //metodo para obtener los parametros por id
    public Optional<ParametrosModel> get(int id){
        return parametrosRepository.findById(id);
    }
    //guarda un nuevo parametro
    public ParametrosModel save (ParametrosModel e){

        return parametrosRepository.save(e);
    }
    //Elimina un parametro
    public boolean delete(int id){
        try {
            parametrosRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
