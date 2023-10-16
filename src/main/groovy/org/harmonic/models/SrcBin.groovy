package org.harmonic.models

import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable
import jakarta.persistence.*

@Serdeable
@Introspected
@Entity
@Table(name = "SrcBin")
class SrcBin {
    @Id
    Long id
    @Column(name = "src_pkg")
    String srcPkg

    @Column(name = "bin")
    String bin

    String branch
    String codename
    String project

}