package com.CosmeticosBelleza.demo.Service;

import com.CosmeticosBelleza.demo.Model.ClienteModel;
import com.CosmeticosBelleza.demo.Repository.ClienteRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRespositorio clienteRepository;

    public ArrayList<ClienteModel> getAll(){
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }
    public Optional <ClienteModel> get (int ID){
        return clienteRepository.findById(ID);
    }
    public ClienteModel save(ClienteModel e){
        System.out.println(e);
        return clienteRepository.save(e);
    }

    public boolean delete(int ID){
        try {
            clienteRepository.deleteById(ID);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
