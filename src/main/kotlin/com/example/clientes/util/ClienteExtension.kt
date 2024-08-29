import com.example.clientes.dto.ClienteDTO
import com.example.clientes.model.Cliente

fun ClienteDTO.toModel(): Cliente {
    return Cliente(
        this.nome,
        this.observacao,
        this.categoria,
        this.dataNacimento,
        this.naturalidade,
        this.estadoNaturalidade,
        this.nacionalidade,
        this.estadoCivil,
        this.endereco,
        this.bairro,
        this.cidade,
        this.estado,
        this.telefone1,
        this.telefone2,
        this.mesPago,
        this.anoPago
    )
}