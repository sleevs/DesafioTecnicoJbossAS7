package br.com.jsn.builder;



public class Director {

	


    public void cadastroBasico(Builder builder ,String nome,String email, String telefone,String experiencia){
        builder.setNome(nome);
        builder.setEmail(email);
        builder.setTelefone(telefone);
        builder.setExperiencia(experiencia);
    }
}
