package org.harmonic.repositories

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import org.harmonic.models.SrcBin
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;


//@JdbcRepository(dialect = Dialect.MYSQL)
@Repository
interface SrcBinRepository extends CrudRepository<SrcBin, Long> {

}
