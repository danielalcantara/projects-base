package br.com.cea.model;

import java.io.Serializable;
import java.util.Date;

import br.com.cea.dao.logger.ReflectionLogger;

public class ParcelaModel implements Serializable, ReflectionLogger {

	private static final long serialVersionUID = -7005256347635839884L;

	private Long id;
	private Long idPeriodo;
	private Long idContrato;
	private Date dataVencimento;
	private Double valor;
	private PagamentoModel pagamento;

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(Long idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public Long getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
	}

	public PagamentoModel getPagamento() {
		return pagamento;
	}

	public void setPagamento(PagamentoModel pagamento) {
		this.pagamento = pagamento;
	}

}
