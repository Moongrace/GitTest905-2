fun main() {
    println("Изменения перед fork-ом")
    a()

    //Изменения, сделанные после fork
    println("Я что-то поменяю в проекте, пока Максим меняет что-то в своей версии")
}