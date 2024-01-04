package utez.edu.mx.Diagnostico.service;

import utez.edu.mx.Diagnostico.model.dto.PersonDto;
import utez.edu.mx.Diagnostico.model.entity.PersonBean;

import java.util.List;

public interface IPerson {
PersonBean save (PersonDto person);

PersonBean findById(Integer id);

List<PersonBean> findAll();

void delete (PersonBean person);


}
