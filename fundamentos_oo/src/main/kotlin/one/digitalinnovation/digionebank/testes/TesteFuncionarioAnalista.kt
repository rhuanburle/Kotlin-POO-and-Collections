package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val rhuan = Analista(name = "Rhuan", cpf = "012.655.333.12", salario = 2000.0)

    ImprimeRelatorioFuncionario.imprime(rhuan)
}