package utez.edu.mx.Diagnostico.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import utez.edu.mx.Diagnostico.model.dto.PersonDto;
import utez.edu.mx.Diagnostico.model.entity.PersonBean;
import utez.edu.mx.Diagnostico.service.IPerson;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    private final IPerson personservice;

    @GetMapping("/")
public List<PersonBean> getPerson(){return personservice.findAll();
    }
    @GetMapping("/{id}")
public PersonBean showById(@PathVariable Integer id){return personservice.findById(id);}

    @PostMapping("/")
public PersonDto create(@RequestBody PersonDto personDto){
PersonBean personGuardar =personservice.save(personDto);
return PersonDto.builder()
        .idperson(personGuardar.getIdperson())
        .nombre(personGuardar.getNombre())
        .apellido(personGuardar.getApellido())
        .curp(personGuardar.getCurp())
        .nacimiento(personGuardar.getNacimiento())
        .build();
    }

    @PutMapping("/")
    public  PersonDto update(@RequestBody PersonDto personDto){
        PersonBean personUpdate = personservice.save(personDto);
        return PersonDto.builder()
                .idperson(personDto.getIdperson())
                .nombre(personDto.getNombre())
                .apellido(personDto.getApellido())
                .curp(personDto.getCurp())
                .nacimiento(personDto.getNacimiento())
                .build();
    }


}
