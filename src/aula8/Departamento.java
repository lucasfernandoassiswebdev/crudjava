//@author LUCASFERNANDODEASSIS
package aula8;

import java.util.ArrayList;

public class Departamento {

    private int Codigo;
    private String Nome;
    ArrayList<Funcionario> ListaFunc;

    public Departamento() {
        ListaFunc = new ArrayList();
    }

    public Departamento(int Codigo, String Nome) {
        ListaFunc = new ArrayList();
        this.Codigo = Codigo;
        this.Nome = Nome;
    }

    public int getCodigo() {
        return this.Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Funcionario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }

    public void addFunc(Funcionario F) {
        F.setDep(this);
        ListaFunc.add(F);
    }
}
