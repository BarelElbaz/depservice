package org.harmonic.models

import jakarta.persistence.*

@Entity
@Table(name = "Artifacts")
class Artifact {

    @Column(name = "src_pkg")
    String srcPkg

    @Column(name = "bin_dep")
    String binDep

    String branch
    String codename
    String project
}
