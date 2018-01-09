package br.com.plusoft.csi.bradescoaf.crm.cics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.bradseg.afnd.afinidade.model.util.UtilAfinidade;
import br.com.bradseg.afnd.afinidade.model.vo.ObjetoRetornoVO;
import br.com.bradseg.bsad.component.ctggateway.CTGProgramImpl;
import br.com.bradseg.bsad.component.ctggateway.CommonAreaMetaData;
import br.com.bradseg.bsad.component.ctggateway.InputSet;
import br.com.bradseg.bsad.component.ctggateway.InputSetImpl;
import br.com.bradseg.bsad.component.ctggateway.ResultSet;
import br.com.bradseg.bsad.component.ctggateway.field.FieldType;
import br.com.bradseg.bsad.component.ctggateway.field.IndexedFieldType;
import br.com.bradseg.bsad.component.ctggateway.field.LongFieldType;
import br.com.bradseg.bsad.component.ctggateway.field.StringFieldType;
import br.com.bradseg.bsad.exception.BusinessException;
import br.com.bradseg.bsad.exception.IntegrationException;

public class AFND0510 {
	
	private static final String PGM_NAME = "AFND0510";
 
	private static final String TRAN_NAME = "AF10"; 
      
	//Dados do certificado
	private static final String AFND10_CERT_COD_PRODUTO = "AFND10-CERT-COD-PRODUTO";
	private static final String AFND10_CERT_COD_KIT_ASSIST = "AFND10-CERT-COD-KIT-ASSIST";
	private static final String AFND10_CERT_DTA_INI_VIGENC = "AFND10-CERT-DTA-INI-VIGENC";
	private static final String AFND10_CERT_QTDE_ASSIST = "AFND10-CERT-QTDE-ASSIST";
      
	//Dados de Assistência
	private static final String AFND010_TAB_DADOS_ASSISTENCIA = "AFND010-TAB-DADOS-ASSISTENCIA";
	private static final String AFND10_ASSISTENC_DSC = "AFND10-ASSISTENC-DSC";
	private static final String AFND10_COD_RETORN = "AFND10-COD-RETORN";
	private static final String AFND10_MENSAGEM = "AFND10-MENSAGEM";
	private static final String AFND10_PROGRAMA = "AFND10-PROGRAMA";
	private static final String AFND10_SEQUENCIA = "AFND10-SEQUENCIA";
      
	private static final int COMMLENGTH = 1701;
      
	protected static final FieldType[] COMMOM_FIELD_TYPES = new FieldType[] {
		new LongFieldType(AFND10_CERT_COD_PRODUTO, 6),
		new LongFieldType(AFND10_CERT_COD_KIT_ASSIST, 3),
		new LongFieldType(AFND10_CERT_DTA_INI_VIGENC, 8)
	};
	
	protected static final CommonAreaMetaData COMMONAREA_DADOS_TABELA1 = new CommonAreaMetaData(
			new FieldType[] {
				new StringFieldType(AFND10_ASSISTENC_DSC, 80)
	});
      
	public static final CommonAreaMetaData COMMONAREA_IN_OUT = new CommonAreaMetaData( 
			COMMOM_FIELD_TYPES, new FieldType[] {
					new LongFieldType(AFND10_CERT_QTDE_ASSIST, 2),
					new IndexedFieldType(AFND010_TAB_DADOS_ASSISTENCIA, 20 ,
							COMMONAREA_DADOS_TABELA1),
							new StringFieldType(AFND10_COD_RETORN, 2),
							new StringFieldType(AFND10_PROGRAMA, 8),
							new StringFieldType(AFND10_SEQUENCIA, 3),
							new StringFieldType(AFND10_MENSAGEM, 69)
	});
     
    public static ObjetoRetornoVO validaOperacao(ResultSet rs) throws IntegrationException, BusinessException {
    	
    	ObjetoRetornoVO objetoRetornoVO = new ObjetoRetornoVO();
    	objetoRetornoVO.setProgramaRetorno(rs.getString(AFND10_PROGRAMA));
    	objetoRetornoVO.setSequenciaRetorno(rs.getString(AFND10_SEQUENCIA));
    	objetoRetornoVO.setCodigoRetorno(rs.getString(AFND10_COD_RETORN));
    	objetoRetornoVO.setMensagemRetorno(rs.getString(AFND10_MENSAGEM));
    	return  objetoRetornoVO;
    	
    }
    
	public static class ConsultarDadosAssistencia extends CTGProgramImpl {
 
		public ConsultarDadosAssistencia(long codigoProduto, long codigoKitAssistencia, Date dataInicioVigenciaCertificado) throws Exception {
			
			super(PGM_NAME, TRAN_NAME, COMMLENGTH, COMMONAREA_IN_OUT,COMMONAREA_IN_OUT);
			
			InputSet inputSet = this.getInputSet();
            inputSet.setLong(AFND10_CERT_COD_PRODUTO, Long.valueOf(codigoProduto));
            inputSet.setLong(AFND10_CERT_COD_KIT_ASSIST, Long.valueOf(codigoKitAssistencia));
            inputSet.setLong(AFND10_CERT_DTA_INI_VIGENC, Long.valueOf(UtilAfinidade.converteDataParaString(dataInicioVigenciaCertificado)));
			
			InputSet inputSetRows = new InputSetImpl();
			 
			inputSetRows.addNewRow();
			inputSet.setIndexed(AFND010_TAB_DADOS_ASSISTENCIA, inputSetRows);
			
		}
 
		public static List retrieveDocumentoSeguro(ResultSet rs) throws Exception {
                     
			List assistencias = new ArrayList();
 
			ResultSet rsDocumentoSeguro = rs.getIndexed(AFND010_TAB_DADOS_ASSISTENCIA);
 
			while (rsDocumentoSeguro.next()) {
				String retorno = "";
				retorno = rsDocumentoSeguro.getString(AFND10_ASSISTENC_DSC);
				if (!"".equals(retorno)) {
					assistencias.add(rsDocumentoSeguro.getString(AFND10_ASSISTENC_DSC));
				}
			}
 
			return assistencias;
 
		}
 
	}
	
	
}
