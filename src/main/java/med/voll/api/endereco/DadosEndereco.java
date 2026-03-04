package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;

public record DadosEndereco(
         String logradouro,
         String bairro,
         String cep,
         String numero,
         String uf,
         String cidade,
        String complemento) {

}
