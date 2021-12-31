package digital.innovation.one.sayajin;

import java.util.Objects;

public class SuperSayajinJava {
        private String nome;
        private String raça;
        private Integer idade;
        private Integer poder;

    public SuperSayajinJava() {}

    public SuperSayajinJava(String nome, String raça, Integer idade, Integer poder) {
        this.nome = nome;
        this.raça = raça;
        this.idade = idade;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getPoder() {
        return poder;
    }

    public void setPoder(Integer poder) {
        this.poder = poder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperSayajinJava that = (SuperSayajinJava) o;
        return Objects.equals(nome, that.nome) && Objects.equals(raça, that.raça) && Objects.equals(idade, that.idade) && Objects.equals(poder, that.poder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, raça, idade, poder);
    }

    @Override
    public String toString() {
        return "SuperSayajinJava{" +
                "nome='" + nome + '\'' +
                ", raça='" + raça + '\'' +
                ", idade=" + idade +
                ", poder=" + poder +
                '}';
    }
}
