package one.digitalinnovation.digionebank

class Analista(name: String,
               cpf: String,
               salario: Double
) : Funcionario(
    name,
    cpf,
    salario) {
    override fun calculoAuxilio() = salario * 0.10
}