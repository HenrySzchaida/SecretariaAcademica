/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.utils;

import br.com.modelo.Aluno;
import br.com.modelo.Curso;
import br.com.modelo.Disciplina;
import br.com.modelo.Professor;
import br.com.modelo.Turma;
import java.util.ArrayList;


public class GerenciadorDeArrays {

    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Turma> turmas = new ArrayList<Turma>();

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Curso curso) {
        this.cursos.add(curso);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Professor professor) {
        this.professores.add(professor);
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma turma) {
        this.turmas.add(turma);
    }
    
    

}
