package Control

class Console private constructor(){

    companion object {
        fun leituraInt(msg: String): Int {

            var retorno: Int? = null

            do {
                //faz a impressao da mensagem
                print(msg)
                // peço a informação
                val info = readLine()

                if (info != null && info != "") {
                    // retorna um nulo quando a string nao for valida
                    retorno = info.toIntOrNull()

                    if (retorno == null || retorno <= 0) {
                        println("Valor invalido! Digite Novamente.")
                    }

                } else {
                    println("Valor invalido! Digite Novamente.")
                }
            } while (retorno == null || retorno <= 0)

            return retorno
        }

        //LEITURA DA STRING
        fun leituraString(msg: String): String {

            var retorno: String? = null

            do {
                print(msg)
                val info = readLine()

                if (info != null && info != "") {
                    retorno = info.lowercase()

                } else {
                    println("Valor invalido! Digite Novamente.")
                }

            } while (retorno == null)

            return retorno
        }
    }

}