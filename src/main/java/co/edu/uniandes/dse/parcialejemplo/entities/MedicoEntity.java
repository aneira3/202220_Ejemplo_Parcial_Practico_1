package co.edu.uniandes.dse.parcialejemplo.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;


@Data
@Entity
public class MedicoEntity extends BaseEntity{
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String RegistroMedico;

    @PodamExclude
    @ManyToMany
    private List <EspecialidadEntity> especialidades = new ArrayList<>();


}