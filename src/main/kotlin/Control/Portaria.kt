package Control

class Portaria {

    fun controle() {
        // aqui ponhamos o Console em uso
        val idade = Console.leituraInt("Qual a sua idade? ")
        if (idade < 18) {
           println("Negado. Menores não são permitidos!")
            return
        }

        val tipoConvite = Console.leituraString("Qual seu tipo de convite? ")
        println(tipoConvite)
    }



}
fun portaria() {

    /*println("Qual a sua idade? ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Convite invalido.")
            // o return para o codigo, ou seja, nao pede as outras verificações e ja mata ali mesmo caso o usuario seja de menor.
            return
        }
    }*/

    println("Qual seu tipo de convite? ")

    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {

        tipoConvite = tipoConvite.lowercase()

        // validacao do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. convite invalido")
            return
        }

        println("Qual o codigo do convite? ")

        var codigo = readLine()

        if (codigo != null && codigo != "") {

            codigo = codigo.lowercase()

            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")

            } else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigo.startsWith("xl")) {
                println("Welcome :)")

            } else {
                println("Negado. Entiny.Convite invalido.")
            }
        }

    }


}