package com.example.Hann.controller;

import com.example.Hann.entity.ValueType;
import com.example.Hann.entity.Recode;
import com.example.Hann.repository.RecodeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping

public class RecodeController {
    
    @Autowired
    private RecodeRepository RecodeRepository;

    @PostMapping("/hann/prescribe")
    public String prescribe(@RequestBody Recode recode){
        System.out.println("recodeid:"+recode.getRecodeid());
        System.out.println("userid:"+recode.getUser());
        System.out.println("value:"+recode.getValue());
        System.out.println("pharmacy:"+recode.getPharmacy());
        System.out.println("medicine:"+recode.getMedicine());
        System.out.println("createdate:"+recode.getCreateData());

        recode.setValue(ValueType.PRESCRIBE);
        RecodeRepository.save(recode);
        return "처방이 완료되었습니다.";
    }
}
