package br.com.mouseweb.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("carta")
public class Anime {

    @Id
    private Integer id;
    @NotNull
    @NotEmpty(message = "O nome deste anime não pode estar vazio")
    private String name;

}
