package com.CosmeticosBelleza.demo.Service;

import com.CosmeticosBelleza.demo.Model.ClienteModel;
import com.CosmeticosBelleza.demo.Model.MetodoPagoModel;
import com.CosmeticosBelleza.demo.Repository.MetodoPagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MetodoPagoService {

    @Autowired
    MetodoPagoRepositorio metodoPagoRepository;

    public ArrayList<MetodoPagoModel> getAll(){
        return (ArrayList<MetodoPagoModel>) metodoPagoRepository.findAll();
    }

    public  Optional<MetodoPagoModel>get(int id){
        return metodoPagoRepository.findById(id);
    }
    public MetodoPagoModel save(MetodoPagoModel e){
        return metodoPagoRepository.save(e);
    }
    public boolean delete(int ID){
        try {
            metodoPagoRepository.deleteById(ID);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
