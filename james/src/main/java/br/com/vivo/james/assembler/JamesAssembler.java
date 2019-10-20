package br.com.vivo.james.assembler;

import org.springframework.hateoas.ResourceAssembler;
import br.com.vivo.james.model.Email;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@Component
public class JamesAssembler implements ResourceAssembler<Email, Resource<Email>> {
    @Override
    public Resource<Email> toResource(Email email) {

        Resource<Email> predioResource = new Resource<>(email,
            linkTo(methodOn(BuildingController.class).one(email.getId())).withSelfRel(),
            linkTo(methodOn(BuildingController.class).all()).withRel("buildings"),
            linkTo(methodOn(BuildingController.class).complete(email.getId())).withSelfRel()
        );
        return predioResource;
    }
}
