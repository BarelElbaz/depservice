package org.harmonic

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic
import org.hibernate.cfg.Environment

@CompileStatic
class Application {

    static void main(String[] args) {
        // In hibernate6 when hibernate.bytecode.provider is none then need
        // to disable reflection optimizer, but doesn't work via JPA properties for some reason
        System.setProperty(Environment.USE_REFLECTION_OPTIMIZER, Boolean.FALSE.toString());
        Micronaut.run(Application, args)
    }
}
