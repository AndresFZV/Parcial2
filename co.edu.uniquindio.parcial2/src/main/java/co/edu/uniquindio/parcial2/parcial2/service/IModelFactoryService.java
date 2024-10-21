package co.edu.uniquindio.parcial2.parcial2.service;

import co.edu.uniquindio.parcial2.parcial2.mapping.Dto.ClienteDto;

import java.util.List;

public interface IModelFactoryService {
    List<ClienteDto> obtenerClientes();

    boolean agregarCliente(ClienteDto clienteDto);
}

