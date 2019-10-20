package br.com.vivo.james.api;

import br.com.vivo.james.assembler.JamesAssembler;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "BuildingController")
@RestController
public class SendEmailController {

    private final JamesAssembler assembler;


}
