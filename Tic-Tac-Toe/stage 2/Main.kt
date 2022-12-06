fun main() {

    val matrix: MutableList<MutableList<Char>> = MutableList(5){MutableList(9){' '} }
    for (i in matrix.indices) {
        if (i in 1..3) continue
        for (j in matrix[i].indices) {
            matrix[i][j] = '-'
        }
    }


    for (i in matrix[matrix.lastIndex].indices){matrix[matrix.lastIndex][i] = '-'}


    for (i in 1 until matrix.indices.last){
        for (j in matrix[i].indices){if(j in 1..7)continue; matrix[i][j] = '|'}
    }
    val (a, b, c) = readln().chunked(3)
    matrix [1][2] = a[0]
    matrix [1][4] = a[1]
    matrix [1][6] = a[2]
    matrix [2][2] = b[0]
    matrix [2][4] = b[1]
    matrix [2][6] = b[2]
    matrix [3][2] = c[0]
    matrix [3][4] = c[1]
    matrix [3][6] = c[2]
    for(i in matrix.indices){
       println(matrix[i].joinToString(""))}
}
