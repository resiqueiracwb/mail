package br.com.vivo.james.model;

import lombok.Data;

@Data
public class Email extends ResourceSupport{

    private Long id;
    private String destino;
    private String assunto;
}
