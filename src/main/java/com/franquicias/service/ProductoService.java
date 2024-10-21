package com.franquicias.service;


import com.franquicias.model.dto.ProductoRequestDTO;
import com.franquicias.model.dto.ProductoResponseDTO;

import java.util.List;

public interface ProductoService {

    ProductoResponseDTO agregarProducto(Long sucursalId, ProductoRequestDTO productoRequest);
    ProductoResponseDTO modificarProducto(Long productoId, ProductoRequestDTO productoActualizado);
    ProductoResponseDTO obtenerProductoPorId(Long sucursalId, Long productoId);
    void eliminarProducto(Long sucursalId,Long productoId);
    List<ProductoResponseDTO> obtenerProductosConMayorStockPorSucursal(Long sucursalId);
}