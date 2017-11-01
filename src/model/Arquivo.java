/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gtiago
 */
@Entity
@Table(name = "arquivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arquivo.findAll", query = "SELECT a FROM Arquivo a")
    , @NamedQuery(name = "Arquivo.findByIdArquivo", query = "SELECT a FROM Arquivo a WHERE a.idArquivo = :idArquivo")
    , @NamedQuery(name = "Arquivo.findByNumeroCatalogacao", query = "SELECT a FROM Arquivo a WHERE a.numeroCatalogacao = :numeroCatalogacao")
    , @NamedQuery(name = "Arquivo.findByNumeroRegistro", query = "SELECT a FROM Arquivo a WHERE a.numeroRegistro = :numeroRegistro")
    , @NamedQuery(name = "Arquivo.findByTitulo", query = "SELECT a FROM Arquivo a WHERE a.titulo = :titulo")
    , @NamedQuery(name = "Arquivo.findByObservacoes", query = "SELECT a FROM Arquivo a WHERE a.observacoes = :observacoes")
    , @NamedQuery(name = "Arquivo.findByUrl", query = "SELECT a FROM Arquivo a WHERE a.url = :url")
    , @NamedQuery(name = "Arquivo.findByDescricaoInformacao", query = "SELECT a FROM Arquivo a WHERE a.descricaoInformacao = :descricaoInformacao")
    , @NamedQuery(name = "Arquivo.findByPalavraChave", query = "SELECT a FROM Arquivo a WHERE a.palavraChave = :palavraChave")
    , @NamedQuery(name = "Arquivo.findByIndicacaoDataHora", query = "SELECT a FROM Arquivo a WHERE a.indicacaoDataHora = :indicacaoDataHora")
    , @NamedQuery(name = "Arquivo.findByData", query = "SELECT a FROM Arquivo a WHERE a.data = :data")
    , @NamedQuery(name = "Arquivo.findByDataProducaoData", query = "SELECT a FROM Arquivo a WHERE a.dataProducaoData = :dataProducaoData")
    , @NamedQuery(name = "Arquivo.findByTempoDuracao", query = "SELECT a FROM Arquivo a WHERE a.tempoDuracao = :tempoDuracao")
    , @NamedQuery(name = "Arquivo.findByEquipeRealizadora", query = "SELECT a FROM Arquivo a WHERE a.equipeRealizadora = :equipeRealizadora")
    , @NamedQuery(name = "Arquivo.findByResponsavelDocumentacaoUnidade", query = "SELECT a FROM Arquivo a WHERE a.responsavelDocumentacaoUnidade = :responsavelDocumentacaoUnidade")
    , @NamedQuery(name = "Arquivo.findByResponsavelDocumentacaoNome", query = "SELECT a FROM Arquivo a WHERE a.responsavelDocumentacaoNome = :responsavelDocumentacaoNome")
    , @NamedQuery(name = "Arquivo.findByResponsavelDocumentacaoData", query = "SELECT a FROM Arquivo a WHERE a.responsavelDocumentacaoData = :responsavelDocumentacaoData")
    , @NamedQuery(name = "Arquivo.findByLocalProducaoLocalizacao", query = "SELECT a FROM Arquivo a WHERE a.localProducaoLocalizacao = :localProducaoLocalizacao")
    , @NamedQuery(name = "Arquivo.findByCategoriaObjeto", query = "SELECT a FROM Arquivo a WHERE a.categoriaObjeto = :categoriaObjeto")
    , @NamedQuery(name = "Arquivo.findByExtensaoArquivo", query = "SELECT a FROM Arquivo a WHERE a.extensaoArquivo = :extensaoArquivo")
    , @NamedQuery(name = "Arquivo.findByCategoriaReferencia", query = "SELECT a FROM Arquivo a WHERE a.categoriaReferencia = :categoriaReferencia")
    , @NamedQuery(name = "Arquivo.findByResponsavelEdicao", query = "SELECT a FROM Arquivo a WHERE a.responsavelEdicao = :responsavelEdicao")
    , @NamedQuery(name = "Arquivo.findByQualidadeDados", query = "SELECT a FROM Arquivo a WHERE a.qualidadeDados = :qualidadeDados")
    , @NamedQuery(name = "Arquivo.findByAutorizacao", query = "SELECT a FROM Arquivo a WHERE a.autorizacao = :autorizacao")
    , @NamedQuery(name = "Arquivo.findByOrigemDosDados", query = "SELECT a FROM Arquivo a WHERE a.origemDosDados = :origemDosDados")
    , @NamedQuery(name = "Arquivo.findByAquisicao", query = "SELECT a FROM Arquivo a WHERE a.aquisicao = :aquisicao")
    , @NamedQuery(name = "Arquivo.findByEmpresaProdutora", query = "SELECT a FROM Arquivo a WHERE a.empresaProdutora = :empresaProdutora")
    , @NamedQuery(name = "Arquivo.findByLocalProducaoCidade", query = "SELECT a FROM Arquivo a WHERE a.localProducaoCidade = :localProducaoCidade")})
public class Arquivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idArquivo")
    private Integer idArquivo;
    @Column(name = "numero_catalogacao")
    private String numeroCatalogacao;
    @Column(name = "numero_registro")
    private String numeroRegistro;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "Observacoes")
    private String observacoes;
    @Column(name = "url")
    private String url;
    @Column(name = "descricao_informacao")
    private String descricaoInformacao;
    @Column(name = "palavra_chave")
    private String palavraChave;
    @Column(name = "indicacao_data_hora")
    @Temporal(TemporalType.DATE)
    private Date indicacaoDataHora;
    @Column(name = "data")
    private Integer data;
    @Column(name = "data_producao_data")
    @Temporal(TemporalType.DATE)
    private Date dataProducaoData;
    @Column(name = "tempo_duracao")
    private String tempoDuracao;
    @Column(name = "equipe_realizadora")
    private String equipeRealizadora;
    @Column(name = "responsavel_documentacao_unidade")
    private String responsavelDocumentacaoUnidade;
    @Column(name = "responsavel_documentacao_nome")
    private String responsavelDocumentacaoNome;
    @Column(name = "responsavel_documentacao_data")
    @Temporal(TemporalType.DATE)
    private Date responsavelDocumentacaoData;
    @Column(name = "local_producao_localizacao")
    private String localProducaoLocalizacao;
    @Column(name = "categoria_objeto")
    private String categoriaObjeto;
    @Column(name = "extensao_arquivo")
    private String extensaoArquivo;
    @Column(name = "categoria_referencia")
    private String categoriaReferencia;
    @Column(name = "responsavel_edicao")
    private String responsavelEdicao;
    @Column(name = "qualidade_dados")
    private String qualidadeDados;
    @Column(name = "autorizacao")
    private String autorizacao;
    @Column(name = "origem_dos_dados")
    private String origemDosDados;
    @Column(name = "aquisicao")
    private String aquisicao;
    @Column(name = "empresaProdutora")
    private String empresaProdutora;
    @Column(name = "local_producao_cidade")
    private String localProducaoCidade;

    public Arquivo() {
    }

    public Arquivo(Integer idArquivo) {
        this.idArquivo = idArquivo;
    }

    public Integer getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(Integer idArquivo) {
        this.idArquivo = idArquivo;
    }

    public String getNumeroCatalogacao() {
        return numeroCatalogacao;
    }

    public void setNumeroCatalogacao(String numeroCatalogacao) {
        this.numeroCatalogacao = numeroCatalogacao;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricaoInformacao() {
        return descricaoInformacao;
    }

    public void setDescricaoInformacao(String descricaoInformacao) {
        this.descricaoInformacao = descricaoInformacao;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public Date getIndicacaoDataHora() {
        return indicacaoDataHora;
    }

    public void setIndicacaoDataHora(Date indicacaoDataHora) {
        this.indicacaoDataHora = indicacaoDataHora;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Date getDataProducaoData() {
        return dataProducaoData;
    }

    public void setDataProducaoData(Date dataProducaoData) {
        this.dataProducaoData = dataProducaoData;
    }

    public String getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(String tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getEquipeRealizadora() {
        return equipeRealizadora;
    }

    public void setEquipeRealizadora(String equipeRealizadora) {
        this.equipeRealizadora = equipeRealizadora;
    }

    public String getResponsavelDocumentacaoUnidade() {
        return responsavelDocumentacaoUnidade;
    }

    public void setResponsavelDocumentacaoUnidade(String responsavelDocumentacaoUnidade) {
        this.responsavelDocumentacaoUnidade = responsavelDocumentacaoUnidade;
    }

    public String getResponsavelDocumentacaoNome() {
        return responsavelDocumentacaoNome;
    }

    public void setResponsavelDocumentacaoNome(String responsavelDocumentacaoNome) {
        this.responsavelDocumentacaoNome = responsavelDocumentacaoNome;
    }

    public Date getResponsavelDocumentacaoData() {
        return responsavelDocumentacaoData;
    }

    public void setResponsavelDocumentacaoData(Date responsavelDocumentacaoData) {
        this.responsavelDocumentacaoData = responsavelDocumentacaoData;
    }

    public String getLocalProducaoLocalizacao() {
        return localProducaoLocalizacao;
    }

    public void setLocalProducaoLocalizacao(String localProducaoLocalizacao) {
        this.localProducaoLocalizacao = localProducaoLocalizacao;
    }

    public String getCategoriaObjeto() {
        return categoriaObjeto;
    }

    public void setCategoriaObjeto(String categoriaObjeto) {
        this.categoriaObjeto = categoriaObjeto;
    }

    public String getExtensaoArquivo() {
        return extensaoArquivo;
    }

    public void setExtensaoArquivo(String extensaoArquivo) {
        this.extensaoArquivo = extensaoArquivo;
    }

    public String getCategoriaReferencia() {
        return categoriaReferencia;
    }

    public void setCategoriaReferencia(String categoriaReferencia) {
        this.categoriaReferencia = categoriaReferencia;
    }

    public String getResponsavelEdicao() {
        return responsavelEdicao;
    }

    public void setResponsavelEdicao(String responsavelEdicao) {
        this.responsavelEdicao = responsavelEdicao;
    }

    public String getQualidadeDados() {
        return qualidadeDados;
    }

    public void setQualidadeDados(String qualidadeDados) {
        this.qualidadeDados = qualidadeDados;
    }

    public String getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String autorizacao) {
        this.autorizacao = autorizacao;
    }

    public String getOrigemDosDados() {
        return origemDosDados;
    }

    public void setOrigemDosDados(String origemDosDados) {
        this.origemDosDados = origemDosDados;
    }

    public String getAquisicao() {
        return aquisicao;
    }

    public void setAquisicao(String aquisicao) {
        this.aquisicao = aquisicao;
    }

    public String getEmpresaProdutora() {
        return empresaProdutora;
    }

    public void setEmpresaProdutora(String empresaProdutora) {
        this.empresaProdutora = empresaProdutora;
    }

    public String getLocalProducaoCidade() {
        return localProducaoCidade;
    }

    public void setLocalProducaoCidade(String localProducaoCidade) {
        this.localProducaoCidade = localProducaoCidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArquivo != null ? idArquivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arquivo)) {
            return false;
        }
        Arquivo other = (Arquivo) object;
        if ((this.idArquivo == null && other.idArquivo != null) || (this.idArquivo != null && !this.idArquivo.equals(other.idArquivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Arquivo[ idArquivo=" + idArquivo + " ]";
    }

}
