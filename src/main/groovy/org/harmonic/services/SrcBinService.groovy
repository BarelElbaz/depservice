package org.harmonic.services

import jakarta.inject.Inject
import org.harmonic.models.SrcBin
import org.harmonic.repositories.SrcBinRepository
import jakarta.inject.Singleton

@Singleton
class SrcBinService {
    @Inject
    private SrcBinRepository srcBinRepository;

    public SrcBin save(SrcBin srcBin) {
        return srcBinRepository.save(srcBin);
    }
}
