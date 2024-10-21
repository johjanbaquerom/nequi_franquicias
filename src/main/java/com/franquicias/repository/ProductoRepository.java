package com.franquicias.repository;

import com.franquicias.model.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

    List<ProductoEntity> findBySucursalId(Long sucursalId);
}
