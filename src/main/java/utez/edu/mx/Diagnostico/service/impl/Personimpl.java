package utez.edu.mx.Diagnostico.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utez.edu.mx.Diagnostico.model.dao.PersonDao;
import utez.edu.mx.Diagnostico.model.dto.PersonDto;
import utez.edu.mx.Diagnostico.model.entity.PersonBean;
import utez.edu.mx.Diagnostico.service.IPerson;

import java.util.List;
@Service
public class Personimpl implements IPerson {
@Autowired
private PersonDao personDao;

    @Override
    public PersonBean save(PersonDto personDto) {
PersonBean person = PersonBean.builder()
        .idperson(personDto.getIdperson())
        .nombre(personDto.getNombre())
        .apellido(personDto.getApellido())
        .curp(personDto.getCurp())
        .nacimiento(personDto.getNacimiento())
        .build();
        return personDao.save(person);
    }

    @Override
    public PersonBean findById(Integer id) {
        return personDao.findById(id).orElse(null);
    }

    @Override
    public List<PersonBean> findAll() {
        return List<PersonBean> personDao.findAll();
    }

    @Override
    public void delete(PersonBean person) {personDao.delete(person);
    }
}
