package com.hivelog.pamcard.cfe;

import java.util.Map;

/**
 * Implementação dos requisitos do projeto Pamcard
 * 
 * @author mma
 * 
 */
public interface CfeFacade {

	/**
	 * Método para inclusão de um contrato
	 * 
	 * @param certificateFilepath
	 *            Caminho do arquivo do Certificado
	 * @param fields
	 *            Campos de entrada
	 * @return Número do Ciot
	 * @throws Exception
	 */
	public String incluirContratoFrete(String certificateFilepath,
			Map<String, String> fields) throws Exception;

	/**
	 * Método para cancelamento do contrato
	 * 
	 * @param certificateFilepath
	 *            Caminho do arquivo do Certificado
	 * @param fields
	 *            Campos de entrada
	 * @throws Exception
	 */
	public void cancelarContratoFrete(String certificateFilepath,
			Map<String, String> fields) throws Exception;
}
