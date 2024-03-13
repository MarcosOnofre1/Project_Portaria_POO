package Control

import Business.ConvidadoBusiness
import Entiny.Convidado

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()
    init {
        println("Bem vindo(a) a Portaria.")
        println(controle())
    }
    private fun controle(): String {
        // aqui ponhamos o Console em uso
        val idade = Console.leituraInt("Qual a sua idade? ")
        val convidado = Convidado(idade = idade)

        if (!convidadoBusiness.maiorDeIdade(convidado.idade)) {
          return "Negado. Menores não são permitidos!"
        }

        convidado.tipo = Console.leituraString("Qual seu tipo de convite? ")
        if (!convidadoBusiness.tipoValido(convidado.tipo)){
           return "Negado. convite invalido!"
        }

        convidado.codigo = Console.leituraString("Qual o codigo do convite? ")
        if (!convidadoBusiness.convidadoValido(convidado)){
            return "Negado. convite invalido!"
        }

        return "Entrada efetuada com sucesso!"

    }

}