package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entites.Usuario;
import com.biolab.ecommerce.entites.enums.StatusPedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PedidoDTO {

    private Long id;
    private Instant momento;
    private StatusPedido status;
    private long idCliente;

    public PedidoDTO(Long idCliente) {
        this.momento = Instant.now();
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
        this.idCliente = idCliente;
    }
}
