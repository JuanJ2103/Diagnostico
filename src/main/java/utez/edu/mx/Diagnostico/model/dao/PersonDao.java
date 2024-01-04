package utez.edu.mx.Diagnostico.model.dao;

import org.springframework.data.repository.CrudRepository;
import utez.edu.mx.Diagnostico.model.entity.PersonBean;

public interface PersonDao extends CrudRepository<PersonBean,Integer> {

}
