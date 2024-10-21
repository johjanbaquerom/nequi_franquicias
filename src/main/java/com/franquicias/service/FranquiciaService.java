package com.franquicias.service;

import com.franquicias.model.dto.FranquiciaRequestDTO;
import com.franquicias.model.dto.FranquiciaResponseDTO;

import java.util.List;

public interface FranquiciaService {

    FranquiciaResponseDTO agregarFranquicia(FranquiciaRequestDTO franquiciaRequest);
    FranquiciaResponseDTO modificarFranquicia(Long id, FranquiciaRequestDTO franquiciaActualizada);
    void eliminarFranquicia(Long id);
    FranquiciaResponseDTO obtenerFranquicia(Long id);
    List<FranquiciaResponseDTO> obtenerTodasFranquicias();
}
