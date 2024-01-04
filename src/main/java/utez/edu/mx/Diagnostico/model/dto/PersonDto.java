package utez.edu.mx.Diagnostico.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDto {

    private Integer idperson;

    private String nombre;

    private String apellido;

    private String curp;

    private String nacimiento;
}
