package br.com.nfdev.glammanager_api.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "glm_cat")
public class Categoria implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 500)
    private String descricao;

    @Column(name = "dt_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "dt_alteracao")
    private LocalDateTime dataAlteracao;

    @Column(name = "usr_criacao")
    private String usuarioCriacao;

    @Column(name = "usr_alteracao")
    private String usuarioAlteracao;

    public Categoria() { }

    public Categoria(long id, String descricao, LocalDateTime dataCriacao, LocalDateTime dataAlteracao,
            String usuarioCriacao, String usuarioAlteracao) {
        this.id = id;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.usuarioCriacao = usuarioCriacao;
        this.usuarioAlteracao = usuarioAlteracao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDateTime dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public void setUsuarioCriacao(String usuarioCriacao) {
        this.usuarioCriacao = usuarioCriacao;
    }

    public String getUsuarioAlteracao() {
        return usuarioAlteracao;
    }

    public void setUsuarioAlteracao(String usuarioAlteracao) {
        this.usuarioAlteracao = usuarioAlteracao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Categoria other = (Categoria) obj;
        if (id != other.id)
            return false;
        return true;
    }
    
}
