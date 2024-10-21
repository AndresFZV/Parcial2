package co.edu.uniquindio.parcial2.parcial2.service;



import co.edu.uniquindio.parcial2.parcial2.mapping.Dto.ClienteDto;
import co.edu.uniquindio.parcial2.parcial2.model.Cliente;

import java.util.List;

public interface IPrestamoMapping {
    List<ClienteDto> getClientesDto(List<Cliente> listaClientes);
    ClienteDto clienteToClienteDto(Cliente cliente);
    Cliente clienteDtoToCliente(ClienteDto clienteDto);
}
