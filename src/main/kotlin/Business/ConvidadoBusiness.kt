package Business

import Entiny.Convidado

class ConvidadoBusiness {

    fun maiorDeIdade(idade: Int) = idade >= 18
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    // Simplificamos a leitura do codigo usando o metodo When ao inves do if().
    fun convidadoValido(convite: Convidado): Boolean {

        return when (convite.tipo) {
            "comum" -> {
                convite.codigo.startsWith("xt")
            }
            "premium", "luxo" -> {
                convite.codigo.startsWith("xl")
            }
            else -> {
                return false
            }
        }
    }

    /*  Esse era o if antigo que estavamos usando

        if (tipoConvite != null && tipoConvite != "") {

        tipoConvite = tipoConvite.lowercase()

        // validacao do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. convite invalido")
            return
        }
        */
}