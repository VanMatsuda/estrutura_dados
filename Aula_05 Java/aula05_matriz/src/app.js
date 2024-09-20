//declarando matriz vazia
let minha_matriz = [[],[]]

let minha_matriz2 = []

//declarando e inicializando a matriz
let minha_matriz3 = [[1,2],[3,4],[5,6]] //matriz 3x2  --numeros inteiros

console.log(minha_matriz3)

//matriz mista
let obj = { "nome": "Diego", "idade ": 30}
let matriz_mista = [["Vanessa","25"],[1,10.5],[true,false],[null, obj]] //4x2 - matriz mista

console.log(matriz_mista)

//acessando valores
console.log(minha_matriz3 [2][1]) //primeiro colchete linha e segundo a coluna (neste exemplo acessou o ultimo elemento)
console.log(minha_matriz3 [0][0]) // acessou o primeiro elemento

//acessando mais de uma matriz dentro do console.log
console.log(minha_matriz3+ "  "+minha_matriz3)

//matriz com quantidade de colunas diferentes
let minha_matriz_tam_diff = [[1],[2,3,4,5,6],[7,8,9,10,11],[12,13],[14]]
console.log(minha_matriz_tam_diff)

//verificar o tamanho da matriz
let qtd_linhas = minha_matriz_tam_diff.length
console.log(qtd_linhas)

let qtd_colunas = minha_matriz_tam_diff[1].length
console.log(qtd_colunas)

//adicionar elementos na matriz após a sua criação
let minha_matriz4 = [[1,2],[3,4]] //2x2
minha_matriz4.splice (2,0, [5])//adicionando uma linha no meio da matriz []utiliza para adicionar um vetor/linha
minha_matriz4.splice (3,0, [6,7,8])//adicionando uma linha e coluna no fim da matriz

minha_matriz4.push([9,10]) //push adiciona linha no fim da matriz

//adicionando elementos para uma linha especifica
minha_matriz4[1].push(0)
minha_matriz4[4].push(11)
console.log(minha_matriz4)

//removendo uma determinada linha da matriz
minha_matriz_tam_diff.splice(0,0) //entre parenteses pq esta informando a posição da linha
console.log(minha_matriz_tam_diff)

//removendo a última linha da matriz
minha_matriz_tam_diff.pop()
console.log(minha_matriz_tam_diff)

//removendo o último elemento da linha da matriz
minha_matriz4[0].pop()
console.log(minha_matriz4)

//removendo o elemento de uma determinada linha da matriz
minha_matriz4[1].splice(1,1)
console.log(minha_matriz4)

//interando uma matriz
// l = linha
for(let l = 0;l<minha_matriz4.length; l++){
    for (let c = 0 ; c < minha_matriz4[l].length; c++){
        console.log(minha_matriz4[l][c]+"")
    }
}