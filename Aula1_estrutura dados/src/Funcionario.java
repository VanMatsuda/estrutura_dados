public class Funcionario {
    private String nome;
    private Float salario;
    
        public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getSalario() {
        return salario;
    }
    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float calcularINSS(){
        float salario1=0;
        if (salario <= 1412){
            salario1 =salario*0.075f;
            }   else if 
                (salario >1412.00 && salario <= 2666.68){
                salario1 = salario*0.09f;
            }   else if 
                (salario >2666.68 && salario <= 4000.03){
                salario1 = salario*0.12f;
            }   else if 
                (salario >4000.03 && salario <=7786.02){
                salario1 = salario*0.14f;
            } 
        return salario1;    
    } 
}
