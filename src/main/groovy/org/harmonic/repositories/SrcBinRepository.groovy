package org.harmonic.repositories

import org.harmonic.models.SrcBin
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;


@Repository
interface SrcBinRepository extends CrudRepository<SrcBin, Long> {

}
