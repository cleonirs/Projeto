package com.mycompany.uc15_atividade;

import com.mycompany.uc15_atividade.persistencia.JPAUtil;

/**
 *
 * @author cleonirlopes Inclusao de comentario no GIT
 */
public class UC15_Atividade {

    public static void main(String[] args) {
        JPAUtil.conectar();
        JPAUtil.desconectar();
    }
}
