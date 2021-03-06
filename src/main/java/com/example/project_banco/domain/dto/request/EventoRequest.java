package com.example.project_banco.domain.dto.request;
import com.example.project_banco.domain.validators.DataHoraFim;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@DataHoraFim
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventoRequest {

    //private Integer IdEventoStatus;

    private Integer IdCategoriaEvento;

    @NotEmpty(message = "Nome is required")
    @Size(min = 1, max =  250)
    private String Nome;

    @NotNull(message = "Data Inicio is required")
    private Date DataHoraInicio;
    
    @Future
    @NotNull(message = "Data Fim is required")
    private Date DataHoraFim;

    @NotEmpty(message = "Local is required")
    @Size(min = 1, max =  250)
    private String Local;

    @NotEmpty(message = "Descricao is required")
    @Size(min = 1, max =  1000)
    private String Descricao;

    @NotNull
    private Integer LimiteVagas;
}
