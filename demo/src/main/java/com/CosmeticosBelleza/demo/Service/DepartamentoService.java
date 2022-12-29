package com.CosmeticosBelleza.demo.Service;

import com.CosmeticosBelleza.demo.Model.ClienteModel;
import com.CosmeticosBelleza.demo.Model.DepartamentoModel;
import com.CosmeticosBelleza.demo.Repository.DepartamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepositorio departamentoRepository;

    public ArrayList<DepartamentoModel> getAll(){
        return(ArrayList<DepartamentoModel>) departamentoRepository.findAll();
    }
    public Optional<DepartamentoModel> get(int id){
        return departamentoRepository.findById(id);
    }
    public DepartamentoModel  save(DepartamentoModel e){
        System.out.println(e);
        return departamentoRepository.save(e);
    }

    public boolean delete(int id){
        try {
            departamentoRepository.deleteById(id);
            return true;
            }catch(Exception e){
            return false;
        }
    }
}
