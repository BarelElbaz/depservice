package org.harmonic.controllers

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject
import org.harmonic.models.SrcBin
import org.harmonic.services.SrcBinService

@Controller("/srcbin")
class SrcBinController {
    @Inject
    private SrcBinService srcBinService;

    @Post("/create")
    public SrcBin create(@Body SrcBin srcBin) {
        return srcBinService.save(srcBin);
    }
}
