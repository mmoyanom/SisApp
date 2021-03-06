package com.sis.mcode.sisapp.controller;

import com.google.inject.Inject;
import com.sis.mcode.sisapp.communication.DownloadListOfSliderTipSegResult;
import com.sis.mcode.sisapp.communication.DownloadListOfTipSegResult;
import com.sis.mcode.sisapp.entity.SliderTipSeg;
import com.sis.mcode.sisapp.entity.TipSeg;
import com.sis.mcode.sisapp.service.impl.TipSegServiceImpl;

import java.util.List;

import roboguice.inject.ContextSingleton;

@ContextSingleton
public class TipSegController {

    @Inject
    protected TipSegServiceImpl _service;


    public List<TipSeg> getTipSegList(){
        return _service.getTipSegList();
    }

    public DownloadListOfTipSegResult downloadTipSeg(){
        return _service.downloadTipSeg();
    }

    public void cleanTipSeg() {
        _service.cleanTipSeg();
    }

    public List<SliderTipSeg> getSliderTipSegList(){
        return _service.getSliderTipSegList();
    }

    public List<SliderTipSeg> getSliderTipSegById (int idTipSeg) {
        return _service.getSliderTipSegById(idTipSeg);
    }

    public DownloadListOfSliderTipSegResult downloadSliderTipSeg(){
        return _service.downloadSliderTipSeg();
    }

    public void cleanSliderTipSeg() {
        _service.cleanSliderTipSeg();
    }
}
