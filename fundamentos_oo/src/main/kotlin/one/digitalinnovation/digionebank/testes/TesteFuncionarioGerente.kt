package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import java.math.BigDecimal

fun main() {
    val maria = Gerente(nome = "Maria", cpf = "012.855.333.13", salario = 5000.0, senha = "123")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}