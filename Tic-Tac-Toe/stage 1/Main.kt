package tictactoe

fun main() {
    val matrix: MutableList<MutableList<Char>> = MutableList(3){MutableList(3){'X'} }
    matrix[1][1] = 'O'
    for(i in matrix.indices){
        println(matrix[i].joinToString(""))}
}
