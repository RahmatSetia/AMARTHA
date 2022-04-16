package com.alterra.spring1.controller;


import com.alterra.spring1.entity.Operators;
import com.alterra.spring1.repository.OperatorRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/operators")
@Data
public class OperatorController {
    @Autowired
    private OperatorRepository operatorRepository;

    @GetMapping
    public MbaseResponse<List<Operators>>  getAllOperators(){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        mbaseResponse.setData(operatorRepository.findAll());
        return mbaseResponse;
    }

    @GetMapping("{id}")
    public MbaseResponse<List<Operators>> getOpertorById(@PathVariable Long id){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        mbaseResponse.setData(operatorRepository.findById(id));
        return mbaseResponse;
    }

    @PostMapping
    public MbaseResponse<List<Operators>>  createOperators(@RequestBody Operators payload){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        mbaseResponse.setData(operatorRepository.save(payload));
        return mbaseResponse;
    }

    @PutMapping("{id}")
    public MbaseResponse<List<Optional<Operators>>> updateOperator(@PathVariable Long id, @RequestBody Operators operators){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        Optional<Operators> operatorByid = operatorRepository.findById(id);
        operatorByid.ifPresent(res ->{
            res.setName(operators.getName());
            res.setCreated_at(operators.getCreated_at());
            res.setUpdated_at(operators.getUpdated_at());

            mbaseResponse.setData(operatorRepository.save(res));
        });
        return  mbaseResponse;
    }

    @DeleteMapping
    public void deleteOperator(@PathVariable Long id){
        Optional<Operators> operatorsById = operatorRepository.findById(id);
        operatorsById.ifPresent(res -> {
            operatorRepository.delete(res);
        });
    }
}
