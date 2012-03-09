package com.hivelog.pamcard.cfe;

import java.util.Map;

/**
 * Implementa��o dos requisitos do projeto Pamcard
 * 
 * @author mma
 * 
 */
public interface CfeFacade {

	/**
	 * M�todo para inclus�o de um contrato
	 * 
	 * @param certificateFilepath
	 *            Caminho do arquivo do Certificado
	 * @param fields
	 *            Campos de entrada
	 * @return N�mero do Ciot
	 * @throws Exception
	 */
	public String incluirContratoFrete(String certificateFilepath,
			Map<String, String> fields) throws Exception;

	/**
	 * M�todo para cancelamento do contrato
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
