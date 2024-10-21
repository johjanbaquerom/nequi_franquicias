package com.franquicias.service;

import com.franquicias.model.dto.SucursalRequestDTO;
import com.franquicias.model.dto.SucursalResponseDTO;

import java.util.List;

public interface SucursalService {

    SucursalResponseDTO agregarSucursal(Long franquiciaId, SucursalRequestDTO sucursalRequest);
    SucursalResponseDTO modificarSucursal(Long sucursalId, SucursalRequestDTO sucursalActualizada);
    SucursalResponseDTO obtenerSucursalPorId(Long franquiciaId, Long sucursalId);
    void eliminarSucursal(Long id);
    List<SucursalResponseDTO> obtenerSucursalesPorFranquicia(Long franquiciaId);
}
