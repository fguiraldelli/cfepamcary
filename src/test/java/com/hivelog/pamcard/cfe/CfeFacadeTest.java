package com.hivelog.pamcard.cfe;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.hivelog.pamcard.cfe.imp.CfeFacadeImp;

public class CfeFacadeTest {

	@Test
	public void testIncluirContratoFrete() throws Exception {
		CfeFacade cfe = new CfeFacadeImp();
		Map<String, String> map = new HashMap<String, String>();
		map.put("transacional.operacao", "26");
		map.put("viagem.contratante.documento.numero", "27064195000190");
		map.put("viagem.contrato.numero", "061011");
		map.put("viagem.favorecido.qtde", "1");
		map.put("viagem.favorecido1.tipo", "1");
		map.put("viagem.favorecido1.documento.qtde", "1");
		map.put("viagem.favorecido1.documento1.tipo", "2");
		map.put("viagem.favorecido1.documento1.numero", "56164548934");
		map.put("viagem.favorecido1.meio.pagamento", "2");
		map.put("viagem.veiculo.qtde", "1");
		map.put("viagem.veiculo1.placa", "APX0808");
		map.put("viagem.veiculo.categoria", "7");
		map.put("viagem.data.partida", "12/10/2011");
		map.put("viagem.data.termino", "10/11/2011");
		map.put("viagem.origem.cidade.ibge", "3550308");
		map.put("viagem.destino.cidade.ibge", "3523909");
		map.put("viagem.ponto.qtde", "1");
		map.put("viagem.ponto1.cidade.ibge", "3501608");
		map.put("viagem.pedagio.status.id", "2");
		map.put("viagem.pedagio.roteirizar", "S");
		map.put("viagem.pedagio.obter.praca", "S");
		map.put("viagem.pedagio.cartao", "4417810025749012");
		map.put("viagem.carga.tipo", "1");
		map.put("viagem.carga.natureza", "1212");
		map.put("viagem.carga.peso", "1000");
		map.put("viagem.documento.qtde", "1");
		map.put("viagem.documento1.tipo", "6");
		map.put("viagem.documento1.numero", "5466987");
		map.put("viagem.documento1.serie", "45");
		map.put("viagem.documento1.quantidade", "456.54");
		map.put("viagem.documento1.especie", "LIQUIDO");
		map.put("viagem.documento1.cubagem", "456.54");
		map.put("viagem.documento1.peso", "456.54");
		map.put("viagem.documento1.natureza", "9404");
		map.put("viagem.documento1.mercadoria.valor", "1025.65");
		map.put("viagem.documento1.pessoafiscal.qtde", "3");
		map.put("viagem.documento1.pessoafiscal1.tipo", "1");
		map.put("viagem.documento1.pessoafiscal1.documento.tipo", "1");
		map.put("viagem.documento1.pessoafiscal1.documento.numero",
				"27064195000190");
		map.put("viagem.documento1.pessoafiscal1.nome", "JENNIFER TRANSPORTES");
		map.put("viagem.documento1.pessoafiscal1.endereco.logradouro",
				"RUA ABILIO SOARES");
		map.put("viagem.documento1.pessoafiscal1.endereco.numero", "409");
		map.put("viagem.documento1.pessoafiscal1.endereco.complemento",
				"6 ANDAR");
		map.put("viagem.documento1.pessoafiscal1.endereco.bairro", "PARAISO");
		map.put("viagem.documento1.pessoafiscal1.endereco.cidade.ibge",
				"3550308");
		map.put("viagem.documento1.pessoafiscal1.endereco.cep", "04005001");
		map.put("viagem.documento1.pessoafiscal2.tipo", "2");
		map.put("viagem.documento1.pessoafiscal2.documento.tipo", "2");
		map.put("viagem.documento1.pessoafiscal2.documento.numero",
				"07590701807");
		map.put("viagem.documento1.pessoafiscal2.nome", "JENNIFER BARBOSA");
		map.put("viagem.documento1.pessoafiscal2.endereco.logradouro",
				"RUA AUGUSTO GOULART");
		map.put("viagem.documento1.pessoafiscal2.endereco.numero", "314");
		map.put("viagem.documento1.pessoafiscal2.endereco.bairro",
				"VILA COSTA MELO");
		map.put("viagem.documento1.pessoafiscal2.endereco.cidade.ibge",
				"3550308");
		map.put("viagem.documento1.pessoafiscal2.endereco.cep", "03625070");
		map.put("viagem.documento1.pessoafiscal3.tipo", "3");
		map.put("viagem.documento1.pessoafiscal3.codigo", "2");
		map.put("viagem.documento.complementar.qtde", "1");
		map.put("viagem.documento.complementar1.tipo", "1");
		map.put("viagem.parcela.qtde", "2");
		map.put("viagem.parcela1.efetivacao.tipo", "1");
		map.put("viagem.parcela1.valor", "1.00");
		map.put("viagem.parcela1.subtipo", "1");
		map.put("viagem.parcela1.status.id", "1");
		map.put("viagem.parcela1.data", "30/10/2011");
		map.put("viagem.parcela1.favorecido.tipo.id", "2");
		map.put("viagem.parcela1.numero.cliente", "1");
		map.put("viagem.parcela2.efetivacao.tipo", "2");
		map.put("viagem.parcela2.valor", "2.00");
		map.put("viagem.parcela2.subtipo", "2");
		map.put("viagem.parcela2.status.id", "1");
		map.put("viagem.parcela2.data", "31/10/2011");
		map.put("viagem.parcela2.favorecido.tipo.id", "1");
		map.put("viagem.parcela2.numero.cliente", "2");
		map.put("viagem.frete.valor.bruto", "200.00");
		map.put("viagem.frete.item.qtde", "1");
		map.put("viagem.frete.item1.tipo", "1");
		map.put("viagem.frete.item1.valor", "189.00");
		cfe.incluirContratoFrete("pamcard_thom_10782530000192.crt", map);
	}

	
	@Test
	public void testCancelarContratoFrete() throws Exception {
		CfeFacade cfe = new CfeFacadeImp();
		Map<String, String> map = new HashMap<String, String>();
		map.put("transacional.operacao", "4");
		map.put("viagem.contratante.documento.numero", "27064195000190");
		map.put("viagem.id", "1035598");
		cfe.cancelarContratoFrete("pamcard_thom_10782530000192.crt", map);
	}
}
