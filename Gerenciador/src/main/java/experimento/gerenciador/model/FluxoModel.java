package experimento.gerenciador.model;

import java.sql.Date;

public class FluxoModel {
    private String ID;
    private String NOME_PRODUTO;
    private String DATA;
    private String VALOR;
    private String TIPO;
    private String SEGUNDA_PARTE;
    private String NOTA_FISCAL;
    private String CNPJ_SEGUNDA_PARTE;
    private String INTERMEDIO;

    public FluxoModel(String ID, String NOME_PRODUTO, String DATA, String VALOR, String TIPO, String SEGUNDA_PARTE, String NOTA_FISCAL, String CNPJ_SEGUNDA_PARTE, String INTERMEDIO) {
        this.ID = ID;
        this.NOME_PRODUTO = NOME_PRODUTO;
        this.DATA = DATA;
        this.VALOR = VALOR;
        this.TIPO = TIPO;
        this.SEGUNDA_PARTE = SEGUNDA_PARTE;
        this.NOTA_FISCAL = NOTA_FISCAL;
        this.CNPJ_SEGUNDA_PARTE = CNPJ_SEGUNDA_PARTE;
        this.INTERMEDIO = INTERMEDIO;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNOME_PRODUTO() {
        return NOME_PRODUTO;
    }

    public void setNOME_PRODUTO(String NOME_PRODUTO) {
        this.NOME_PRODUTO = NOME_PRODUTO;
    }

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }

    public String getVALOR() {
        return VALOR;
    }

    public void setVALOR(String VALOR) {
        this.VALOR = VALOR;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getSEGUNDA_PARTE() {
        return SEGUNDA_PARTE;
    }

    public void setSEGUNDA_PARTE(String SEGUNDA_PARTE) {
        this.SEGUNDA_PARTE = SEGUNDA_PARTE;
    }

    public String getNOTA_FISCAL() {
        return NOTA_FISCAL;
    }

    public void setNOTA_FISCAL(String NOTA_FISCAL) {
        this.NOTA_FISCAL = NOTA_FISCAL;
    }

    public String getCNPJ_SEGUNDA_PARTE() {
        return CNPJ_SEGUNDA_PARTE;
    }

    public void setCNPJ_SEGUNDA_PARTE(String CNPJ_SEGUNDA_PARTE) {
        this.CNPJ_SEGUNDA_PARTE = CNPJ_SEGUNDA_PARTE;
    }

    public String getINTERMEDIO() {
        return INTERMEDIO;
    }

    public void setINTERMEDIO(String INTERMEDIO) {
        this.INTERMEDIO = INTERMEDIO;
    }
}