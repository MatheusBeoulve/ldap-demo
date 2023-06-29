package io.github.matheusbeoulve;

import io.micronaut.http.annotation.*;

@Controller("/ldapDemo")
public class LdapDemoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}